// Classe para motocicletas
package classes;


public class motocicleta extends veiculo {
    private int cilindradas;
    private int torque;

    // Construtor
    public motocicleta(String modelo, int anoFabricacao, String montadora, String cor, int odometro, int cilindradas, int torque) {
        super(modelo, anoFabricacao, montadora, cor, odometro);
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    // Getters e Setters
    public int getCilindradas() { return cilindradas; }
    public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }

    public int getTorque() { return torque; }
    public void setTorque(int torque) { this.torque = torque; }

    // Override do metodo gerarInsert
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Motocicleta (modelo, anoFabricacao, montadora, cor, odometro, cilindradas, torque) VALUES ('%s', %d, '%s', '%s', %d, %d, %d);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getOdometro(), cilindradas, torque);
    }
}
