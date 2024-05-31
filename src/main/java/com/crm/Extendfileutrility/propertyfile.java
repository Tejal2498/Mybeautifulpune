package com.crm.Extendfileutrility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {

 public String getdatafromproperty(String keyName) throws IOException { 
 
 FileInputStream fis = new FileInputStream("src\\test\\resources\\Dws.properties");
 Properties ps = new Properties();
 ps.load(fis);
 String value =ps.getProperty(keyName);
 return value;
}
}
