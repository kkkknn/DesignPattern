package Factory;

public  class Client {
    public static void main(String[] args) {
        AudiFactory audiFactory=new AudiCarFactory();
        AudiQ3 audiQ3=audiFactory.creatAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigation();
        AudiQ5 audiQ5=audiFactory.creatAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigation();
    }
}
