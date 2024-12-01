package metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// Importando classes necessárias para operações com banco de dados

public class alimento extends produto {
    private String validade;
    private String informacoesNutricionais;

    // Construtor da classe Alimento, incluindo atributos da classe pai Produto
    public alimento(String nome, double precoCusto, double precoVenda, String validade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.validade = validade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    // Métodos para operações no banco de dados
    @Override
    public void salvar(Connection conn) throws SQLException {
        String query = "INSERT INTO produtos_alimenticios (nome, preco_custo, preco_venda, data_validade, informacoes_nutricionais) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, precoCusto);
            stmt.setDouble(3, precoVenda);
            stmt.setDate(4, java.sql.Date.valueOf(validade)); 
            stmt.setString(5, informacoesNutricionais);
            stmt.executeUpdate();
        }
    }
    // Método para deletar um registro no banco de dados

    @Override
    public void deletar(Connection conn, int id) throws SQLException {
        String query = "DELETE FROM produtos_alimenticios WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    // Método para atualizar um registro no banco de dados

    @Override
    public void atualizar(Connection conn, int id) throws SQLException {
        String query = "UPDATE produtos_alimenticios SET nome = ?, preco_custo = ?, preco_venda = ?, data_validade = ?, informacoes_nutricionais = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, precoCusto);
            stmt.setDouble(3, precoVenda);
            stmt.setDate(4, java.sql.Date.valueOf(validade)); 
            stmt.setString(5, informacoesNutricionais);
            stmt.setInt(6, id);
            stmt.executeUpdate();
        }
    }
}