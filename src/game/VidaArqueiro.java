package game;

public class VidaArqueiro implements Vida{
	private int vida = 120;
	
	@Override
	public int getQuantidade() {
		return vida;
	}
	@Override
	public void receberDano(int dano) {
		this.vida = vida - dano;
	}
}

