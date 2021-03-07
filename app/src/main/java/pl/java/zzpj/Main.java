package pl.java.zzpj;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main( String[] args )
    {
        Person p = new Person("Jan", "Karabińczyk");
        System.out.print(p);
        p.setName(getPersonNameProperty());
        System.out.print(p);
    }

    public static String getPersonNameProperty() {
        Properties properties = new Properties();
        String propertiesFileName = "config.properties";

        try(InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(propertiesFileName)) {
            properties.load(inputStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file : " + propertiesFileName);
            e.printStackTrace();
        }
        return properties.getProperty("name");
    }
}
