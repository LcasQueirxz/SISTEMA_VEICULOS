package subClass;
public class bicicleta extends veiculo {
    private String marca;
    private String cor;
    private String material;
    private int marchas;
    private boolean amortecedor;

    public bicicleta(String tipo, int fab, String marca, String cor, String material, int marchas, boolean amortecedor) {
        super(tipo, fab);
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.marchas = marchas;
        this.amortecedor = amortecedor;
    }

    @Override
    public String gerarInsert() {
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, marca, cor, material, marchas, amortecedor) " +
            "VALUES ('%s', %d, '%s', '%s', '%s', %d, %b);",
            tipo, fab, marca, cor, material, marchas, amortecedor
        );
    }
}