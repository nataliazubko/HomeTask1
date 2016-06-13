/**
 *
 * Создать класс, который будет хранить в одной целочисленной переменной несколько

 значений меньшей длины. Например, возраст, вес, рост и год рождения. Добавить методы

 получения и добавления параметров отдельно.
 * Created by 1 on 07.06.2016.
 */
public class LessLength {
    public static void main(String[] args) {
        int age, height, weight, year, combined, mask;
        age = 28; //00011011
        height = 165; //10100101
        weight = 56; //01111000
        year = 89; //01011001
        combined = (age) | (height << 8) | (weight << 16)| (year << 24); //01011001 01111000 10100101 00011011

        mask = 0b11111111;

        System.out.printf("Age: %d, height: %d, weight: %d, year: %d",
                mask & combined,
                mask & combined >>> 8,
                mask & combined >>> 16,
                mask & combined >>> 24);
    }
}
