package VisitorMode;


import java.util.Random;

public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public int getCodeLines(){
        return new Random().nextInt(10*10000);
    }


}
