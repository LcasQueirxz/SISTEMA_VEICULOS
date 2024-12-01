package mostOf;

import subClass.*; // Chamando todas as classes da pasta subClass para utilizar suas funcionalidades.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class databaseconect {
    // Definindo as variáveis de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/sistemasveiculos";  // URL de conexão com o MySQL. Inclui o nome do banco de dados.
    private static final String USUARIO = "root";  // Usuário do banco de dados
    private static final String SENHA = "Uvm@luc15";  // Senha de acesso ao banco de dados

    public static void main(String[] args) {
        // Criando um array de veículos para teste, onde cada tipo de veículo é instanciado com dados diferentes.
        veiculo[] veiculos = {
            new automovel("Gol", 2005, 7, "Preto", true), // Instanciando um automóvel
            new motocicleta("Bis", 2014, 125, 60), // Instanciando uma motocicleta
            new caminhao("Carga", 2018, 6, 18500), // Instanciando um caminhão
            new bicicleta("Profissional", 2023, "Caloi", "Branca", "Carbono", 27, true), // Instanciando uma bicicleta
            new skate("Skate do Tony Hawk", 2024, "Fischer", "Preto", "Lisas") // Instanciando um skate
        };

        try {
            // Carregando manualmente o driver JDBC do MySQL. Isso é necessário para garantir que a classe do driver seja carregada corretamente.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecendo a conexão com o banco de dados
            try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
                // Se a conexão for bem-sucedida, a mensagem será exibida
                System.out.println("Conexão estabelecida com sucesso!");

                // Para cada veículo criado, geramos o comando SQL e o inserimos no banco de dados
                for (veiculo veiculo : veiculos) {
                    inserirDados(conexao, veiculo.gerarInsert()); // Chamando o método para inserir os dados de cada veículo
                }

                // Caso todos os dados sejam inseridos com sucesso, a mensagem será exibida
                System.out.println("Dados inseridos com sucesso!");
            }
        } catch (ClassNotFoundException e) {
            // Caso o driver JDBC não seja encontrado, exibe uma mensagem de erro
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            // Caso haja um erro de SQL (na conexão ou na execução do comando), exibe a mensagem de erro
            System.err.println("Erro ao conectar ou executar comandos no banco: " + e.getMessage());
        }
    }

    // Método que recebe a conexão e o comando SQL para inserir dados no banco
    private static void inserirDados(Connection conexao, String comandoSql) {
        try (PreparedStatement stmt = conexao.prepareStatement(comandoSql)) {
            // Executando o comando SQL de inserção
            stmt.executeUpdate();
            System.out.println("Comando executado: " + comandoSql); // Exibindo o comando executado para conferirmos a operação
        } catch (SQLException e) {
            // Caso ocorra um erro ao executar o comando, exibe a mensagem de erro
            System.err.println("Erro ao executar comando: " + comandoSql);
            System.err.println(e.getMessage());
        }
    }
}
