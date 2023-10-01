package Lesson16_String;

public class Mail {

    public static void email(String name){
        int a = 0; // @
        int b = 0; //.
        int c = 0; // ;

        while (c<name.length() -1){
            a= name.indexOf('@',c);
            b= name.indexOf('.',c);
            c = name.indexOf(';',c+1);
            System.out.println(name.substring(a+1, b));

        }

        }
    }


class MailTest {
    public static void main(String[] args) {
        Mail m1 = new Mail();
        Mail.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}
