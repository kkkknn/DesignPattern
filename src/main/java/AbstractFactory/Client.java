package AbstractFactory;

import AbstractFactory.car.q3.Q3Factory;
import AbstractFactory.car.q7.Q7Factory;

public class Client {
    public static void main(String[] args) {
        //构造一个生产Q3的工厂
        CarFactory factoryQ3=new Q3Factory();
        factoryQ3.creatTire().tire();
        factoryQ3.creatBrake().brake();
        factoryQ3.creatEngine().engine();

        System.out.println("--------------------------");

        //构造一个生产Q7的工厂
        CarFactory factoryQ7=new Q7Factory();
        factoryQ7.creatEngine().engine();
        factoryQ7.creatBrake().brake();
        factoryQ7.creatTire().tire();

    }
}
