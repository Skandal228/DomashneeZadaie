package Lesson12_if_else;

public class Student {
    String name;
    int count;
    int age;

    Student(String name, int count, int age) {
        this.name = name;
        this.count = count;
        this.age = age;
    }

    public static void sravnenie(Student st1, Student st2) {
        if (st1.equals(st2)) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Cтуденты не равны");
        }
    }

    public static void sravnenieAtributov(Student st1, Student st2) {
        if (st1.name == st2.name) {
            System.out.println("Имена схожи");
        } else if (st1.count == st2.count) {
            System.out.println("Курс студентов не совпадает");
        } else if (st1.age == st2.age) {
            System.out.println("Возраст студентов  совпадает");
        } else {
            System.out.println("Студенты полностью совпадают");
        }

    }
}
class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Valera", 1, 18);
        Student st2 = new Student("Venera", 2, 18);

            Student.sravnenie(st1,st2);
            Student.sravnenieAtributov(st1,st2);


        }
    }


