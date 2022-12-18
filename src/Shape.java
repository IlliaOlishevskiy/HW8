public class Shape {
    public Shape(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void printName(){
        System.out.println(name);
    }
}
