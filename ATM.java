package master;

public class ATM {
    private  Printer print;

    //setter injection

    public void setPrint(Printer print) {
        this.print = print;
    }

    public void getInfo(int accNo){
        print.printAccountBalance(accNo);
    }
}
