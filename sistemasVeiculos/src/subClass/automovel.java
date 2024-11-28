//Classe para automoveis domesticos
package subClass;

public class automovel extends veiculo {
	    private int passageiros;
	    private String freio;
	    private boolean airbag;

	    public automovel(String tipo, int fab, int passageiros, String freio, boolean airbag) {
	        super(tipo, fab);
	        this.passageiros = passageiros;
	        this.freio = freio;
	        this.airbag = airbag;
	    }

	    @Override
	    public String gerarInsert() {
	        return String.format(
	            "INSERT INTO Veiculos (tipo, fab, passageiros, freio, airbag) " +
	            "VALUES ('%s', %d, %d, '%s', %b);",
	            tipo, fab, passageiros, freio, airbag
	        );
	    }
	}