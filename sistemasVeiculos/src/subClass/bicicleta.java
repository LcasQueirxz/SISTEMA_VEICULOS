package subClass;

// Classe para representar bicicletas. Herda de 'veiculo'.
public class bicicleta extends veiculo {
    // Atributos específicos da bicicleta
    private String marca; // Marca da bicicleta (Ex: "Caloi", "Schwinn", etc)
    private String cor; // Cor da bicicleta
    private String material; // Material da bicicleta (Ex: "Alumínio", "Carbono", etc)
    private int marchas; // Número de marchas que a bicicleta possui
    private boolean amortecedor; // Indica se a bicicleta tem ou não amortecedor (true/false)

    // Construtor da classe 'bicicleta' que recebe os parâmetros necessários para inicializar a bicicleta
    public bicicleta(String tipo, int fab, String marca, String cor, String material, int marchas, boolean amortecedor) {
        super(tipo, fab); // Chama o construtor da classe pai ('veiculo') para inicializar tipo e ano de fabricação
        this.marca = marca; // Inicializa a marca da bicicleta
        this.cor = cor; // Inicializa a cor da bicicleta
        this.material = material; // Inicializa o material da bicicleta
        this.marchas = marchas; // Inicializa o número de marchas
        this.amortecedor = amortecedor; // Inicializa a presença do amortecedor
    }

    // Método sobrescrito para gerar o comando SQL de inserção dos dados da bicicleta no banco
    @Override
    public String gerarInsert() {
        // Retorna um comando SQL para inserir os dados da bicicleta na tabela 'Veiculos'
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, marca, cor, material, marchas, amortecedor) " +
            "VALUES ('%s', %d, '%s', '%s', '%s', %d, %b);",
            tipo, fab, marca, cor, material, marchas, amortecedor
        );
    }
}
