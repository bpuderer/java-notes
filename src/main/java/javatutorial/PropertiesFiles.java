package javatutorial;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFiles {

    public static void main(String[] args) {

        // using Apache Commons Configuration which supports Variable Interpolation
        // https://commons.apache.org/proper/commons-configuration/userguide/howto_basicfeatures.html
        Configurations configs = new Configurations();
        try {
            Configuration config = configs.properties(new File("test.properties"));
            System.out.println(config.getString("db.user"));
            System.out.println(config.getString("some_endpoint"));
        }
        catch (ConfigurationException e) {
            e.printStackTrace();
        }


        // plain java.util.Properties
        // https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        // Example from: https://mkyong.com/java/java-properties-file-examples/
        try (InputStream input = PropertiesFiles.class.getClassLoader().getResourceAsStream("test.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find test.properties");
                return;
            }

            prop.load(input);
            System.out.println(prop.getProperty("db.user"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
