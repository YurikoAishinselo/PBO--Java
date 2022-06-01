
package casting01;

public class Casting01 {
    public static void main(String[] args) {
       byte x = (byte)128;
         //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint

       short y = 128;
           System.out.println((byte)y);
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte

        
       byte z = 127;
       z = (byte) (z + 1);
            System.out.println(z);
       z = (byte) (z + 1);
            System.out.println(z);
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
       
    }    
}
