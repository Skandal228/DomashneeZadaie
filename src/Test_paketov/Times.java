package Test_paketov;

    public class Times {

    public void time() {

        OUTER: for (int chas = 0; chas <= 23; chas++) {

            System.out.println("Nachalo outer loope");

            INNER: for (int minute = 0; minute <= 59; minute++) {

                if (minute==20) {continue OUTER ;}

                System.out.println(chas + " : " + minute);

            }
        }
        System.out.println("Konec outer loope");
    }
}

    class TimeTest {
            public static void main(String[] args) {

                Times t = new Times();

                t.time();


            }
    }
