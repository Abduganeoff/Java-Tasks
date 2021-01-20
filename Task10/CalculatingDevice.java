package task10;

public class CalculatingDevice {
    private String name;
    private double result;

    public CalculatingDevice(String name) {
        this.name = name;
    }

    public String calculate(double x, double y) {
        return this.name + ": " + x + "+" + y + "=" + (x+y) + "; ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void printRes(CalculatingDevice[] a, double x, double y) {

        for(CalculatingDevice c: a) {
            System.out.println(c.calculate(x, y));
        }
    }


}
