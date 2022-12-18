public class Rectangle extends Shape implements FigureArea{
    public Rectangle(int sizeA, int sizeB){
        super("Rectangle");
        this.sizeA=sizeA;
        this.sizeB=sizeB;
    }

    private int sizeA;
    private int sizeB;

    public int getSizeA(){
        return sizeA;
    }

    public int getSizeB(){
        return sizeB;
    }

    @Override
    public double area() {
        return sizeA*sizeB;
    }
}
