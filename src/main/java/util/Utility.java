package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class Utility {

    Properties properties = new Properties();

    public Properties loadPropertyFile(String fileName) throws IOException {

        InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        properties.load(is);
        return properties;
    }

    public Set<Object> getAllKeys(){
        Set<Object> keys = properties.keySet();
        return keys;
    }

    public void printAllKeys(Properties properties){

        Set<Object> keys= properties.keySet();
        for(Object k: keys){
            String keyString= (String) k;
            String keyValue= properties.getProperty(keyString);
            System.out.println("Key: "+ keyString + ", KeyValue: "+ keyValue);

        }
    }

    public String getPropertyValue(String key){
        return this.properties.getProperty(key);
    }
}
