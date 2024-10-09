// Classe base para todos os veiculos
package classes;

public class veiculo {
    private String modelo;
    private int anoFabricacao;
    private String montadora;
    private String cor;
    private int odometro;

    // Construtor, inserindo valor as minhas classes ja criadas
    public veiculo(String modelo, int anoFabricacao, String montadora, String cor, int odometro) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
        this.odometro = odometro;
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    public String getMontadora() { return montadora; }
    public void setMontadora(String montadora) { this.montadora = montadora; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getOdometro() { return odometro; }
    public void setOdometro(int odometro) { this.odometro = odometro; }

    // Metodo para gerar comando INSERT
    public String gerarInsert() {
        return String.format("INSERT INTO Veiculo (modelo, anoFabricacao, montadora, cor, odometro) VALUES ('%s', %d, '%s', '%s', %d);",
                modelo, anoFabricacao, montadora, cor, odometro);
    }
}
