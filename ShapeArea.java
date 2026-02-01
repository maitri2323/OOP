class Shape {
    double d1;
    double d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape {

    double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {

    double area() {
        return d1 * d2;
    }
}

class ShapeArea {
    public static void main(String[] args) {
        System.out.println("Maitri Chauhan, 250393107003");

        Triangle t = new Triangle();
        t.getData(10, 5);
        System.out.println("Area of Triangle: " + t.area());

        Rectangle r = new Rectangle();
        r.getData(8, 6);
        System.out.println("Area of Rectangle: " + r.area());
    }
}