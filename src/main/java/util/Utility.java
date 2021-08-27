package util;

import model.Person;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Utility {

    Properties properties = new Properties();

    public Properties loadPropertyFile(String fileName) throws IOException {

        InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        properties.load(is);
        return properties;
    }

    public Set<Object> getAllKeys(){
        Set<Object> keys = properties.keySet();
        return keys;
    }

    public void printAllKeys(Properties properties){

        Set<Object> keys= properties.keySet();
        for(Object k: keys){
            String keyString= (String) k;
            String keyValue= properties.getProperty(keyString);
            System.out.println("Key: "+ keyString + ", KeyValue: "+ keyValue);

        }
    }

    public void forEachExample(){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(0);
        list.add(1);
        int[] array= {1, 2, 3, 4};
        for(int i :array){
            System.out.println(i);
        }

        for(Integer i: list){
            System.out.println(i);
        }

        ArrayList<String> listString= new ArrayList<>();
        listString.add("Ram");
        listString.add("Krishna");
        listString.add("Kuhu");

        for(String str :listString){
            System.out.println(str);

        }

        ArrayList<Person> houseMembers = new ArrayList<>();
//        int[] a = new int[4];
//        Person[] abc = new Person[4];

        Person personDaughter = new Person();
        personDaughter.setFirstName("Kuhu");
        personDaughter.setLastName("Koushik");
        personDaughter.setAddress("frisco");
        personDaughter.setAge(6);

        houseMembers.add(personDaughter);

        Person personSon = new Person();
        personSon.setFirstName("Krishna");
        personSon.setLastName("Koushik");
        personSon.setAge(2);
        personSon.setAddress("Frisco");

        houseMembers.add(personSon);

//        System.out.println(personDaughter.getFirstName() + " " + personDaughter.getLastName());
//        System.out.println(personSon.getFirstName() + " " + personSon.getLastName());

        for (Person p :houseMembers){
            System.out.println(p.getFirstName() + " " + p.getLastName());
            System.out.println(p.getAddress());
        }

    }

    public String getPropertyValue(String key){
        return this.properties.getProperty(key);
    }
}
