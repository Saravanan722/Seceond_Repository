
/**
 * This file we are explore basic data type and custom data type.
 * 
 * Data Type
 * 
 * 1. int 2. byte 3. String 4. double 5. float 6. long 7. char 8. boolean 9.
 * short
 * 
 * Custom Data Type
 * 
 * 1. enum 2. struct 3. class
 * 
 * Type conversion
 * 
 */

import java.util.Formatter;

public class FirstLearning {
  public static void main(String[] args) {
    System.out.println("Hello Java");

    byte _byte = -128; // -128 to 127 8 bit
    short _short = -32768; // -32768 to 32767 16 bit
    int _int = 20_00_000_000; // 32 bit
    long _long = 2_00_000_000_000L; // 64 bit
    float _float = 3.3332223333333333333f; // 32 bit
    double _double = 3.3332223333333333333;// 64 bit
    char _char = 'S';// 16 bit
    boolean _boolean = false; // 1 Bit
    System.out.println("Byte : " + _byte);
    System.out.println("Short : " + _short);
    System.out.println("Int : " + _int);
    System.out.println("Long : " + _long);
    System.out.println("Float : " + _float);
    System.out.println("Double : " + _double);
    System.out.println("Char : " + _char);
    System.out.println("Boolean : " + _boolean);

    Formatter formatter = new Formatter();
    formatter.format("%.2s", 253.555);
    System.out.println(formatter);
    // String name = "Hello, I am \'' Saravanan";
    // System.out.print( name);
    String name1 = "engineering";
    System.out.println(name1);

    // 12.56789 -> 12.56
    // 2000 -> 2000.00
  }
}