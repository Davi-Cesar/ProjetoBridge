package game;


public class Arco implements Arma {
	private String nome = "Arco";
	private int ataque = 7;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int ataque() {
		return ataque;
	}

	
}
