package pl.moduleApp.mn.domain;

import pl.moduleApp.base.external.event.EmailEvent;
import pl.moduleApp.base.external.event.UserEvent;

public class UserNotificationLogic {

    public EmailEvent generateMessageForCustomer(UserEvent userEvent){
        // read user data
        // calculate standard offers
        // calcualte vip offers
        // calculate season offers
        // combine all to one message
        return new EmailEvent(userEvent.getEmail(), "calcualted message for customer");
    }
}
