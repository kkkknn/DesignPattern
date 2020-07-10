package MementoPattern;

//Caretaker 管理类，负责管理Memoto
public class Caretaker {
    Memoto memoto;//备忘录
    //存档
    public void archive(Memoto memoto){
        this.memoto=memoto;
    }
    //获取存档
    public Memoto getMemoto(){
        return memoto;
    }
}
