// A classe Short envolve métodos para lidar com valores do tipo short, como converter para o tipo string e vice-versa. Um objeto do tipo Short pode conter um valor do tipo short. Fonte:"https://www.geeksforgeeks.org/java-lang-short-class-java/?ref=lbp".
public class ShortEx {
    public static void main(String args[]) {
        short shortEx = -5556;
        String stringEx = "5556";
        Short Ex1 = new Short(shortEx);
        Short Ex2 = new Short(stringEx);

        System.out.println("toString(shortEx) = " + Short.toString(shortEx));
        System.out.println("parseShort(bb) = " + Short.parseShort(stringEx));
        System.out.println("bytevalue(Ex1) = " + Ex1.byteValue());
        System.out.println("shortvalue(Ex2) = " + Ex2.shortValue());
        System.out.println("intvalue(Ex1) = " + Ex1.intValue());
        System.out.println("longvalue(Ex2) = " + Ex2.longValue());
        System.out.println("doublevalue(Ex1) = " + Ex1.doubleValue());
        System.out.println("floatvalue(Ex2) = " + Ex2.floatValue());

    }

}
