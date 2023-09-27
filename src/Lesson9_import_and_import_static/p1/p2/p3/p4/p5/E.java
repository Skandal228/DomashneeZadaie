package Lesson9_import_and_import_static.p1.p2.p3.p4.p5;

import static Lesson9_import_and_import_static.p1.p2.B.c1;
import static  Lesson9_import_and_import_static.p1.p2.p3.p4.D.*;
public class E {

    public static void primer() {
    int y2= c1;

        System.out.println(y2);
    }
}

class Etest{
    public static void main(String[] args) {
        E.primer();
    }
}


