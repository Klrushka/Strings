package task20;

import java.io.StringReader;
import java.util.Scanner;

public class ClassWithFields {
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private String string;

    public ClassWithFields(String str) {
        Scanner scanner = new Scanner(str);
        anInt = scanner.nextInt();
        aLong = scanner.nextLong();
        aFloat = scanner.nextFloat();
        aDouble = scanner.nextDouble();
        string = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "ClassWithFields{" +
                "anInt=" + anInt +
                ", aLong=" + aLong +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                ", string='" + string + '\'' +
                '}';
    }
}
