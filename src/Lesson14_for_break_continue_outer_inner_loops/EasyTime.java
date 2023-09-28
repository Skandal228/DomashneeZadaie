package Lesson14_for_break_continue_outer_inner_loops;

    public class EasyTime {
    public static void times() {
        OUTER:
        for (int chas = 0; chas <= 6; chas++) {

            for (int minute = 0; minute <= 59; minute++) {

                INNER:
                for (int second = 0; second <= 59; second++) {
                    System.out.println(chas + ":" + minute+":"+second);

                    if (chas > 1 || minute == 10) {
                        System.out.println("Закончили метод");
                        {
                            break OUTER;
                        }

                    } else if (second * chas > minute) {
                        continue INNER;
                    }
                    System.out.println("продолжили метод");

                }
            }
        }
    }
}

    class EasyTimeTest {
        public static void main(String[] args) {
            EasyTime.times();

        }

}


