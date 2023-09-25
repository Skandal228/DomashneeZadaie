package Test_paketa_7;

class Employee {
    public static void main(String[] args) {

        Lesson7_Access_modifier.Employee emp5 = new Lesson7_Access_modifier.Employee("Ivanov",300, 500, 20, "id");
        Lesson7_Access_modifier.Employee emp6 = new Lesson7_Access_modifier.Employee (700);
        Lesson7_Access_modifier.Employee emp7 = new Lesson7_Access_modifier.Employee ("Vasilev");
        System.out.println(emp5.surname);
        System.out.println(emp5.premia());
        System.out.println();



    }
}
