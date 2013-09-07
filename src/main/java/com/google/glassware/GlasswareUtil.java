package com.google.glassware;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Utility class for the glassware.
 * 
 * @author bwnyasse
 */
public final class GlasswareUtil {

    private static final Logger LOG = Logger.getLogger(GlasswareUtil.class.getSimpleName());

    public static final String getAppEngineApplicationUrl(){
        FileInputStream authPropertiesStream;

        try {
            authPropertiesStream = new FileInputStream("./src/main/resources/oauth.properties");
            Properties authProperties = new Properties();
            authProperties.load(authPropertiesStream);
            return authProperties.getProperty("application_url");
        } catch (IOException e) {
            LOG.warning("Failed to retrieve the application url :" + e.getMessage());
        }
        
        return "";
    }
}
