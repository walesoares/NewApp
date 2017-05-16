package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Wale on 15/05/2017.
 */
public class PropertyReader {

    Properties properties = new Properties();
    InputStream inputStream = null;

    public PropertyReader() {
        loadProperties();
    }

    private void loadProperties() {

        try {
            inputStream = new FileInputStream("src/test/java/data/global.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }

}





