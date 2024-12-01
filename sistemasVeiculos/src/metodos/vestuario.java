package metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// Importando classes necessárias para operações com banco de dados

public class vestuario extends produto {
    private String tamanho;
    private String cor;
    private String material;

    // Construtor da classe Vestuario, incluindo atributos da classe pai Produto
    public vestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    // Métodos para operações no banco de dados
    @Override
    public void salvar(Connection conn) throws SQLException {
        String query = "INSERT INTO produtos_vestuario (nome, preco_custo, preco_venda, tamanho, cor, material) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, precoCusto);
            stmt.setDouble(3, precoVenda);
            stmt.setString(4, tamanho);
            stmt.setString(5, cor);
            stmt.setString(6, material);
            stmt.executeUpdate();
        }
    }
    // Método para deletar um registro do banco de dados com base no ID do produto
    @Override
    public void deletar(Connection conn, int id) throws SQLException {
        String query = "DELETE FROM produtos_vestuario WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    // Método para atualizar um registro no banco de dados
    @Override
    public void atualizar(Connection conn, int id) throws SQLException {
        String query = "UPDATE produtos_vestuario SET nome = ?, preco_custo = ?, preco_venda = ?, tamanho = ?, cor = ?, material = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, precoCusto);
            stmt.setDouble(3, precoVenda);
            stmt.setString(4, tamanho);
            stmt.setString(5, cor);
            stmt.setString(6, material);
            stmt.setInt(7, id);
            stmt.executeUpdate();
        }
    }
}


