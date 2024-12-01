package metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Importando classes necessárias para operações com banco de dados

public class produto {
    protected String nome;
    protected double precoCusto;
    protected double precoVenda;

    // Construtor da classe Produto com atributos que serão usados nas subclasses
    public produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // Método para calcular o lucro
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    // Métodos para operações no banco de dados
    public void salvar(Connection conn) throws SQLException {
        String query = "INSERT INTO produtos (nome, preco_custo, preco_venda) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, precoCusto);
            stmt.setDouble(3, precoVenda);
            stmt.executeUpdate();
        }
    }
    // Método para deletar um registro do banco de dados com base no ID do produto
    public void deletar(Connection conn, int id) throws SQLException {
        String query = "DELETE FROM produtos WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    // Método para atualizar um registro no banco de dados
    public void atualizar(Connection conn, int id) throws SQLException {
        String query = "UPDATE produtos SET nome = ?, preco_custo = ?, preco_venda = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, precoCusto);
            stmt.setDouble(3, precoVenda);
            stmt.setInt(4, id);
            stmt.executeUpdate();
        }
    }
    // Métodos para definir o preço de venda e consultar dados do produto no banco de dados
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void consultar(Connection conn, int id) {
        // Implementação do método de consulta
    }
}