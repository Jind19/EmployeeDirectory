package org.employeedirectory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeDirectory {
    private HashMap<Integer, String> directory;

    public EmployeeDirectory() {
        this.directory = new HashMap<>();
    }

    /**
     *  Add Items: to add items to HashMap, use the put() method.
     * */
    public void addEmployee(int id, String name) {
        this.directory.put(id, name);
    }

    /**
     * Access an Item: To access a value in the HashMap, use the get() method and refer to its key.
     * If we try to find a value for a key that doesn’t exist in the map, we’ll get a null value.
     * */
    public String getEmployee(int id) {
        return directory.get(id); // keys must always be unique
    }

    /**
     * Use the getOrDefault() method to get a value from the map
     * or return a default element in case there is no mapping for the given key.
     * */
    public String getEmployeeSafe(int id) {
        String defaultEmployee = "John Doe";
        return directory.getOrDefault(id, defaultEmployee); // keys must always be unique
    }

    /**
     * The containsKey() method returns true if an entry with the specified key exists in the map and false otherwise.
     * */
    public boolean hasEmployee(int id) {
        return directory.containsKey(id);
    }

    /**
     * Remove a value mapped by Key:
     * To remove a key-value mapping from the HashMap, use the remove() method and refer to the key.
     * If we try to remove a value by key that doesn’t exist in the map, we’ll get a null value.
     * */
    public String removeEmployee(int id){
        return this.directory.remove(id);
    }

    /**
     * iterate over all key-value pairs: print the employee id and name.
     * */
    public void displayEmployees(){
        //1- Prior to Java 8:

        // iterate over entries
        for(HashMap.Entry<Integer, String> entry: directory.entrySet()){
            int employeeId =entry.getKey();
            String employeeName = entry.getValue();

            System.out.println("Employee Number:"+employeeId+": "+employeeName);

        }

        // iterate over keys
        for(Integer key: directory.keySet()){
            String employeeName = directory.get(key);
            System.out.println("Employee Number:"+key+": "+employeeName);
        }

        // iterate over values: no keys provided
        List<String> employeesNames = new ArrayList<>(directory.values());
        for(String employeeName:employeesNames ){
            System.out.println("Employee Name:"+employeeName);
        }

        //2- As of Java 8:

        // 'forEach' method is the functional-style way to iterate over all elements in the map.
        directory.forEach(
                (key, value) -> System.out.println("Employee Number:"+key+" Employee Name: "+value)
        );


    }


}