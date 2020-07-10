package MementoPattern;

public class Client {
    public static void main(String[] args) {
        //构建对象
        CallOfDuty callOfDuty=new CallOfDuty();
        //打游戏
        callOfDuty.play();

        Caretaker caretaker=new Caretaker();
        //游戏存档
        caretaker.archive(callOfDuty.createMemoto());
        //退出游戏
        callOfDuty.quit();
        //恢复游戏
        CallOfDuty game=new CallOfDuty();
        game.restore(caretaker.getMemoto());
    }
}
