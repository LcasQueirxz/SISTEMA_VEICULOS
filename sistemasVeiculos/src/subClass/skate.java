package subClass;

// Classe para representar Skates. Herda de 'veiculo'.
public class skate extends veiculo {
    // Atributos específicos para a classe 'skate'
    private String marca; // Marca do skate (Ex: Fischer, Element, etc.)
    private String cor;   // Cor do skate (Ex: Preto, Vermelho, etc.)
    private String tipoRodas; // Tipo de rodas do skate (Ex: Lisas, Plásticas, etc.)

    // Construtor da classe 'skate'. Recebe os parâmetros necessários para inicializar o skate.
    public skate(String tipo, int fab, String marca, String cor, String tipoRodas) {
        super(tipo, fab); // Chama o construtor da classe pai ('veiculo') para inicializar o tipo e ano de fabricação
        this.marca = marca;   // Inicializa a marca do skate
        this.cor = cor;       // Inicializa a cor do skate
        this.tipoRodas = tipoRodas; // Inicializa o tipo de rodas
    }

    // Método sobrescrito da classe 'veiculo' para gerar o comando SQL de inserção do skate no banco de dados
    @Override
    public String gerarInsert() {
        // Retorna o comando SQL para inserir os dados do skate na tabela 'Veiculos'
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, marca, cor, tipoRodas) " + 
            "VALUES ('%s', %d, '%s', '%s', '%s');",
            tipo, fab, marca, cor, tipoRodas
        );
    }
}
