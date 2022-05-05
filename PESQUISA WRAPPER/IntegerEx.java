// A classe Integer envolve métodos para lidar com valores do tipo int, como converter para uma um valor do tipo string e vice-versa. Um objeto do tipo Integer pode conter um valor do tipo int. Fonte:"https://www.geeksforgeeks.org/java-lang-integer-class-java/?ref=lbp".
public class IntegerEx {
    public static void main(String args[]) {
        String strg = "Vitor";
        int bd = 2301;

        Integer byString = new Integer(strg);
        Integer byInt = new Integer(bd);
        System.out.println("toString(byInt) = " + Integer.toString(byInt));
        System.out.println("toHexString(byString) =" + Integer.toHexString(byString));
        System.out.println("toOctalString(byInt) =" + Integer.toOctalString(byInt));
        System.out.println("toBinaryString(byString) =" + Integer.toBinaryString(byString));
        System.out.println("parseInt(strg)" + Integer.parseInt(strg));

    }

}
