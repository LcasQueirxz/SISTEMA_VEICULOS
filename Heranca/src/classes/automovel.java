//Classe para automoveis domesticos
package classes;

public class automovel extends veiculo {
 private int maxPassageiros;
 private String tipoFreio;
 private boolean airbag;

 // Construtor
 public automovel(String modelo, int anoFabricacao, String montadora, String cor, int odometro, int maxPassageiros, String tipoFreio, boolean airbag) {
     super(modelo, anoFabricacao, montadora, cor, odometro);
     this.maxPassageiros = maxPassageiros;
     this.tipoFreio = tipoFreio;
     this.airbag = airbag;
 }

 // Getters e Setters
 public int getMaxPassageiros() { return maxPassageiros; }
 public void setMaxPassageiros(int maxPassageiros) { this.maxPassageiros = maxPassageiros; }

 public String getTipoFreio() { return tipoFreio; }
 public void setTipoFreio(String tipoFreio) { this.tipoFreio = tipoFreio; }

 public boolean isAirbag() { return airbag; }
 public void setAirbag(boolean airbag) { this.airbag = airbag; }

 // Override do metodo gerarInsert
 @Override
 public String gerarInsert() {
     return String.format("INSERT INTO Automovel (modelo, anoFabricacao, montadora, cor, odometro, maxPassageiros, tipoFreio, airbag) VALUES ('%s', %d, '%s', '%s', %d, %d, '%s', %b);",
             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getOdometro(), maxPassageiros, tipoFreio, airbag);
 }
}

