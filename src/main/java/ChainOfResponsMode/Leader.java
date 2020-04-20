package ChainOfResponsMode;

public abstract class Leader {
    protected Leader nextHandler;//上一级领导处理者

    //处理报账请求
    public final void handlerRequest(int money){
        if(money <= limit()){
            handler(money);
        }else{
            if(null!=nextHandler){
                nextHandler.handlerRequest(money);
            }
        }
    }

    //自身能批复的额度权限
    public abstract int limit();
    //处理报账行为
    public abstract void handler(int m);

}
