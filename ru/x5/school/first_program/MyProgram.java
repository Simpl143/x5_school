package ru.x5.school.first_program;

public class MyProgram {
    public static void main(String[] args) {



        People pavel = new People("Pavel", "Moiseev", 28);


        People ivan = new Employee("Ivan", "Ivanov", 32, "x5", 154, 162);


        People jacob = new Employee("Jacob", "Johnson", 35, "x5", 456, 145);



        pavel.displayInfo();
        ivan.displayInfo();
        jacob.displayInfo();

    }

}
