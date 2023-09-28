package Test_paketov;

public class Test1 {
    int a =1;
    static int b =2;

    static void abc (final int a) {
        System.out.println(a);
        System.out.println(Test1.b);

    }

    public static void main(String[] args) {
        abc(5);
    }
}

class Test3 {
    int a = 1;
    static int b=2;
    void abc (int a ){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        Test3 t3= new Test3();
        t3.abc(4);
    }
}
