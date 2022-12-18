public class Triangle extends Shape implements FigureArea{
    public Triangle(int a, int h){
        super("Triangle");
        sizeA = a;
        sizeH = h;
    }

    private int sizeA;
    private int sizeH;

    public int getSizeA() {
        return sizeA;
    }

    public int getSizeH() {
        return sizeH;
    }

    @Override
    public double area() {
        return 0.5*sizeA*sizeH;
    }
}
