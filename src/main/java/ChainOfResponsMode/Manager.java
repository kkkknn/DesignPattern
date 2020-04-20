package ChainOfResponsMode;

public class Manager extends Leader {
    public int limit() {
        return 10000;
    }

    public void handler(int m) {
        System.out.println("经理批复"+m+"元");
    }
}
