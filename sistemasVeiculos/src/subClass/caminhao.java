package subClass;

// Classe para representar caminhões. Herda de 'veiculo'.
public class caminhao extends veiculo {
    // Atributos específicos do caminhão
    private int eixos; // Número de eixos do caminhão (Ex: 2, 3, 4, etc)
    private int pesoBruto; // Peso bruto total do caminhão (em quilos)

    // Construtor da classe 'caminhao' que recebe os parâmetros necessários para inicializar o caminhão
    public caminhao(String tipo, int fab, int eixos, int pesoBruto) {
        super(tipo, fab); // Chama o construtor da classe pai ('veiculo') para inicializar tipo e ano de fabricação
        this.eixos = eixos; // Inicializa o número de eixos
        this.pesoBruto = pesoBruto; // Inicializa o peso bruto do caminhão
    }

    // Método sobrescrito para gerar o comando SQL de inserção dos dados do caminhão no banco
    @Override
    public String gerarInsert() {
        // Retorna um comando SQL para inserir os dados do caminhão na tabela 'Veiculos'
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, eixos, pesoBruto) " +
            "VALUES ('%s', %d, %d, %d);",
            tipo, fab, eixos, pesoBruto
        );
    }
}
