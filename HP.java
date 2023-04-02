package LaptopDependencyEx;

public class HP implements Laptop{

    private GraphicsCard gc;
    private Ram r1;

    public void setGc(GraphicsCard gc) {
        this.gc = gc;
    }

    public void setR1(Ram r1) {
        this.r1 = r1;
    }

    @Override
    public void getType() {
        System.out.println("Type is a HP");

    }

    @Override
    public void getInfo() {
        gc.getType();
        gc.getInfo();
        r1.getType();
        r1.getInfo();
    }
}
