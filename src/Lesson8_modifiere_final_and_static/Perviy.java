package Lesson8_modifiere_final_and_static;

public class Perviy {

    public static int umnojenie (int a, int b, int c){
        int u = a*b*c;
        return u;

    }
    public static void delenie (int d, int i){
        if (d%i==0){
            System.out.println("Результат деления " + d/i);
        }
        else {
            System.out.println("Результат деления " + d/i);
            System.out.println("Результат деления " + d%i);
        }


    }
}
class PerviyTest {
    public static void main(String[] args) {

        Perviy.delenie(5,2);
        System.out.println(Perviy.umnojenie(10,20,30));

    }
}