package main;

import config.Config;
import config.R;

import java.io.IOException;
import java.util.logging.Logger;

public class MainClass {

    private static String LOG_PROPERTY_FILE = R.Log.LOG_PROPERTY_FILE;
    private static Logger logger = Logger.getLogger("");

    public static void main(String[] args) throws IOException {

        Config config = new Config(LOG_PROPERTY_FILE);
        config.init();

        logger.info("Programm run....");
    }
}
