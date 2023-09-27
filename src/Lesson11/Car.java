package Lesson11;

public class Car {
    String color ;
    String motor;
    int door;

    Car (String color, String motor, int door){
        this.color = color;
        this.motor = motor;
        this.door= door;
    }

}

class CarTest {
    void changeDoors(Car c, int door) {
        c.door = door;
    }

    void changeColor(Car c1, Car c2){
    String color = c1.color;
    c1.color = c2.color;
    }

    public static void main(String[] args) {

    }
}

