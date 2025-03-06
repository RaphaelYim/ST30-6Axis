import classes.StepperMotor;
import com.phidget22.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //Required for Text Input
import java.io.IOException;

public class main {

    public static void main(String[] args) throws Exception {

        List<StepperMotor> motorArray = new ArrayList<StepperMotor>();
        for (int i=0;i!=7;i++) {
            try {
                motorArray.add(new StepperMotor(i));
            } catch (Exception e) {
                System.out.println("Failed to create Motor " + (i));
            }
        }
    }
}