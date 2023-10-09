//------>   Shape.java (Abstract Class):

  public abstract class Shape {
    public abstract void draw();

    @Override
    public String toString() {
        return "This is a shape.";
    }
}

//------>   Square.java (Concrete Class):

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side length " + side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square with side length " + side;
    }
}

//------>  Rectangle.java (Concrete Class):

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle with length " + length + " and width " + width;
    }
}

//------>  Triangle.java (Concrete Class):

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle with base " + base + " and height " + height;
    }
}

//------>  ShapeLinkedList.java (Linked List Class):

public class ShapeLinkedList {
    private Node head;

    public void addShape(Shape shape) {
        Node newNode = new Node(shape);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Other methods like getters, setters, constructors, and toString here

    private class Node {
        Shape data;
        Node next;

        Node(Shape data) {
            this.data = data;
            this.next = null;
        }
    }
}
