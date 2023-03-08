package Cau_1;

public class Main {
    public static void main(String[] args) {
        Circle h1 = new Circle();
        Circle h2 = new Circle(3);

        System.out.println("Diện tích hình h1: "+ h1.getArea() +
                ", chu vi hình h1: " + h1.getCircumference());

        System.out.println("Diện tích hình h2: "+ h2.getArea() +
                ", chu vi hình h2: " + h2.getCircumference());
    }
}
