
// A classe Byte envolve vários metodos para efetivamente lidar com valores do tipo byte, como converter para uma representação do tipo string e vice-versa. Um objeto do tipo Byte pode conter apenas um valor do type byte. Fonte:"https://www.geeksforgeeks.org/java-lang-byte-class-java/?ref=lbp".
import java.lang.Byte;

public class ByteEx {
    public static void main(String args[]) {
        byte byteEx = 55;
        String stringEx = "45";
        Byte b1 = new Byte(stringEx);
        Byte b2 = new Byte(byteEx);
        Byte b3 = Byte.parseByte(stringEx);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("toString(b1) = " + Byte.toString(b1));

    }
}
