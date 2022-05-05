// Aluno: Vitor Elias Nakagawa Leme RA: 2348209
final class Bodybuilder extends Fisiculturista implements PesoMaximo {

    private boolean is212;

    private boolean isGoldenEra;

    public boolean getIs212() {
        return this.is212;
    }

    public void setIs212(boolean is212) {
        this.is212 = is212;
    }

    public void setIs212(String is212) {
        is212 = is212.toLowerCase();
        if (is212.equals("s")) {
            this.is212 = true;
        } else if (is212.equals("n")) {
            this.is212 = false;
        } else {
            System.out.println("Entrada de dados inválida");
        }
    }

    public boolean getIsGoldenEra() {
        return this.isGoldenEra;
    }

    public void setIsGoldenEra(boolean isGoldenEra) {
        this.isGoldenEra = isGoldenEra;
    }

    public void setIsGoldenEra(String isGoldenEra) {
        isGoldenEra = isGoldenEra.toLowerCase();
        if (isGoldenEra.equals("s")) {
            this.isGoldenEra = true;
        } else if (isGoldenEra.equals("n")) {
            this.isGoldenEra = false;
        } else {
            System.out.println("Entrada de dados inválida");
        }
    }

    public Bodybuilder() {
    }

    public Bodybuilder(String nome, int altura, int vitOlympia, int vitArnold, boolean is212, boolean isGoldenEra) {
        super(nome, altura, vitOlympia, vitArnold);
        this.setIs212(is212);
        this.setIsGoldenEra(isGoldenEra);
    }

    public void maioresNomes() {
        System.out.println(
                "Os maiores nomes da categoria Bodybuilder sao Arnold Schwarzenegger, Ronnie Coleman, Phill Heath e Lee Haney.");
    }

    public void explicaCat() {
        System.out.println(
                "É a categoria mais famosa do bodybuilding, que reúne os maiores atletas e que transforma os campeoes das principais competiçoes - como Mr. Olympia e Arnold Classic - em lendas do esporte.Essa categoria requer os homens mais fortes, musculosos e definidos. O diferencial é justamente o tamanho dos atletas.");

        if (this.getIsGoldenEra()) {
            System.out.println("Atletas dessa categória, entre os anos 1965 e 1975, como " + this.getNome()
                    + ", da chamada Golden era são admirados ainda hoje e tidos como símbolos da verdadeira essencia do bodybuilding. Apresentaram os físicos mais impressionantes já vistos até então, com uma magnífica linha de cintura, ombros largos com o clássico shape em V acompanhado de grandes braços e muita força física, sendo que alguns competiam também no powerlifting e faziam demonstraçoes de força e resistência.");

        }
    }

    // Demonstrando o uso do objeto super
    public void explicaEsporte() {
        super.explicaCat();
    }

    public void calcPesoCat() {
        if (!(this.getIs212())) {
            System.out.println("A categoria Open Bodybuilder não possui limites de peso");
        } else {
            System.out.println("A categoria 212 Bodybuilder possui limite de peso de 96kg");
        }

    }

}
