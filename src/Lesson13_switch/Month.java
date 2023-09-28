package Lesson13_switch;

public class Month {


    public static void calendar(int number) {
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 дней в месяце");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 дней в месяце");
                break;
            case 2:
                System.out.println("28 дней в месяце");
                break;
            default:
                System.out.println("Ошибка ввода данных!");


        }
    }

    public static void main(String[] args) {
        Month.calendar(120);

    }
}