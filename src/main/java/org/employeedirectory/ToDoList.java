package org.employeedirectory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToDoList {

    private List<String> tasks;

    public ToDoList() {
        this.tasks= new ArrayList<>();

    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public boolean isEmpty() {
        // Returns true if this list contains no elements.
        return tasks.isEmpty();
    }

    public void completeAllTasks(){
        // To obtain an Iterator, we call the .iterator() method from a Collection 'ArrayList'
        Iterator<String> iterator = tasks.iterator();
        // .hasNext(): Returns true if the iteration has more elements, otherwise false.
        while (iterator.hasNext()){
            // .next() : Returns the next element in the iteration.
            String task = iterator.next();
            System.out.println("Completing: " + task);
            // Removes from the underlying collection 'here it is the ArrayList'
            // the last element returned by this iterator '.next()'
            iterator.remove();

        }
    }
}