package classes;

import com.phidget22.PhidgetException;
import com.phidget22.Stepper;

public class StepperMotor {

    private int motorID;
    private Stepper motor;

    public StepperMotor(int motorID) throws PhidgetException {
        this.motorID = motorID;
        this.motor = new Stepper();
        this.motor.open(5000);
        this.motor.setRescaleFactor(0.125);
    }

    public void move(float targetPosition) throws PhidgetException {
        if(!this.motor.getEngaged()) {this.motor.setEngaged(true);}
        this.motor.setTargetPosition(targetPosition);
    }

    public Stepper getMotor() {
        return this.motor;
    }

    public int getMotorID() {
        return this.motorID;
    }

}
