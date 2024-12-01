package subClass;

// Classe base para representar veículos. Esta classe é estendida pelas subclasses como 'automovel', 'motocicleta', 'caminhao', etc.
public class veiculo {
    // Atributos comuns a todos os veículos. 'tipo' define o tipo do veículo (ex: "Carro", "Moto", "Caminhão"), 
    // e 'fab' define o ano de fabricação.
    protected String tipo;
    protected int fab;

    // Construtor da classe 'veiculo'. Inicializa os atributos 'tipo' e 'fab'.
    // 'tipo' é o tipo do veículo, por exemplo "Gol", "Bis", "Carga", etc.
    // 'fab' é o ano de fabricação do veículo.
    public veiculo(String tipo, int fab) {
        this.tipo = tipo; // Inicializa o tipo do veículo
        this.fab = fab;   // Inicializa o ano de fabricação do veículo
    }

    // Método que gera o comando SQL para inserir os dados do veículo na tabela 'Veiculos'.
    // Retorna um comando SQL do tipo: 
    // "INSERT INTO Veiculos (tipo, fab) VALUES ('Gol', 2005);"
    public String gerarInsert() {
        return String.format(
            "INSERT INTO Veiculos (tipo, fab) VALUES ('%s', %d);",
            tipo, fab // Formata a string com os valores dos atributos 'tipo' e 'fab'
        );
    }
}
