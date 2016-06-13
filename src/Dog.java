/**
 *
 * Создать класс Dog, который будет содержать 2 поля name и says. В main( ) создать 2

 экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля

 объектов.
 * Created by 1 on 02.06.2016.
 */
public class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Spot","Ruff");
        Dog dog2 = new Dog("Scruffy", "Wuff");
        System.out.println(dog1.name +" "+ dog1.says);
        System.out.println(dog2.name + " "+dog2.says);





    }
}


