package dagger.coe.com.daggersample.MessageModule;

import javax.inject.Inject;

/**
 * Created by sachin.gurnaney on 13-06-2016.
 */
public class ProcessServices {

    protected IMessageService mMessageService;

    @Inject
    public ProcessServices(IMessageService messageService) {
        this.mMessageService = messageService;
    }

    public void processMessage(String message,String recipent){
        mMessageService.sendMessage(message,recipent);
    }
}
