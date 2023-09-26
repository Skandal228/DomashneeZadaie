package Lesson8_modifiere_final_and_static;

public class Urovnenie {
    final static double PI = 3.14;
    static double r =5.0;

    public  double ploshad (double r1){
        double s = PI * r1 * r1;
        return s;
      }
   public static double  dlina (double r2){
        double d = 2* PI * r2;
        return d;
      }

    public void Info (double r3 ){
        System.out.println("Радиус: " + r3);
        System.out.println("Площадь круга: " + ploshad(r3));
        System.out.println("Длина окружности: " + dlina(r3));

      }
}
class  UrovnenieTest{
    public static void main(String[] args) {
        Urovnenie ur1 = new Urovnenie();
        ur1.ploshad(5.0);
        ur1.dlina(5.0);
        ur1.Info(4);

    }

}
