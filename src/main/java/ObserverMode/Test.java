package ObserverMode;

public class Test {
    public static void main(String[] args) {
        DevTechFrontier devTechFrontier=new DevTechFrontier();

        Coder coder=new Coder("coder");
        Coder coder1=new Coder("coder1");
        Coder coder2=new Coder("coder2");
        Coder coder3=new Coder("coder3");

        devTechFrontier.addObserver(coder);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);

        devTechFrontier.postNewPublication("新一期的周报发布了");
    }
}
