package Lesson8_modifiere_final_and_static;

public class Perviy {

    final static int umnojenie (int a, int b, int c){
        int u = a*b*c;
        return u;
    }
    final static void delenie (int d, int i){
        int del = d/i;
        int ost = d%i;
        System.out.println(del + "деление");
        System.out.println(ost + "остаток от деления");
    }
}
class PerviyTest {
    public static void main(String[] args) {
        Perviy pev1 = new Perviy();
        pev1.d


    }
}