package ru.x5.school.first_program;

import java.util.HashMap;
import java.util.Map;

public class MyProgram {
    public static void main(String[] args) {

        People pavel = new People("Pavel", "Moiseev", 28);

        People ivan = new Employee("Ivan", "Ivanov", 32, "x5", 154, 162);

        People jacob = new Employee("Jacob", "Johnson", 35, "x5", 456, 145);

        pavel.displayInfo();
        ivan.displayInfo();
        jacob.displayInfo();

//----------------------------------------------------------------------------
        //Creating map of MapEmployee

        Map<Integer, MapEmployee> map = new HashMap<Integer, MapEmployee>();

        //Creating MapEmployee

        MapEmployee e1 = new MapEmployee(435678, "Ivan", "x5", 43);
        MapEmployee e2 = new MapEmployee(678432, "Elena", "x5", 56);
        MapEmployee e3 = new MapEmployee(894356, "Alex", "x5", 34);

        //Adding MapEmployee to map

        map.put(1,e1);
        map.put(2, e2);
        map.put(3, e3);

        //Traversing map

        for(Map.Entry<Integer, MapEmployee> entry:map.entrySet()) {
            int key = entry.getKey();
            MapEmployee e = entry.getValue();

            System.out.println(key + "Detail:");

            System.out.println(e.id + " " + e.name + " " + e.company + " " + e.age);

        }



    }

}
