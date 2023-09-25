package Lesson7_Access_modifier;

public class Employee {
    public String surname;
     public int id;
     public  int age;
   private int salary;
     public String departament;

    void method1 (){
        System.out.println("Фамилия: " + surname);
    }

    void method2(){
        System.out.println("Порядковый номер: " + id);
    }

    void method3(){
        System.out.println("Начисления ЗП: " + salary);
    }

    public Employee (String surename2, int id2, int age2, int salary2, String departament2) {
        surname = surename2;
        id = id2;
        age = age2;
        salary = salary2;
        departament = departament2;
    }

     public Employee (String surename3) {
        surname = surename3;
    }

     public Employee (int salary4){ /*private*/
        salary = salary4;
    }

    public int premia() {
        salary *= 2;
        return salary;
    }

}
 class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Petrov", 1, 18, 500, "IT");
        Employee emp2 = new Employee("Ivanov");
        Employee emp3 = new Employee (100);
        emp1.method1();
        emp1.method2();
        emp1.method3();
        System.out.println();
        emp2.method1();
        System.out.println();
        emp3.method3();



    }
}