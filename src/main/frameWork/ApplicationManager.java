package main.frameWork;

import java.io.IOException;
import java.util.Properties;

public class ApplicationManager {

    private Properties properties;
    private ContactHelper contactHelper;
    private ProcessHelper processHelper;
    private static ApplicationManager singleton;
    private AutoItHelper autoItHelper;


    public static ApplicationManager getInstance(Properties properties) throws IOException {
        if(singleton == null){
            singleton = new ApplicationManager();
            singleton.setProperties(properties);
            singleton.start();
        }
        return singleton;
    }

    public void start() throws IOException {
        getProcessHelper().startAppUnderTest();
    }

    public void stop() {
        getProcessHelper().stopAppUnderTest();
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    public String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    public ProcessHelper getProcessHelper() {
        if(processHelper == null){
            processHelper = new ProcessHelper(this);

        }
        return processHelper;
    }
    public ContactHelper getContactHelper() {
        if(contactHelper == null){
            contactHelper = new ContactHelper(this);

        }
            return contactHelper;
    }
    public AutoItHelper getAutoItHelper() {

        if(autoItHelper == null){
            autoItHelper = new AutoItHelper(this);

        }
        return autoItHelper;
    }

}
