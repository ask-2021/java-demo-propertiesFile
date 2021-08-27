package test;

import util.Utility;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

public class TestCase1 {

    static String objPropertyFile = "object.properties";
    static String objTxtFile = "object.txt";

//    public static void main(String[] args) throws IOException, URISyntaxException {
//
//        Properties properties = new Properties();
//
//        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\object.txt");
//        properties.load(fileInputStream);
//        System.out.println(properties.getProperty("name"));
//        System.out.println(properties.getProperty("course"));
//        System.out.println(properties.getProperty("age"));
//        System.out.println(properties.getProperty("salary"));
//        properties.setProperty("name","Kuhu");
//        System.out.println(properties.getProperty("name"));
//        System.out.println(System.getProperty("user.dir"));
//
//        TestCase1 tc = new TestCase1();
//
//
//        System.out.println(properties.getProperty("name"));
//        System.out.println(properties.getProperty("course"));
//        System.out.println(properties.getProperty("age"));
//        System.out.println(properties.getProperty("salary"));
//        properties.setProperty("name","Kuhu");
//        System.out.println(properties.getProperty("name"));
//        System.out.println(System.getProperty("user.dir"));
//
//    }

    public static void main(String[] args) throws IOException {
        Utility utility = new Utility();
//        propertyExample(utility);
        utility.forEachExample();

    }

    private static void propertyExample(Utility utility) throws IOException {
        Properties properties = null;

//        properties = utility.loadPropertyFile(objPropertyFile);
//        utility.printAllKeys(properties);

        properties = utility.loadPropertyFile(objTxtFile);
        utility.printAllKeys(properties);
    }

}
