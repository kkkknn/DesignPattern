package ProxyPattern;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        /* 静态代理
        //构造一个小民————
        ILawsuit xiaomin=new XiaoMin();
        //构造一个代理律师并将小民作为构造参数传递进去
        ILawsuit lawyer=new Lawyer(xiaomin);
        //律师提交诉讼申请
        lawyer.submit();
        //律师进行举证
        lawyer.burden();
        //律师代替小民进行辩护
        lawyer.defend();
        //完成诉讼
        lawyer.finish();*/

        //----动态代理
        //构造一个小民
        ILawsuit xiaomin=new XiaoMin();
        //构造一个动态代理
        DynamicProxy proxy=new DynamicProxy(xiaomin);
        //获取被代理类小民的classloader
        ClassLoader loader=xiaomin.getClass().getClassLoader();
        //动态构造一个代理者律师
        ILawsuit lawyer= (ILawsuit) Proxy.newProxyInstance(loader,new Class[]{ILawsuit.class},proxy);
        //律师提交诉讼申请
        lawyer.submit();
        //律师进行指证
        lawyer.burden();
        //律师代替小民进行辩护
        lawyer.defend();
        //完成诉讼
        lawyer.finish();
    }
}
