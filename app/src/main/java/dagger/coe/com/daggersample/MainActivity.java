package dagger.coe.com.daggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.coe.com.daggersample.MessageModule.DaggerIServiceComponent;
import dagger.coe.com.daggersample.MessageModule.EmailService;
import dagger.coe.com.daggersample.MessageModule.IServiceComponent;
import dagger.coe.com.daggersample.MessageModule.MessageServiceModule;
import dagger.coe.com.daggersample.VehicleModule.DaggerIVehicleComponent;
import dagger.coe.com.daggersample.VehicleModule.IVehicleComponent;
import dagger.coe.com.daggersample.NetworkAPIModule.NetworkApi;
import dagger.coe.com.daggersample.VehicleModule.Vehicle;
import dagger.coe.com.daggersample.VehicleModule.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;
    @Inject
    NetworkApi networkApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((DaggerSampleApplication) getApplication()).getComponent().inject(this);
        IVehicleComponent component = DaggerIVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        IServiceComponent component1 = DaggerIServiceComponent.builder().messageServiceModule(new MessageServiceModule(new EmailService())).build();
        component1.provideMessageService().processMessage("Hello.......","Sam");
        vehicle = component.provideVehicle();
        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
        boolean injected =  networkApi == null ? false : true;
        TextView userAvailable = (TextView) findViewById(R.id.txt1);
        userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
    }
}
