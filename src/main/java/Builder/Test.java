package Builder;

import javax.crypto.Mac;

//测试代码
public class Test {
    public static void main(String[] args) {
        //构建器
        Builder builder=new MacbookBuilder();
        //director
        Director pcDirector=new Director(builder);
        //封装构建过程
        pcDirector.construct("因特尔主板","测试显示器");
        //构建计算机，输出相关信息
        System.out.println("computer info:"+builder.create().toString());
    }
}
