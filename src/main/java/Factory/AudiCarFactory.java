package Factory;

public class AudiCarFactory extends AudiFactory {
    public <T extends AudiCar> T creatAudiCar(Class<T> tclass) {
        AudiCar audiCar=null;
        try{
            audiCar=(AudiCar) Class.forName(tclass.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)audiCar;
    }
}
