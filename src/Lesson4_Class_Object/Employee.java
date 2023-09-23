package Lesson4_Class_Object;

public class Employee {
    String surname;
    int id;
    int age;
    int salary;
    String departament;

     Employee(String surename2, int id2, int age2, int salary2, String departament2) {
        surname = surename2;
        id = id2;
        age = age2;
        salary = salary2;
        departament = departament2;
    }

    int premia() {
        salary *= 2;
        return salary;
    }

}
    class EmployeeTest{
        public static void main(String[] args) {

            Employee emp1 = new Employee("Petrov", 1, 18, 500, "IT");
            Employee emp2 = new Employee("Ivanov", 2, 19, 600, "Snabzhenie");
            System.out.println("Зарплата увеличелась на: " + emp1.premia());
            System.out.println("Зарплата увеличелась на: " + emp2.premia());



        }
}