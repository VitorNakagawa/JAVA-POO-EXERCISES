// Aluno: Vitor Elias Nakagawa Leme RA: 2348209
public class TstFisiculturista {
    public static void main(String args[]) {

        Leitura l = new Leitura();
        Bodybuilder bodybuilder = new Bodybuilder();
        Bodybuilder bodybuilder2 = new Bodybuilder("Vitor", 173, 10, 20, true, true);
        ClassicPhsyique classic = new ClassicPhsyique();
        ClassicPhsyique classic2 = new ClassicPhsyique("Vitor", 190, 10, 20, 79, false);
        System.out.println("O nome do Bodybuilder é: " + bodybuilder2.getNome());
        System.out.println("A altura do bodybuilder é: " + bodybuilder2.getAltura());
        System.out.println("O bodybuilder é 212? " + bodybuilder2.getIs212());
        System.out.println("O bodybuilder é da Golden era?(s/n) " + bodybuilder2.getIsGoldenEra());
        System.out.println("Quantidade de vitórias no Arnold: " + bodybuilder2.getTitulos().getVitArnold());
        System.out.println("Quantidade de vitórias no Olympia: " + bodybuilder2.getTitulos().getVitOlympia());
        System.out.println("O Bodybuilder é PRO?" + bodybuilder2.getIsPro());
        bodybuilder2.calcPesoCat();
        bodybuilder2.explicaCat();
        bodybuilder2.maioresNomes();
        bodybuilder2.explicaEsporte();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("O nome do classic é: " + classic2.getNome());
        System.out.println("A altura do classic é: " + classic2.getAltura());
        System.out.println("Quantidade de vitórias no Arnold: " + classic2.getTitulos().getVitArnold());
        System.out.println("Quantidade de vitórias no Olympia: " + classic2.getTitulos().getVitOlympia());
        System.out.println("O peso de palco do classic é? " + classic2.getPesoPalco());
        System.out.println("O classic é natural?(s/n) " + classic2.getIsNatural());
        System.out.println("O classic é PRO?" + classic2.getIsPro());
        classic2.calcPesoCat();
        classic2.explicaCat();
        classic2.maioresNomes();
        System.out.println("-----------------------------------------------------------------------");
        bodybuilder.setNome(l.entDados("\nQual o nome do Bodybuilder? "));
        bodybuilder.setAltura(Integer.parseInt(l.entDados("\nAltura em cm: ")));
        bodybuilder.setIs212(l.entDados("\nÉ da subdivisão 212? (s/n): "));
        bodybuilder.setIsGoldenEra(l.entDados("\nÉ da Golden Era? (s/n): "));
        bodybuilder.getTitulos().setVitArnold(Integer.parseInt(l.entDados("\nQuantidade de vitórias no Arnold: ")));
        bodybuilder.getTitulos()
                .setVitOlympia(Integer.parseInt(l.entDados("\nQuantidade de vitórias no Mr Olympia: ")));
        System.out.println("O nome do Bodybuilder é: " + bodybuilder.getNome());
        System.out.println("A altura do bodybuilder é: " + bodybuilder.getAltura());
        System.out.println("O bodybuilder é 212? " + bodybuilder.getIs212());
        System.out.println("O bodybuilder é da GoldenEra? " + bodybuilder.getIsGoldenEra());
        System.out.println("Quantidade de vitórias no Arnold: " + bodybuilder.getTitulos().getVitArnold());
        System.out.println("Quantidade de vitórias no Olympia: " + bodybuilder.getTitulos().getVitOlympia());
        System.out.println("O Bodybuilder é PRO?" + bodybuilder.getIsPro());
        bodybuilder.calcPesoCat();
        bodybuilder.explicaCat();
        bodybuilder.maioresNomes();
        bodybuilder.explicaEsporte();
        System.out.println("-----------------------------------------------------------------------");
        classic.setNome(l.entDados("\nQual o nome do classic? "));
        classic.setAltura(Integer.parseInt(l.entDados("\nAltura em cm: ")));
        classic.setPesoPalco(Integer.parseInt(l.entDados("\nQual o peso de palco? ")));
        classic.getTitulos().setVitArnold(Integer.parseInt(l.entDados("\nQuantidade de vitórias no Arnold: ")));
        classic.getTitulos().setVitOlympia(Integer.parseInt(l.entDados("\nQuantidade de vitórias no Mr Olympia: ")));
        classic.setIsNatural(l.entDados("\nÉ Natural? (s/n): "));
        System.out.println("O nome do classic é: " + classic.getNome());
        System.out.println("A altura do classic é: " + classic.getAltura());
        System.out.println("O peso de palco do classic é? " + classic.getPesoPalco());
        System.out.println("Quantidade de vitórias no Arnold: " + classic.getTitulos().getVitArnold());
        System.out.println("Quantidade de vitórias no Olympia: " + classic.getTitulos().getVitOlympia());
        System.out.println("O classic é natural?" + classic.getIsNatural());
        System.out.println("O classic é PRO?" + classic.getIsPro());
        classic.calcPesoCat();
        classic.explicaCat();
        classic.maioresNomes();

    }
}
