public class Board {
    public static void main(String[] args) {
        Circle C1 = new Circle(25);
        Quad Q1 = new Quad(3);
        Rectangle R1 = new Rectangle(2,7);
        Trapeze T1 = new Trapeze(6,4,5);
        Triangle Tr1 = new Triangle(5,7);

        System.out.println("Імена об`єктів");
        System.out.println(C1.getName());
        System.out.println(Q1.getName());
        System.out.println(R1.getName());
        System.out.println(T1.getName());
        System.out.println(Tr1.getName());
        System.out.println();

        System.out.println("Параметри об`єктів");
        System.out.println("Радіус кола = " + C1.getRadius());
        System.out.println("Сторона квадарата = " + Q1.getSide());
        System.out.println("Перша сторона прямокутника = " + R1.getSizeA());
        System.out.println("Друга сторона прямокутника = " + R1.getSizeB());
        System.out.println("Перша основа трапеції = " + T1.getA());
        System.out.println("Друга основа трапеції = " + T1.getB());
        System.out.println("Висота трапеції = " + T1.getH());
        System.out.println("Основа трикутника = " + Tr1.getSizeA());
        System.out.println("Висота трикутника = " + Tr1.getSizeH());
        System.out.println();

        System.out.println("Площі об`єктів");
        System.out.println("Площа кола = " + C1.area());
        System.out.println("Площа квадрату = " + Q1.area());
        System.out.println("Площа прямокутника = " + R1.area());
        System.out.println("Площа трапеції = " + T1.area());
        System.out.println("Площа трикутника = " + Tr1.area());
    }
}
