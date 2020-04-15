package pl.moduleApp.base.external;

import pl.moduleApp.base.external.event.EmailEvent;
import pl.moduleApp.base.external.event.UserEvent;

public interface EventBus {

    void publishEmailEvent(EmailEvent e);
    void publishUserEvent(UserEvent e);
}
