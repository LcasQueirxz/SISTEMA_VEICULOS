// Classe para motocicletas
package subClass;


public class motocicleta extends veiculo {
	    private int cilindradas;
	    private int torque;

	    public motocicleta(String tipo, int fab, int cilindradas, int torque) {
	        super(tipo, fab);
	        this.cilindradas = cilindradas;
	        this.torque = torque;
	    }

	    @Override
	    public String gerarInsert() {
	        return String.format(
	            "INSERT INTO Veiculos (tipo, fab, cilindradas, torque) " +
	            "VALUES ('%s', %d, %d, %d);",
	            tipo, fab, cilindradas, torque
	        );
	    }
	}
	