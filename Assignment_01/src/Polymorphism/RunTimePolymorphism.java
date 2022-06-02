package Polymorphism;

public class RunTimePolymorphism {
    class Shape {
        public void calculateArea() {
            System.out.println("Displays Area of Shape");
        }
    }
    class Triangle extends Shape {
        public void calculateArea(int h, int b) {
            System.out.println((1/2)*b*h);
        }
    }
    class Circle extends Shape {
        public void calculateArea(int r) {
            System.out.println((3.14)*r*r);
        }
    }
    class Rectangle extends Shape {
        public void calculateArea(int w, int l) {
            System.out.println(w*l);
        }
    }


}
