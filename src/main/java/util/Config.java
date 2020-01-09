package util;

import java.util.ResourceBundle;

public class Config {
    private final static String CONFIG_PATH = "config";

    private final static String PROPERTY_INTER_ARRIVAL_TIME = "inter_arrival_time";

    private static volatile Config instance = null;

    private ResourceBundle rb;

    public Config() {
        rb = ResourcesLoader.getBundle(CONFIG_PATH);
    }

    public static Config getInstance() {
        if (instance == null) {
            synchronized(Config.class) {
                if (instance == null) {
                    instance = new Config();
                }
            }
        }

        return instance;
    }

    public long getInterArrivalTime() {
        return Long.parseLong(rb.getString(PROPERTY_INTER_ARRIVAL_TIME));
    }
}
