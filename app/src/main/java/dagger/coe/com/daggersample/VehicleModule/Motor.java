package dagger.coe.com.daggersample.VehicleModule;

/**
 * Created by sachin.gurnaney on 13-06-2016.
 */
public class Motor {
    private int rpm;

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
