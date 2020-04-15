package pl.moduleApp.base.external.event;

public class EmailEvent {

    public String email;
    public String message;

    public EmailEvent(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EmailEvent{" +
                "email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
