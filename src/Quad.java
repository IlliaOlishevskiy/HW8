public class Quad extends Shape implements FigureArea{
    public Quad(int side){
        super("Quad");
        this.side = side;
    }
    private int side;

    public int getSide() {
        return side;
    }

    @Override
    public double area() {
        return side*side;
    }
}
