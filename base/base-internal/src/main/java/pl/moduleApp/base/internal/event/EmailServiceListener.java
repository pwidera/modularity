package pl.moduleApp.base.internal.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.moduleApp.base.external.event.EmailEvent;

@Component
public class EmailServiceListener {

    @EventListener
    public void handleEmailEvent(EmailEvent emailEvent){
        // we do not yet have an external service for that
        System.out.println("Email send, data: " + emailEvent);
    }
}
