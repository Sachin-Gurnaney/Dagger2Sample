package dagger.coe.com.daggersample.VehicleModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sachin.gurnaney on 13-06-2016.
 */
@Module
public class VehicleModule {
    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
