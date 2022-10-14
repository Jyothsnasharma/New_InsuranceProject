package com.Insurance.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {
 public Properties pro;

    public ReadConfig(){
        File src=new File(".\\Configuration\\config.properties");
        pro=new Properties();
        try {
            FileInputStream fis=new FileInputStream(src);
            pro.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getApplicationUrl(){
        String url=pro.getProperty("baseUrl");
        return  url;
    }
    public String getChromePath(){
        String chrome=pro.getProperty("chromePath");
        return chrome;
    }

        }

