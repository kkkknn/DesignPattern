package ChainOfResponsMode;

public class GroupLeader extends Leader {
    public int limit() {
        return 1000;
    }

    public void handler(int m) {
        System.out.println("组长批复"+m+"元");
    }
}
