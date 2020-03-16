package AbstractFactory.car.q7;

import AbstractFactory.CarFactory;
import AbstractFactory.brake.IBrake;
import AbstractFactory.brake.SeriorBrake;
import AbstractFactory.engine.IEngine;
import AbstractFactory.engine.ImportEngine;
import AbstractFactory.tire.ITire;
import AbstractFactory.tire.SUVTire;

public class Q7Factory extends CarFactory {
    public ITire creatTire() {
        return new SUVTire();
    }

    public IEngine creatEngine() {
        return new ImportEngine();
    }

    public IBrake creatBrake() {
        return new SeriorBrake();
    }
}
