// Classe para caminhoes
package classes;


public class caminhao extends veiculo {
    private int eixos;
    private int pesoBruto;

    // Construtor
    public caminhao(String modelo, int anoFabricacao, String montadora, String cor, int odometro, int eixos, int pesoBruto) {
        super(modelo, anoFabricacao, montadora, cor, odometro);
        this.eixos = eixos;
        this.pesoBruto = pesoBruto;
    }

    // Getters e Setters
    public int getEixos() { return eixos; }
    public void setEixos(int eixos) { this.eixos = eixos; }

    public int getPesoBruto() { return pesoBruto; }
    public void setPesoBruto(int pesoBruto) { this.pesoBruto = pesoBruto; }

    // Override do metodo gerarInsert
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Caminhao (modelo, anoFabricacao, montadora, cor, odometro, eixos, pesoBruto) VALUES ('%s', %d, '%s', '%s', %d, %d, %d);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getOdometro(), eixos, pesoBruto);
    }
}
