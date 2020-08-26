package ProxyPattern;

public class XiaoMin implements ILawsuit {
    public void submit() {
        System.out.println("老板拖欠工资，特此申请仲裁");
    }

    public void burden() {
        System.out.println("这是合同书和过去一年的银行工资流水");
    }

    public void defend() {
        System.out.println("证据确凿，不需要在说什么了");
    }

    public void finish() {
        System.out.println("诉讼成功，判决老板即日起七天内结算工资");
    }
}
