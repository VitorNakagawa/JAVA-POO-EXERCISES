public final class Carga extends Veiculo implements Calc {
    private int tara;
    private int cargaMax;

    public int getTara() {
        return this.tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return this.cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int calcVel() {
        int veloc = (this.getVelocMax()) / 100000;
        return veloc;

    }

    public int calcular() {
        int result = (this.getCargaMax()) + (this.getQtdRodas()) + (this.getTara()) + (this.getVelocMax());
        return result;
    }

    public Carga() {
    }

    public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int potencia,
            int qtdPistoes,
            String dataCadastro, int tara, int cargaMax) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, potencia, qtdPistoes, dataCadastro);
        this.setTara(tara);
        this.setCargaMax(cargaMax);
    }

    // public Carga(String placa, String marca, String modelo, String cor, int
    // qtdRodas, int velocMax,int qtdPistoes, int potencia,
    // String dataCadastro, int tara, int cargaMax) {
    // Motor motor= new Motor(qtdPistoes, potencia);
    // this.setPlaca(placa);
    // this.setMarca(marca);
    // this.setModelo(modelo);
    // this.setCor(cor);
    // this.setQtdRodas(qtdRodas);
    // this.setVeloxMax(velocMax);
    // this.setMotor(motor);
    // this.setDataCadastro(dataCadastro);
    // this.setTara(tara);
    // this.setCargaMax(cargaMax);
    // }
}
