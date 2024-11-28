package subClass;


	public class skate extends veiculo {
	    private String marca;
	    private String cor;
	    private String tipoRodas;

	    public skate(String tipo, int fab, String marca, String cor, String tipoRodas) {
	        super(tipo, fab);
	        this.marca = marca;
	        this.cor = cor;
	        this.tipoRodas = tipoRodas;
	    }

	    @Override
	    public String gerarInsert() {
	        return String.format(
	            "INSERT INTO Veiculos (tipo, fab, marca, cor, tipoRodas) " +
	            "VALUES ('%s', %d, '%s', '%s', '%s');",
	            tipo, fab, marca, cor, tipoRodas
	        );
	    }
	}