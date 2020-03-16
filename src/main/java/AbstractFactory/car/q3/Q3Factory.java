package AbstractFactory.car.q3;

import AbstractFactory.CarFactory;
import AbstractFactory.brake.IBrake;
import AbstractFactory.brake.NomalBrake;
import AbstractFactory.engine.DomesticEngine;
import AbstractFactory.engine.IEngine;
import AbstractFactory.tire.ITire;
import AbstractFactory.tire.NormalTire;

public class Q3Factory extends CarFactory {
    public ITire creatTire() {
        return new NormalTire();
    }

    public IEngine creatEngine() {
        return new DomesticEngine();
    }

    public IBrake creatBrake() {
        return new NomalBrake();
    }
}
