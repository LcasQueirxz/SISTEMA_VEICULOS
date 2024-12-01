package Main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    public static void criarTabelas(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            // Criação da tabela para produtos alimentícios
            String tabelaAlimentos = """
                CREATE TABLE IF NOT EXISTS produtos_alimenticios (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    nome VARCHAR(255) NOT NULL,
                    preco_custo DOUBLE NOT NULL,
                    preco_venda DOUBLE NOT NULL,
                    data_validade DATE NOT NULL,
                    informacoes_nutricionais TEXT
                );
            """;

            // Criação da tabela para produtos de vestuário
            String tabelaVestuarios = """
                CREATE TABLE IF NOT EXISTS produtos_vestuario (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    nome VARCHAR(255) NOT NULL,
                    preco_custo DOUBLE NOT NULL,
                    preco_venda DOUBLE NOT NULL,
                    tamanho VARCHAR(10),
                    cor VARCHAR(50),
                    material VARCHAR(100)
                );
            """;

            // Executa as instruções de criação das tabelas
            stmt.execute(tabelaAlimentos);
            stmt.execute(tabelaVestuarios);
        }
    }
}