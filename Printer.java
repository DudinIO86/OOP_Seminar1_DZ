public class Printer {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println("Площадь круга: "+circle.calculateArea());
        System.out.println("Периметр круга: "+circle.calculatePerimeter());
        System.out.println();

        Rectangle rectangle=new Rectangle(5,10);
        System.out.println("Площадь прямоугольника: "+rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: "+rectangle.calculatePerimeter());
        System.out.println();

        Square square=new Square(5);
        System.out.println("Площадь квадрата: "+square.calculateArea());
        System.out.println("Периметр квадрата: "+square.calculatePerimeter());
        System.out.println();
    }
    
}
