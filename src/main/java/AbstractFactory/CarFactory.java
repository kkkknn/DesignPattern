package AbstractFactory;

import AbstractFactory.brake.IBrake;
import AbstractFactory.engine.IEngine;
import AbstractFactory.tire.ITire;

/* 抽象车场类*/
public abstract class CarFactory {
    //生产轮胎
    public abstract ITire creatTire();
    //生产发动机
    public abstract IEngine creatEngine();
    //生产制动系统
    public abstract IBrake creatBrake();
}
