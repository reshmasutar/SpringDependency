package LaptopDependencyEx;

public class GraphicsCard implements Laptop{
    @Override
    public void getType() {
        System.out.println("Graphics Card");
    }

    @Override
    public void getInfo() {
        System.out.println("Graphics Card Entered");

    }
}
