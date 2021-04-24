package week10;

public class SubaruOutback implements Car{
    private double charge;
    
    public SubaruOutback() {
        charge =0;
    }

    @Override
    public void drive(double miles) {
        charge -= miles;
        
    }

    @Override
    public void changeTires() {
        System.out.println("Changed Suburu Tires.");       
    }
    
    public void playGame() {
        System.out.println("Played tic tac toe.");
    }


}
