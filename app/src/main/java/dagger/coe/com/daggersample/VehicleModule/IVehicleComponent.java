package dagger.coe.com.daggersample.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sachin.gurnaney on 13-06-2016.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface  IVehicleComponent {
    Vehicle provideVehicle();
}
