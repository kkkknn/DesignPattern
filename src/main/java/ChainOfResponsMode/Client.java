package ChainOfResponsMode;

public class Client {
    public static void main(String[] args) {
        GroupLeader groupLeader=new GroupLeader();
        Director director=new Director();
        Manager manager=new Manager();
        Boss boss=new Boss();

        //设置责任链
        groupLeader.nextHandler=director;
        director.nextHandler=manager;
        manager.nextHandler=boss;

        //发起报账申请
        groupLeader.handlerRequest(5000);
    }
}
