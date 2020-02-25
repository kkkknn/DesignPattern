package Factory;

public abstract class AudiFactory {
    //某车型的工厂方法
    public abstract <T extends AudiCar>T creatAudiCar(Class<T> tclass);
}
