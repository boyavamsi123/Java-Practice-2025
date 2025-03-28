public class Main{
    public static void main(String[] args){
        byte b = -128;
        int i = -2147483648;
        short s = -32768;
        

        System.out.println(Short.SIZE/8);  // 2Bytes
        System.out.println(Float.SIZE/8);  // 4Bytes
        System.out.println(Character.SIZE/8);  // 2Bytes

        System.out.println(Byte.MIN_VALUE);  // -128
        System.out.println(Byte.MAX_VALUE);  // 127

        System.out.println(Short.MIN_VALUE);  // -32768
        System.out.println(Short.MAX_VALUE);  // 32767

        System.out.println(Integer.MIN_VALUE);  // -2147483648
        System.out.println(Integer.MAX_VALUE);  // 2147483647

        System.out.println(Long.MIN_VALUE);  // -9223372036854775808
        System.out.println(Long.MAX_VALUE);  // 9223372036854775807
    }
}