package dagger.coe.com.daggersample.MessageModule;

import dagger.Component;

/**
 * Created by sachin.gurnaney on 13-06-2016.
 */

@Component(modules = {MessageServiceModule.class})
public interface IServiceComponent {
    ProcessServices provideMessageService();
}
