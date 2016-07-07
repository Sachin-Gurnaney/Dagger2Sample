package dagger.coe.com.daggersample;

import android.app.Application;

import dagger.coe.com.daggersample.NetworkAPIModule.DaggerDiComponent;
import dagger.coe.com.daggersample.NetworkAPIModule.DiComponent;

/**
 * Created by sachin.gurnaney on 05-07-2016.
 */
public class DaggerSampleApplication extends Application {
    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent() {
        return component;
    }
}
