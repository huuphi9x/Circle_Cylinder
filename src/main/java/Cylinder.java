public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double radius,double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter()*height;
    }

    @Override
    public String toString() {
        return "The cylinder created with radius " + getRadius() + ", height " + height + " and " + (getColor() == null ? "no color" : "color with \"" + getColor() + "\" color");
    }

}
