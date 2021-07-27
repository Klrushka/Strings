package task5;

import java.math.BigInteger;
import java.util.Formatter;

public class ConversionTest {
    private Formatter formatter = new Formatter(System.out);
    private Object[] objects = new Object[]{"string", 'a', 55, 2.5d, true, new BigInteger("1234567891")};


    public void test(String conversion) {

        System.out.println("------------------------------------------------"+
                "\nTesting conversion character " + conversion + "! \n");

        for (int i = 0; i < objects.length; i++) {
            try {
                System.out.print(objects[i].getClass().getSimpleName() + ": ");
                formatter.format("%-5" + conversion, objects[i]);
                System.out.println();
            } catch (Exception e) {
                System.out.println("Can not use conversion with " + objects[i].getClass().getSimpleName());
            }
        }
    }

}
