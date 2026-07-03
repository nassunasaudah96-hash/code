// NotificationChannel interface
public interface NotificationChannel {
    void send(String message, String recipient);
}

// Concrete implementations
public class SmsChannel implements NotificationChannel {
    public void send(String message, String recipient) {
        System.out.println("SMS sent to " + recipient + ": " + message);
    }
}

public class EmailChannel implements NotificationChannel {
    public void send(String message, String recipient) {
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}

// Notifier using composition
public class Notifier {
    private final NotificationChannel[] channels;
    private final GatewayConfig config;

    public Notifier(GatewayConfig config, NotificationChannel... channels) {
        this.config = config;
        this.channels = channels;
    }

    public void sendNotification(String message, String recipient) {
        for (NotificationChannel channel : channels) {
            channel.send(message, recipient);
        }
    }
}