// Aluno: Vitor Elias Nakagawa Leme RA: 2348209
final class ClassicPhsyique extends Fisiculturista implements PesoMaximo {

    private int pesoPalco;

    private boolean isNatural;

    public int getPesoPalco() {
        return this.pesoPalco;
    }

    public final void setPesoPalco(int pesoPalco) {
        this.pesoPalco = pesoPalco;
    }

    public boolean getIsNatural() {
        return this.isNatural;
    }

    public void setIsNatural(String isNatural) {
        isNatural = isNatural.toLowerCase();
        if (isNatural.equals("s")) {
            this.isNatural = true;
        } else if (isNatural.equals("n")) {
            this.isNatural = false;
        } else {
            System.out.println("Entrada de dados inválida");
        }
    }

    public void setIsNatural(boolean isNatural) {
        this.isNatural = isNatural;
    }

    public ClassicPhsyique() {
    }

    public ClassicPhsyique(String nome, int altura, int vitOlympia, int vitArnold, int pesoPalco, boolean isNatural) {
        super(nome, altura, vitOlympia, vitArnold);
        this.setPesoPalco(pesoPalco);
        this.setIsNatural(isNatural);
    }

    public void maioresNomes() {
        System.out.println(
                "Os maiores nomes da categoria Classic Physique sao Chris Bumstead, Breon Ansley, Danny Hester.");
    }

    public void explicaCat() {
        System.out.println(
                "Esta categoria é a dos atletas que buscam o shape dos fisiculturistas do passado, o famoso shape clássico, se assim pode dizer.Criou-se esta categoria, pois os atuais bodybuilders começaram a ficar muito grandes, mudando completamente de físico em comparaçao com o que era no passado, entao, acabou-se criando esta classe para reviver esse shape mais clássico e real, menos gigante e monstruoso.Os corpos desta categoria possuem menos massa muscular, mas extremamente simétricos e de excelente harmonia corporal.");
        if (this.getIsNatural()) {
            System.out.println(
                    "o fisiculturismo natural tem os mesmos objetivos que a atividade tradicional - ganho de massa ao extremo e definiçao muscular - sem o uso de doping, substâncias proibidas em determinados esportes, porém, tal condição não é possivel em algumas categorias como a Bodybuilder");
        }
    }

    public void calcPesoCat() {
        int pesoMax;
        if ((this.getAltura()) > 196) {
            pesoMax = ((this.getAltura()) - 100) + 17;
        } else if ((this.getAltura()) > 188) {
            pesoMax = ((this.getAltura()) - 100) + 15;
        } else if ((this.getAltura()) > 180) {
            pesoMax = ((this.getAltura()) - 100) + 13;
        } else if ((this.getAltura()) > 176) {
            pesoMax = ((this.getAltura()) - 100) + 11;
        } else if ((this.getAltura()) > 172) {
            pesoMax = ((this.getAltura()) - 100) + 8;
        } else if ((this.getAltura()) > 169) {
            pesoMax = ((this.getAltura()) - 100) + 6;
        } else {
            pesoMax = ((this.getAltura()) - 100) + 4;
        }
        System.out.println("O peso máximo para competir na categoria Classic Phsyique será " + pesoMax);

    }

}
