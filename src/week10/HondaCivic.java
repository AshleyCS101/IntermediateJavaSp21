package week10;

public class HondaCivic implements Car {    // a class "implements" an interface
    private static final double MILES_PER_GALLON = 35.0;
    private double gas; // gallons of gas
    
    public HondaCivic() {
        gas = 0;
    }

    @Override   // "override" the interface methods
    public void drive(double miles) {
        if(miles/MILES_PER_GALLON > gas) {
            System.out.println("Not enough gas to drive.");
            return;
        }
        
        gas -= miles/MILES_PER_GALLON;
        System.out.println("Putta put put. Drove " + miles + " miles.");
    }

    @Override
    public void changeTires() {
        System.out.println("Changed tires.");
    }
    
    // can have methods outside of the interface
    public void refuel(double gallons) {
        gas += gallons;
    }
}
