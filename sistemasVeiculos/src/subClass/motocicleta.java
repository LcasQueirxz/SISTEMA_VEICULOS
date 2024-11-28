package subClass;

// Classe para representar motocicletas. Herda de 'veiculo'.
public class motocicleta extends veiculo {
    // Atributos específicos da motocicleta
    private int cilindradas; // Cilindrada do motor da motocicleta (Ex: 125, 300, 600, etc)
    private int torque; // Torque da motocicleta (medido em Nm - Newton-metro)

    // Construtor da classe 'motocicleta' que recebe os parâmetros necessários para inicializar a motocicleta
    public motocicleta(String tipo, int fab, int cilindradas, int torque) {
        super(tipo, fab); // Chama o construtor da classe pai ('veiculo') para inicializar tipo e ano de fabricação
        this.cilindradas = cilindradas; // Inicializa a cilindrada do motor
        this.torque = torque; // Inicializa o torque da motocicleta
    }

    // Método sobrescrito para gerar o comando SQL de inserção dos dados da motocicleta no banco
    @Override
    public String gerarInsert() {
        // Retorna um comando SQL para inserir os dados da motocicleta na tabela 'Veiculos'
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, cilindradas, torque) " +
            "VALUES ('%s', %d, %d, %d);",
            tipo, fab, cilindradas, torque
        );
    }
}
