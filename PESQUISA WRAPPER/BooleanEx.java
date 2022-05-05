// A classe Boolean envolve um valor do tipo primitivo boolean em um objeto, Um objeto do tipo Boolean contém um único campo, cujo tipo é boolean. Fornece métodos úteis como converter um booleano em uma String e uma String em um booleano,enquanto lida com uma variável booleana. Fonte: "https://www.geeksforgeeks.org/java-lang-boolean-class-java/".

import java.lang.Boolean;

public class BooleanEx {

    public static void main(String[] args) {
        Boolean falseEx = new Boolean(false);
        Boolean trueEx = new Boolean(true);
        Boolean vitorEx = new Boolean("Vitor");
        System.out.println(falseEx);
        System.out.println(trueEx);
        System.out.println(vitorEx);

    }

}
