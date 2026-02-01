class prac13 {
    double width;
    double height;

    prac13(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        System.out.println("Maitri Chauhan, 250393107003");

        prac13 r1 = new prac13(4, 40);
        prac13 r2 = new prac13(3.5, 35.9);

        System.out.println("\nRectangle 1");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\nRectangle 2");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nRectangle 1 has larger area");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("\nRectangle 2 has larger area");
        } else {
            System.out.println("\nBoth rectangles have equal area");
        }
    }
}