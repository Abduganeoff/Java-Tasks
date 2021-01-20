package task10;

public class Computer  extends Calculator{

    public Computer(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        String mult =  x + "*" + y + "=" + (x*y) + "; ";
        String div =  x + "/" + y + "=" + (x/y) + "; ";
        return super.calculate(x, y) + mult + div;
    }
}
