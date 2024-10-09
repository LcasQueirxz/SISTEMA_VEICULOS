// Classe para bicicletas
package classes;

public class bicicleta {
    private String modelo;
    private String marca;
    private String cor;
    private String material;
    private int marchas;
    private boolean amortecedor;

    // Construtor
    public bicicleta(String modelo, String marca, String cor, String material, int marchas, boolean amortecedor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.marchas = marchas;
        this.amortecedor = amortecedor;
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public int getMarchas() { return marchas; }
    public void setMarchas(int marchas) { this.marchas = marchas; }

    public boolean isAmortecedor() { return amortecedor; }
    public void setAmortecedor(boolean amortecedor) { this.amortecedor = amortecedor; }

    // Metodo para gerar comando INSERT
    public String gerarInsert() {
        return String.format("INSERT INTO Bicicleta (modelo, marca, cor, material, marchas, amortecedor) VALUES ('%s', '%s', '%s', '%s', %d, %b);",
                modelo, marca, cor, material, marchas, amortecedor);
    }
}
