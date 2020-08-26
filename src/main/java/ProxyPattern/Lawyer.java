package ProxyPattern;

public class Lawyer implements ILawsuit {
    private ILawsuit lawsuit;

    public Lawyer(ILawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

    public void submit() {
        lawsuit.submit();
    }

    public void burden() {
        lawsuit.burden();
    }

    public void defend() {
        lawsuit.defend();
    }

    public void finish() {
        lawsuit.finish();
    }
}
