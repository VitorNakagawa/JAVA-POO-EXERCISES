public final class Passeio extends Veiculo implements Calc {
    private int qtdePassageiro;

    public int getQtdePassageiro() {
        return this.qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public int calcVel() {
        int veloc = (this.getVelocMax()) / 1000;
        return veloc;

    }

    public int calcular() {
        int result = (this.getCor().length()) + (this.getDataCadastro().length()) + (this.getMarca().length())
                + (this.getModelo().length()) + (this.getPlaca().length());
        return result;
    }

    public Passeio() {
        
    }

    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int potencia,
            int qtdPistoes,
            String dataCadastro, int qtdePassageiros) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, potencia, qtdPistoes, dataCadastro);
        this.setQtdePassageiro(qtdePassageiro);
    }
    // public Passeio(String placa, String marca, String modelo, String cor, int
    // qtdRodas, int velocMax, int qtdPistoes, int potencia,
    // String dataCadastro, int qtdePassageiro) {
    // Motor motor= new Motor(qtdPistoes, potencia);
    // this.setPlaca(placa);
    // this.setMarca(marca);
    // this.setModelo(modelo);
    // this.setCor(cor);
    // this.setQtdRodas(qtdRodas);
    // this.setVeloxMax(velocMax);
    // this.setMotor(motor);
    // this.setDataCadastro(dataCadastro);
    // this.setQtdePassageiro(qtdePassageiro);
    // }
}
