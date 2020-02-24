package Builder;
//具体的computer类，Macbook
public class Macbook extends Computer {
    protected Macbook() {
    }

    @Override
    public void setOS() {
        mOS="Mac OS X 10.10";
    }
}
