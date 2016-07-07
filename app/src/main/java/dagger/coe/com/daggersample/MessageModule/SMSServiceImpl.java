package dagger.coe.com.daggersample.MessageModule;

import javax.inject.Inject;

/**
 * Created by sachin.gurnaney on 13-06-2016.
 */
public class SMSServiceImpl implements IMessageService {
    @Inject
    public SMSServiceImpl() {
    }

    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send SMS
        System.out.println("SMS sent to "+rec+ " with Message="+msg);
    }
}
