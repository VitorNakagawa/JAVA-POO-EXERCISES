final class Motor {
    private int qtdPistoes;

    private int potencia;

    public int getQtdPistoes() {
        return this.qtdPistoes;
    }

    public void setQtdPistoes(int qtdPistoes) {
        this.qtdPistoes = qtdPistoes;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Motor() {
    }

    public Motor(int qtdPistoes, int potencia) {
        this.setQtdPistoes(qtdPistoes);
        this.setPotencia(potencia);
    }

}
