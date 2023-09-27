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
        if (st1.name.equals(st2) && st1.age == st2.age && st1.count == st2.count) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Cтуденты не равны");
        }
    }

    public static void sravnenieAtributov(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {

            if (st1.age == st2.age) {

                if (st1.count == st2.count) {
                    System.out.println("Имена, курсы, оценки одинаковые");
                } else {
                    System.out.println("Имена и курс одинаковые, возраст различаются");
                }

            } else {
                System.out.println("Возраст одинаков, курсы и имена разные ");
            }
        }else {
            System.out.println("Все разное");}


    }
}

    class StudentTest {
        public static void main(String[] args) {
            Student st1 = new Student("Valera", 1, 18);
            Student st2 = new Student("Petr", 2, 18);

            Student.sravnenie(st1, st2);
            Student.sravnenieAtributov(st1, st2);


        }
    }




