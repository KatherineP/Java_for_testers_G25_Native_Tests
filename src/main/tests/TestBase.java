package main.tests;

import main.frameWork.ApplicationManager;
import org.testng.annotations.*;

import java.io.FileReader;
import org.testng.annotations.Optional;
import java.util.Properties;
import java.util.logging.Logger;

public class TestBase {
    protected Logger log = Logger.getLogger("TEST");

    protected ApplicationManager app;

    @BeforeClass
    @Parameters ({"configFile"})
    public void setUp(@Optional String configFile) throws Exception {
        if (configFile == null ) {
            configFile = System.getProperty("configFile");
        }
        if (configFile == null ) {
            configFile = System.getenv("configFile");
        }
        if (configFile == null ) {
            configFile = "application.properties";
        }

        Properties properties = new Properties();
        properties.load(new FileReader(configFile));
        log.info("setUp start");
        app = ApplicationManager.getInstance(properties);
        log.info("setUp end");
    }

    @AfterTest
    public void tearDown() throws Exception {
        log.info("tearDown start");
        ApplicationManager.getInstance(null).stop();
        log.info("TearDown end");
    }


}
