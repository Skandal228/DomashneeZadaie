package Lesson2_Primitive_data_types;
/*Задача:
Решил задачку №2 Трегулова, с помощью массива и цикла for
 */
public class Numbers {
    public static void main(String[] args) {
        /*byte [] byMass = new byte[]; этот способ когда просто нужно создать массив с пустыми ячейками
        byMass [0]= 0b1100; // 2
        byMass [1] = 014; // 8
        byMass [2]= 12; //10
        byMass [3] = 0xC; // 16
         */
        byte [] byteMass = {0b1100, 014, 12, 0xC}; // создали массив и наполнили

        for (int i = 0; i<byteMass.length; i++){

            System.out.println(byteMass[i]);
        }

        System.out.println();

        short [] shortMass = {0b10100010100, 02424, 1300, 0x514};
        for (int i =0; i<shortMass.length; i++){
            System.out.println(shortMass[i]);
        }

        System.out.println();

        int [] intMass = {0, 0, 0, 0};
        for (int i = 0; i<intMass.length; i++ ) {
            System.out.println(intMass[i]);
        }

        System.out.println();

        long [] longMass = {0b111010110111100110100010101, 0726746425, 123456789, 0x75bcd15};
        for (int i = 0; i<longMass.length; i++){
            System.out.println(longMass[i]);
        }
        System.out.println();

        char [] charMass = {500, '\u05AB'};
        for (int i = 0; i<charMass.length; i++){
            System.out.println(charMass[i]);
        }
        System.out.println();

        float [] floatMass = {3.14f, 3,9784f};
        for (int i = 0; i<floatMass.length; i++){
            System.out.println(floatMass[i]);
        }
        System.out.println();

        double [] doubleMass = {9.0213d, 8.1};
        for (int i = 0; i<doubleMass.length; i++){
            System.out.println(doubleMass[i]);
        }
        System.out.println();

        boolean [] boolenMass = {true, false};
        for (int i = 0; i<boolenMass.length; i++){
            System.out.println(boolenMass[i]);
        }











    }
}
