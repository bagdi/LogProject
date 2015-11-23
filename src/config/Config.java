package config;

import org.apache.log4j.PropertyConfigurator;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static Properties logProperties = new Properties();
    private static String logFile = null;

    public Config(String logFile) {
        this.logFile = logFile;
    }

    public void init() throws IOException {
        // ��������� ���� ������������
        logProperties.load(new FileInputStream(logFile));
        // ��� ������ ����� ����������
        PropertyConfigurator.configure(logProperties);
    }

}
