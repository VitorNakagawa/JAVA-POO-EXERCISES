// A classe Float envolve métodos para efetivamente lidar com valores do tipo float, como converter para string e vice-versa. Uma classe do tipo Float pode conter um valor do tipo float. Fonte: "https://www.geeksforgeeks.org/java-lang-float-class-in-java/?ref=lbp".
public class FloatEx {

    public static void main(String[] args) {
        float f1 = 23.01F;
        String f2 = "23.01";

        Float floatClassTest = new Float(f1);
        Float floatClassTest2 = new Float(f2);
        float zz = Float.parseFloat(f2);

        System.out.println("toString(b) = " + Float.toString(floatClassTest));
        System.out.println("parseFloat(f2) = " + zz);
        System.out.println("bytevalue(floatClassTest) = " + floatClassTest.byteValue());
        System.out.println("shortvalue(floatClassTest2) = " + floatClassTest2.shortValue());
        System.out.println("intvalue(floatClassTest) = " + floatClassTest.intValue());
        System.out.println("longvalue(floatClassTest2) = " + floatClassTest2.longValue());
        System.out.println("doublevalue(floatClassTest) = " + floatClassTest.doubleValue());
        System.out.println("floatvalue(floatClassTest2) = " + floatClassTest2.floatValue());
    }

}
