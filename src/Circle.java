public class Circle extends Shape implements FigureArea{
    public Circle(int radius){
        super("Circle");
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    private int radius;


    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
