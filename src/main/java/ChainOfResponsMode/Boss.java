package ChainOfResponsMode;

public class Boss extends Leader {
    public int limit() {
        return Integer.MAX_VALUE;
    }

    public void handler(int m) {
        System.out.println("老板批复"+m+"元");
    }
}
