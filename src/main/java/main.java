import classes.StepperMotor;
import com.phidget22.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws Exception {

        List<StepperMotor> motorArray = new ArrayList<StepperMotor>(); // ArrayList to store every created motor/
        for (int i=0;i!=7;i++) { // Attempts to make motor instances
            try {
                motorArray.add(new StepperMotor(i)); 
            } catch (Exception e) {
                System.out.println("Failed to create Motor " + (i)); // error handling
                e.printStackTrace();
            }
        }
    }
}
