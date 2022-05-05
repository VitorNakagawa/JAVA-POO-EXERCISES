abstract class Veiculo {
    private String placa;

    private String marca;

    private String modelo;

    private String cor;

    private int qtdRodas;

    private int velocMax;

    private Motor motor;

    private String dataCadastro;

    abstract int calcVel();

    public String getPlaca() {
        return this.placa;
    }

    public final void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public final void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdRodas() {
        return this.qtdRodas;
    }

    public final void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public int getVelocMax() {
        return this.velocMax;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public final void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }

    public final void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public final void setVeloxMax(int velocMax) {
        if (velocMax < 10 || velocMax > 250) {
            this.velocMax = 100;
            System.out.println("A velocidade está fora dos limites brasileiros");

        } else {
            this.velocMax = velocMax;
        }
    }

    public Veiculo() {
        // this.motor = new Motor();
    }

    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,
            int potencia, String dataCadastro) {
        Motor motor = new Motor(qtdPistoes, potencia);
        this.setPlaca(placa);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCor(cor);
        this.setQtdRodas(qtdRodas);
        this.setVeloxMax(velocMax);
        this.setMotor(motor);
        this.setDataCadastro(dataCadastro);
    }

}
