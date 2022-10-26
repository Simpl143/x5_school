package ru.x5.school.first_program;

import java.util.HashMap;
import java.util.Map;

public class MyProgram {
    public static void main(String[] args) {

        HashMap<Integer, String> idAndNames = new HashMap<>();

        idAndNames.put(963913, "Pavel Moiseev");
        idAndNames.put(453453, "Alex Ivanov");
        idAndNames.put(657464, "Olga Frolova");
        idAndNames.put(457623, "Liza Bataeva");

        for(Map.Entry entry: idAndNames.entrySet()){

            System.out.println(entry);
        }

    }

}
