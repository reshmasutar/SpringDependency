package test;

public class PetrolCar implements Car{

    //Has-A
    PetrolEngine engine;

    public PetrolCar(PetrolEngine engine) {
        this.engine = engine;
    }

    @Override
    public void getType() {
        System.out.println("Car type is petrol car");
    }

    @Override
    public void getEngineInfo() {
        engine.getType();
    }
}
