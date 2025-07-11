package SeleniumPOMFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
    private  static Properties props;
    public static void loadConfig() throws FileNotFoundException{
        try {
            props = new Properties();
            FileInputStream fis = new FileInputStream("src/main/java/SeleniumPOMFramework/config.properties");
            props.load(fis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public static String getConfig(String key){
        return props.getProperty(key);

    }

}
