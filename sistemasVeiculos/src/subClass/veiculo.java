package subClass;

public class veiculo {
	    protected String tipo;
	    protected int fab;

	    public veiculo(String tipo, int fab) {
	        this.tipo = tipo;
	        this.fab = fab;
	    }

	    public String gerarInsert() {
	        return String.format(
	            "INSERT INTO Veiculos (tipo, fab) VALUES ('%s', %d);",
	            tipo, fab
	        );
	    }
	}