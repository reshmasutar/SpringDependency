package LaptopDependencyEx;

public class Acer implements Laptop{

    //HAS-A
    GraphicsCard gc;
    Ram r1;

    public Acer(GraphicsCard gc, Ram r1) {
        this.gc = gc;
        this.r1 = r1;
    }

    @Override
    public void getType() {
        System.out.println("LAPTOP TYPE IS A ACER");
    }

    @Override
    public void getInfo() {
        r1.getType();
        r1.getInfo();
        gc.getType();
        gc.getInfo();
    }
}
