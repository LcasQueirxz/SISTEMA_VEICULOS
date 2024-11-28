package subClass;

// Classe para representar automóveis domésticos. Herda de 'veiculo'.
public class automovel extends veiculo {
    // Atributos específicos do automóvel
    private int passageiros; // Quantidade de passageiros que o automóvel pode transportar
    private String freio; // Tipo de freio do automóvel (Ex: "Disco", "Tambor", etc)
    private boolean airbag; // Indica se o automóvel tem airbag ou não (true/false)

    // Construtor da classe 'automovel' que recebe os parâmetros necessários
    public automovel(String tipo, int fab, int passageiros, String freio, boolean airbag) {
        super(tipo, fab); // Chama o construtor da classe pai ('veiculo') para inicializar tipo e ano de fabricação
        this.passageiros = passageiros; // Inicializa o número de passageiros
        this.freio = freio; // Inicializa o tipo de freio
        this.airbag = airbag; // Inicializa a presença de airbag
    }

    // Método sobrescrito que gera o comando SQL de inserção dos dados no banco
    @Override
    public String gerarInsert() {
        // Retorna um comando SQL que insere os dados do automóvel na tabela 'Veiculos'
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, passageiros, freio, airbag) " +
            "VALUES ('%s', %d, %d, '%s', %b);",
            tipo, fab, passageiros, freio, airbag
        );
    }
}
