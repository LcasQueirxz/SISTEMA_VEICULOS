package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import metodos.*;

public class Main {

    public static void main(String[] args) {
        // Informações de conexão com o banco de dados
        String url = "jdbc:mysql://127.0.0.1:3306/produto";
        String user = "root";
        String password = "Uvm@luc15";

        // Testando funcionalidades
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Criação das tabelas no banco de dados
            DataBase.criarTabelas(conn);

            // Instanciando os produtos
            produto produto1 = new alimento("Bolacha", 1.99, 3.40, "2024-12-19", "Panco, Doces");
            produto produto2 = new vestuario("Camisa", 50.00, 100.00, "G", "Branca", "Algodão");

            // Salvando produtos no banco de dados
            produto1.salvar(conn);
            produto2.salvar(conn);

            // Mensagem de sucesso
            System.out.println("Produto(s) adicionado(s) ao banco de dados.");

            // Consultando produtos
            produto1.consultar(conn, 1);
            produto2.consultar(conn, 2);

            // Atualizando um produto
            produto1.setPrecoVenda(4.75);
            produto1.atualizar(conn, 1);

            // Deletando um produto
            produto2.deletar(conn, 2);

        } catch (SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
            e.printStackTrace();
        }
    }
}