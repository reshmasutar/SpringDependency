package test;

public class DieselCar implements Car{
    //HAS-A
    DieselEngine engine;

    public DieselCar(DieselEngine engine) {
        this.engine = engine;
    }

    @Override
    public void getType() {
        System.out.println("Car type is a Diesel Car");
    }

    @Override
    public void getEngineInfo() {
        engine.getType();
    }
}
