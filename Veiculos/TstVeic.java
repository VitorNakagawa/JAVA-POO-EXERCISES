public class TstVeic {
    public static void main(String args[]) {
        Leitura l = new Leitura();
        Passeio passeio = new Passeio("0321 ABCD", "Fiat", "Uno", "Vermelho", 4, 205, 3, 200,
                "23 de janeiro de 2003", 30);
        Carga carga1 = new Carga("123abc", "uno", "fiat", "rosa", 4, 10000, 500, 10, "23012003", 100, 100);
        System.out.println(passeio.getMotor().getQtdPistoes());
        System.out.println(carga1.getMotor().getPotencia());
        Passeio passeio2 = new Passeio();
        passeio2.getMotor()
        passeio2.setPlaca(l.entDados("\nPlaca: "));
        passeio2.setMarca(l.entDados("\nMarca: "));
        passeio2.setModelo(l.entDados("\nModelo: "));
        passeio2.setCor(l.entDados("\nCor: "));
        passeio2.setQtdRodas(Integer.parseInt(l.entDados("\nQuantidade de rodas: ")));
        passeio2.setVeloxMax(Integer.parseInt(l.entDados("\nVelocidade Maxima: ")));
        passeio2.getMotor().setPotencia(Integer.parseInt(l.entDados("\nPotencia: ")));
        passeio2.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("\nQuantidade de Pistões: ")));
        passeio2.setDataCadastro(l.entDados("\nData: "));
        passeio2.setQtdePassageiro(Integer.parseInt(l.entDados("\nPassageiros: ")));
        System.out.println("Placa: " + passeio2.getPlaca());
        System.out.println("Marca: " + passeio2.getMarca());
        System.out.println("Modelo: " + passeio2.getModelo());
        System.out.println("Cor: " + passeio2.getCor());
        System.out.println("Qtd Rodas: " + passeio2.getQtdRodas());
        System.out.println("Veloc Max: " + passeio2.getVelocMax());
        System.out.println("Potencia: " + passeio2.getMotor().getPotencia());
        System.out.println("Pistoes: " + passeio2.getMotor().getQtdPistoes());
        System.out.println("Data Cadastro: " + passeio2.getDataCadastro());
        System.out.println("QtdPassageiro: " + passeio2.getQtdePassageiro());
        System.out.println("Calcular:" + passeio2.calcular());
        System.out.println("CalcVel: " + passeio2.calcVel() + "m/h");
        Carga carga3 = new Carga();
        carga3.setPlaca(l.entDados("\nPlaca: "));
        carga3.setMarca(l.entDados("\nMarca: "));
        carga3.setModelo(l.entDados("\nModelo: "));
        carga3.setCor(l.entDados("\nCor: "));
        carga3.setQtdRodas(Integer.parseInt(l.entDados("\nQuantidade de rodas: ")));
        carga3.setVeloxMax(Integer.parseInt(l.entDados("\nVelocidade Maxima: ")));
        carga3.getMotor().setPotencia(Integer.parseInt(l.entDados("\nPotencia: ")));
        carga3.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("\nQuantidade de Pistões: ")));
        carga3.setDataCadastro(l.entDados("\nData: "));
        carga3.setCargaMax(Integer.parseInt(l.entDados("\nCarga Maxima: ")));
        carga3.setTara(Integer.parseInt(l.entDados("\nTara: ")));
        System.out.println("Placa: " + carga3.getPlaca());
        System.out.println("Marca: " + carga3.getMarca());
        System.out.println("Modelo: " + carga3.getModelo());
        System.out.println("Cor: " + carga3.getCor());
        System.out.println("Qtd Rodas: " + carga3.getQtdRodas());
        System.out.println("Veloc Max: " + carga3.getVelocMax());
        System.out.println("Potencia: " + carga3.getMotor().getPotencia());
        System.out.println("Pistoes: " + carga3.getMotor().getQtdPistoes());
        System.out.println("Data Cadastro: " + carga3.getDataCadastro());
        System.out.println("Carga Maxima: " + carga3.getCargaMax());
        System.out.println("Tara: " + carga3.getTara());
        System.out.println("Calcular: " + carga3.calcular());
        System.out.println("CalcVel: " + carga3.calcVel() + "cm/h");

    }
}
