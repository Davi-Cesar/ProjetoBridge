package game;

public class Cajado implements Arma {
	private String nome = "Cajado";
	private int ataque = 10;


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
