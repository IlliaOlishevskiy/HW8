public class Trapeze extends Shape implements FigureArea{
    public Trapeze(int a, int b, int h){
        super("Trapeze");
        this.a = a;
        this.b = b;
        this.h = h;

    }
    private int a;
    private int b;
    private int h;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    @Override
    public double area() {
        return 0.5*(a+b)*h;
    }
}
