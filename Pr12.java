class Volume {
double calculateVolume(double side) {
return side * side * side;
}

double calculateVolume(double length, double width, double height) {
    return length * width * height;
}

double calculateVolume(float radius) {
    return (4.0 / 3.0) * Math.PI * radius * radius * radius;
}

}

public class Pr12 {
public static void main(String[] args) {
Volume v = new Volume();

    System.out.println("Cube Volume: " + v.calculateVolume(3));
    System.out.println("Rectangular Cube Volume: " + v.calculateVolume(4, 5, 6));
    System.out.println("Sphere Volume: " + v.calculateVolume(2.5f));
}

}