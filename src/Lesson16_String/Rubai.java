package Lesson16_String;

public class Rubai {
    public static void email (String s){
        char c1= '@';
        char c2 ='.';
        for (int i = 0; i<s.length(); i++){
            if (i ==c1 && i==c2){
                System.out.println(s);

            }
        }



    }
}


class Test{
    public static void main(String[] args) {
        Rubai.email("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }
}