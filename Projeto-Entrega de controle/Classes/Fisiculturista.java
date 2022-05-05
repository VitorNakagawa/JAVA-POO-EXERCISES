// Aluno: Vitor Elias Nakagawa Leme RA: 2348209
abstract class Fisiculturista {
    private String nome;

    private int altura;

    private Titulos titulos;

    private final boolean isPro = true;

    public String getNome() {
        return this.nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return this.altura;
    }

    public final void setAltura(int altura) {
        this.altura = altura;
    }

    public Titulos getTitulos() {
        return this.titulos;
    }

    public final void setTitulos(Titulos titulos) {
        this.titulos = titulos;
    }

    public boolean getIsPro() {
        return this.isPro;
    }

    public Fisiculturista() {
        this.titulos = new Titulos();
    }

    public Fisiculturista(String nome, int altura, int vitOlympia, int vitArnold) {
        Titulos titulos = new Titulos(vitOlympia, vitArnold);
        this.setAltura(altura);
        this.setTitulos(titulos);
        this.setNome(nome);
        this.setTitulos(titulos);

    }

    public abstract void maioresNomes();

    public void explicaCat() {
        System.out.println(
                "Fisiculturismo é uma prática que visa o desenvolvimento dos músculos corporais a partir da hipertrofia muscular, ou seja, aumento no volume da massa muscular.");
    }

}