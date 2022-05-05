// A classe Double envolve vários métodos para efetivamente lidar com um valor double, como converter para uma string e vice-versa. Um objeto do tipo Double pode conter um valor do tipo double. Fonte: "https://www.geeksforgeeks.org/java-lang-double-class-java/?ref=lbp".

import java.lang.Double;

public class DoubleEx {
    public static void main(String args[]) {

        double dble = 155.055;
        String strg = "6568";
        Double doubleEx1 = new Double(55.6);
        Double doubleEx2 = new Double("45");
        Double doubleEx3 = new Double(dble);
        Double doubleEx4 = new Double(strg);
        double zz = Double.parseDouble(strg);

        System.out.println("bytevalue(doubleEx1) = " + doubleEx1.byteValue());
        System.out.println("shortvalue(doubleEx2) = " + doubleEx2.shortValue());
        System.out.println("intvalue(doubleEx1) = " + doubleEx1.intValue());
        System.out.println("longvalue(doubleEx3) = " + doubleEx3.longValue());
        System.out.println("doublevalue(doubleEx1) = " + doubleEx1.doubleValue());
        System.out.println("floatvalue(doubleEx4) = " + doubleEx4.floatValue());
        System.out.println("toString(b) = " + Double.toString(doubleEx1));
        System.out.println("zz = " + zz);

    }
}
