package task6;

public class Fields {
    private int intField = 5;
    private long longField = 123456;
    private float floatField = 1.5f;
    private double doubleField = 1.2d;


    public void print(){
        System.out.printf("int = %d\nlong = %d\nfloat = %f\ndouble = %f",intField,longField,floatField,doubleField);
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public void setLongField(long longField) {
        this.longField = longField;
    }

    public void setFloatField(float floatField) {
        this.floatField = floatField;
    }

    public void setDoubleField(double doubleField) {
        this.doubleField = doubleField;
    }
}
