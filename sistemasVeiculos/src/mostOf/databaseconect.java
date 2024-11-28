package mostOf;

import subClass.*; // Chamando todas as classes da pasta subClass.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class databaseconect {
    // Parâmetros de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/sistemasveiculos";  // Adicionando useSSL=false
    private static final String USUARIO = "root";
    private static final String SENHA = "Uvm@luc15";

    public static void main(String[] args) {
        // Criando os objetos
        veiculo[] veiculos = {
            new automovel("Gol", 2005, 7, "Preto", true),
            new motocicleta("Bis", 2014, 125, 60),
            new caminhao("Carga", 2018, 6, 18500),
            new bicicleta("Profissional", 2023, "Caloi", "Branca", "Carbono", 27, true),
            new skate("Skate do Tony Hawk", 2024, "Fischer", "Preto", "Lisas")
        };

        try {
            // Carregar o driver JDBC manualmente
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer a conexão
            try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
                System.out.println("Conexão estabelecida com sucesso!");

                // Inserindo os veículos
                for (veiculo veiculo : veiculos) {
                    inserirDados(conexao, veiculo.gerarInsert());
                }

                System.out.println("Dados inseridos com sucesso!");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ou executar comandos no banco: " + e.getMessage());
        }
    }

    private static void inserirDados(Connection conexao, String comandoSql) {
        try (PreparedStatement stmt = conexao.prepareStatement(comandoSql)) {
            stmt.executeUpdate();
            System.out.println("Comando executado: " + comandoSql);
        } catch (SQLException e) {
            System.err.println("Erro ao executar comando: " + comandoSql);
            System.err.println(e.getMessage());
        }
    }
}
