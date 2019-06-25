package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    Map<String,List<String>> myMap;

    public PhoneBook(Map<String, List<String>> map) {
        myMap=map;

    }

    public PhoneBook()
    {
        myMap = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {

        List temp = new ArrayList<String>();
        temp.add(phoneNumber);
        myMap.put(name,temp);
    }

    public void addAll(String name, String... phoneNumbers) {
        List temp = new ArrayList<String>();
        temp.addAll(Arrays.asList(phoneNumbers));
        myMap.put(name,temp);


    }

    public void remove(String name) {
        myMap.remove(name);
    }

    public Boolean hasEntry(String name) {

        for (Map.Entry<String,List<String>> entry: myMap.entrySet()) {
           if( entry.getValue().contains(name)){
               return true;
           }

        }


        return myMap.containsKey(name);
    }

    public List<String> lookup(String name) {


        return myMap.get(name);
    }

    public String reverseLookup(String phoneNumber)  {

        for (Map.Entry<String, List<String>> entry : myMap.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;



    }

    public List<String> getAllContactNames() {
        List temp = new ArrayList();
        for (Map.Entry<String, List<String>> entry : myMap.entrySet()) {
            temp.add(entry.getKey());

            }

        return temp;
    }

    public Map<String, List<String>> getMap() {
        return myMap;
    }
}
