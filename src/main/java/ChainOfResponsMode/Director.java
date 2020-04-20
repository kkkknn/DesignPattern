package ChainOfResponsMode;

public class Director extends Leader {
    public int limit() {
        return 5000;
    }

    public void handler(int m) {
        System.out.println("主管批复"+m+"元");
    }
}
