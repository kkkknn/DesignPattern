package TemplatemethodMode;

public class Client {
    public static void main(String[] args) {
        AbstractComputer computer=new CoderComputer();
        computer.startUp();

        computer=new MilitaryComputer();
        computer.startUp();

    }
}
