public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(6, 7);
        cylinder.setColor("blue");
        System.out.println("The radius is: " + cylinder.getRadius());
        System.out.println(cylinder.toString());
        System.out.println("The area is " + cylinder.getArea());
    }
}