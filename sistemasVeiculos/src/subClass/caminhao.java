
// Classe para caminhoes
package subClass;


public class caminhao extends veiculo {
	    private int eixos;
	    private int pesoBruto;

	    public caminhao(String tipo, int fab, int eixos, int pesoBruto) {
	        super(tipo, fab);
	        this.eixos = eixos;
	        this.pesoBruto = pesoBruto;
	    }

	    @Override
	    public String gerarInsert() {
	        return String.format(
	            "INSERT INTO Veiculos (tipo, fab, eixos, pesoBruto) " +
	            "VALUES ('%s', %d, %d, %d);",
	            tipo, fab, eixos, pesoBruto
	        );
	    }
	}