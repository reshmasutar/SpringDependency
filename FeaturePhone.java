package domain;

public class FeaturePhone implements Mobile{

    private SimCard card;

    //setter
    public void setCard(SimCard card) {
        this.card = card;
    }

    @Override
    public void getType() {
        System.out.println("MOBILE TYPE IS A FEATURE PHONE");

    }

    @Override
    public void getSimInfo() {
        card.getComapny();

    }
}
