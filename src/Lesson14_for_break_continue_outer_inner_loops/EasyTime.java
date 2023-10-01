package Lesson14_for_break_continue_outer_inner_loops;

    public class EasyTime {
        public static void times() {

            OUTER:
            for (int chas = 0; chas <= 6; chas++) {
                MIDDLE:
                for (int minute = 0; minute <= 59; minute++) {
                    if (chas > 1 && minute % 10 == 0) {
                        break OUTER;
                    }
                    INNER:
                    for (int second = 0; second <= 59; second++) {
                        if (second * chas > minute) {
                            continue MIDDLE;
                        }
                        System.out.println(chas + ":" + minute + ":" + second);
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





