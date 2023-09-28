package Test_paketov;

public class Student {
    int grade;

    Student ( int grade){
        this.grade=grade;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(7);

        if (st1.grade==2){
            System.out.println("Студент двоешник");
        } else if (st1.grade==3) {
            System.out.println("Студент троешник");
        }else if (st1.grade==4) {
            System.out.println("Студент хорошист");
        }else if (st1.grade==5) {
                System.out.println("Студент отличник");
        } else {
            System.out.println("Оценка не верна! Ошибка ввода!");}
    }
}
