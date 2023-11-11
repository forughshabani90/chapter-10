package listing;

import java.util.Scanner;

public class UseBMIClass {

    public static void main(String[] args) {
        String name;
        int age;
        double weight;
        double height;
        Scanner input = new Scanner(System.in);
        name = input.next();
        age = input.nextInt();
        weight = input.nextDouble();
        height = input.nextDouble();
        Bmi bmi1 = new Bmi(name, age, weight, height);
        Bmi bmi2 = new Bmi(name, weight, height);
        System.out.println(bmi1.getBMI());
        System.out.println(bmi1.getStatus());
    }

}

