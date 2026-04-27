class Rectangle {
double width, height;

Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
}

double getArea() {
    return width * height;
}

double getPerimeter() {
    return 2 * (width + height);
}

void display() {
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
    System.out.println("Area: " + getArea());
    System.out.println("Perimeter: " + getPerimeter());
}

}

public class Pr9 {
public static void main(String[] args) {
Rectangle r1 = new Rectangle(4, 40);
Rectangle r2 = new Rectangle(3.5, 35.9);

    r1.display();
    r2.display();

    if (r1.getArea() > r2.getArea()) {
        System.out.println("Rectangle 1 has larger area");
    } else if (r1.getArea() < r2.getArea()) {
        System.out.println("Rectangle 2 has larger area");
    } else {
        System.out.println("Both rectangles have equal area");
    }
}
}