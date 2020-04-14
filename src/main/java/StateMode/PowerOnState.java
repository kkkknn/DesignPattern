package StateMode;

public class PowerOnState implements TvState {
    public void nextChannel() {
        System.out.println("下一频道");
    }

    public void prevChannel() {

        System.out.println("上一频道");
    }

    public void turnUp() {

        System.out.println("提高音量");
    }

    public void turnDown() {

        System.out.println("降低音量");
    }
}
