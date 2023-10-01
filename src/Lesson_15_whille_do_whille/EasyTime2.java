package Lesson_15_whille_do_whille;



public class EasyTime2 {
    public static void times2() {
        int chas = 0;

        do {
            int second =0;
            while (second<60);
            second++;
            int minute = 0;
            while (minute<60){
                System.out.println(chas+":"+minute+":"+second);
                minute++;
            }
            chas++;
        }while (chas<6);


    }
    }




    class EasyTime2Test{
        public static void main(String[] args) {

            EasyTime2.times2();
        }

}