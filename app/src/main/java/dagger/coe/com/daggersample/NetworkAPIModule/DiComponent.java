package dagger.coe.com.daggersample.NetworkAPIModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.coe.com.daggersample.MainActivity;

/**
 * Created by sachin.gurnaney on 05-07-2016.
 */
@Singleton
@Component(modules = {NetworkApiModule.class})
public interface DiComponent {
    // to update the fields in your activities
    void inject(MainActivity activity);
}
