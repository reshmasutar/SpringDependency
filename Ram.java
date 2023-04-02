package LaptopDependencyEx;

public class Ram implements Laptop{
    @Override
    public void getType() {
        System.out.println("It is a Ram");

    }

    @Override
    public void getInfo() {
        System.out.println("4gb Ram is available");
    }
}
