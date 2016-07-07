package dagger.coe.com.daggersample.MessageModule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sachin.gurnaney on 13-06-2016.
 */
@Module
public class MessageServiceModule {

    private IMessageService mMessageService;

    public MessageServiceModule(IMessageService messageService) {
        mMessageService = messageService;
    }

    @Provides
    IMessageService provideEmailService() {
        return mMessageService;
    }
}
