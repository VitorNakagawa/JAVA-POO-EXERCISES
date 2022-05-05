// A classe Character oferece uma variedade de métodos para manipular caracteres. Um objeto do tipo Character contém um único campo do tipo char. Fonte:"https://www.geeksforgeeks.org/character-class-java/?ref=lbp"

import java.lang.Character;

public class CharacterEx {
    public static void main(String args[]){
        Character teste = new Character('t');
        System.out.println(Character.isLetter(teste));
        System.out.println(Character.isLetter('5'));
        System.out.println(Character.isWhitespace('h'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('a'));

    }
}
