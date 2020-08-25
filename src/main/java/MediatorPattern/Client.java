package MediatorPattern;

public class Client {
    public static void main(String[] args) {
        //构造主板对象
        MainBoard mainBoard=new MainBoard();
        //分别构造各个零部件
        CDDevice cdDevice=new CDDevice(mainBoard);
        CPU cpu=new CPU(mainBoard);
        GraphicsCard graphicsCard=new GraphicsCard(mainBoard);
        SoundCard soundCard=new SoundCard(mainBoard);

        //将各个零件安装到主板
        mainBoard.setCdDevice(cdDevice);
        mainBoard.setCpu(cpu);
        mainBoard.setGraphicsCard(graphicsCard);
        mainBoard.setSoundCard(soundCard);

        //完成之后就可以播放视频了
        cdDevice.load();
    }
}
