package Lesson4_Class_Object;

public class Student {
    int numberSt;
    String name;
    String surname;
    int god;
    int srMath;
    int srEc;
    int srEng;
    int srAr;
    int formula (){
       srAr= (srMath + srEng + srEc)/3;
        return srAr;
        }

        void vivodSrAr (){
            System.out.println("Средняя арифметическая оценка студента: " + formula());

        }
}
    class StudentTest{
        public static void main(String[] args) {
            Student st1 = new Student ();
            st1.numberSt = 1;
            st1.god = 2005;
            st1.name = "Petr";
            st1.surname = "Petrov";
            st1.god = 2005;
            st1.srMath = 5;
            st1.srEc=5;
            st1.srEng=5;

            System.out.println("Номер: " + st1.numberSt);
            System.out.println("Фамилия: " + st1.surname);
            System.out.println("Имя: " + st1.name);
            System.out.println("Дата поступления: " + st1.god);
            System.out.println("Средняя оценка: " + (st1.srEc + st1.srEng+ st1.srMath)/3);
            st1.vivodSrAr();
            System.out.println();

            Student st2 = new Student ();
            st2.god = 2006;
            st2.name = "Ivan";
            st2.surname = "Ivanov";
            st2.numberSt =2;
            st2.srMath = 4;
            st2.srEc = 3;
            st2.srEng = 4;

            System.out.println("Номер: " + st2.numberSt);
            System.out.println("Фамилия: " + st2.surname);
            System.out.println("Имя: " + st2.name);
            System.out.println("Дата поступления: " + st2.god);
            System.out.println("Средняя оценка: " + (st2.srEc + st2.srEng+ st2.srMath)/3);

            st2.vivodSrAr();
            System.out.println();

            Student st3 = new Student ();
            st3.god = 2005;
            st3.name = "Sergey";
            st3.surname = "Ivanov";
            st3.numberSt =3;
            st3.srMath = 5;
            st3.srEc = 4;
            st3.srEng = 4;

            System.out.println("Номер: " + st3.numberSt);
            System.out.println("Фамилия: " + st3.surname);
            System.out.println("Имя: " + st3.name);
            System.out.println("Дата поступления: " + st3.god);
            System.out.println("Средняя оценка: " + (st3.srEc + st3.srEng+ st3.srMath)/3);
            st3.vivodSrAr();
            System.out.println();

        }
    }

