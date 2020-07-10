package MementoPattern;

//使命召唤游戏
public class CallOfDuty {
    private int mCheckpoint=1;
    private int mLifeValue=100;
    private String mWeapon="沙漠之鹰";
    //玩游戏
    public void play(){
        System.out.println("玩游戏："+String.format("第%d关",mCheckpoint)+"奋战杀敌中");
        mLifeValue-=10;
        System.out.println("进度升级了");
        mCheckpoint++;
        System.out.println("到达"+String.format("第%d关",mCheckpoint));
    }
    //退出游戏
    public void quit(){
        System.out.println("----------");
        System.out.println("退出游戏前属性："+this.toString());
        System.out.println("退出游戏");
        System.out.println("----------");
    }
    //创建备忘录
    public Memoto createMemoto(){
        Memoto memoto=new Memoto();
        memoto.mCheckpoint=mCheckpoint;
        memoto.mLifeValue=mLifeValue;
        memoto.mWeapon=mWeapon;
        return memoto;
    }
    //恢复游戏
    public void restore(Memoto memoto){
        this.mCheckpoint=memoto.mCheckpoint;
        this.mLifeValue=memoto.mLifeValue;
        this.mWeapon=memoto.mWeapon;
        System.out.println("恢复游戏后的属性："+this.toString());
    }

    public int getmCheckpoint() {
        return mCheckpoint;
    }

    public void setmCheckpoint(int mCheckpoint) {
        this.mCheckpoint = mCheckpoint;
    }

    public int getmLifeValue() {
        return mLifeValue;
    }

    public void setmLifeValue(int mLifeValue) {
        this.mLifeValue = mLifeValue;
    }

    public String getmWeapon() {
        return mWeapon;
    }

    public void setmWeapon(String mWeapon) {
        this.mWeapon = mWeapon;
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
