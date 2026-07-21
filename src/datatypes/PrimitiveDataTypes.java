package datatypes;

public class PrimitiveDataTypes {
    //byte takes 1 byte (8 bits) of memory so it takes values within the range of -128 to 127
    byte b = 127;
    //byte b2 = 128;            //throws error like required byte provided int so we can perform type casting

    //short takes 2 bytes (16 bits) of memory so it takes values within the range of -32,768 to 32,767
    short s = 32767;

    //integer takes 4 bytes (32 bits) of memory so it takes values within the range of -2,147,483,648 to 2,147,483,647
    int i = 2147483647;


    //long takes 8 bytes (64 bits) of memory so it takes values within the range of
    // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    long l = 9223372036854775807L;


    float f;
    double d;
    char c;
    boolean bool;
    public static void main(String[] args) {
        PrimitiveDataTypes pd = new PrimitiveDataTypes();

    }
}
