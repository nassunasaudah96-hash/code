public class GatewayConfig {
    private static GatewayConfig instance;  // lazy
    private final String apiKey;
    private final String smsGatewayUrl;
    private final String emailGatewayUrl;

    // Private constructor
    private GatewayConfig() {
        // Load from properties file or environment in real app
        this.apiKey = "demo-key-12345";
        this.smsGatewayUrl = "https://api.pesalink.com/sms";
        this.emailGatewayUrl = "https://api.pesalink.com/email";
        System.out.println("GatewayConfig initialized lazily");
    }

    public static GatewayConfig getInstance() {
        if (instance == null) {
            instance = new GatewayConfig();
        }
        return instance;
    }

    // Getters
    public String getApiKey() { return apiKey; }
    public String getSmsGatewayUrl() { return smsGatewayUrl; }
}