// A classe Long envolve metodos que lidam com valores do tipo long, como na conversão para o tipo string e vice-versa. Um objeto do tipo Long pode conter um valor do tipo Long. Fonte:"https://www.geeksforgeeks.org/java-lang-long-class-in-java/?ref=lbp".
public class LongEx {
    public static void main(String args[]) {
        String strg = "1";
        long id = 656;

        Long strgLong = new Long(strg);
        Long idLong = new Long(id);

        System.out.println("toString(id) = " + Long.toString(id));
        System.out.println("toHexString(strgLong) =" + Long.toHexString(strgLong));
        System.out.println("toOctalString(strgLong) =" + Long.toOctalString(strgLong));
        System.out.println("toBinaryString(idLong) =" + Long.toBinaryString(idLong));

    }

}
