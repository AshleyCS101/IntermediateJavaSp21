package week10;
import java.util.*;

public class Week10 {

    public static void main(String[] args) {
//        Car myCar = new SubaruOutback();
//        
//        myCar.drive(5);
//        myCar.changeTires();
//        myCar.drive(4);
        
        Driveable transport = new HondaCivic(); // treated as a Car, or Driveable
        transport.drive(5);
        // can't call refuel on a Driveable, no guarantee of a refuel() method
        
        transport = new Dog("Samuel");
        transport.drive(3);
    }

}
