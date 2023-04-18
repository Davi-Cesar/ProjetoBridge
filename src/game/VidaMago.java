package game;

public class VidaMago implements Vida{
	private int vida = 100;
	
	@Override
	public int getQuantidade() {
		return vida;
	}
	@Override
	public void receberDano(int dano) {
		this.vida = vida - dano;
	}
}
