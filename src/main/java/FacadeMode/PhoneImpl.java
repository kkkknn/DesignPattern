package FacadeMode;

public class PhoneImpl implements Phone {
    public void dail() {
        System.out.println("打电话");
    }

    public void hangup() {
        System.out.println("挂断");
    }
}
