package game;

abstract class Personagem {
	protected Arma arma;
	protected Armadura armadura;
	protected Vida vida;
	protected String nome;
	
	public Personagem(String nome, Arma arma, Armadura armadura, Vida vida) {
		this.arma = arma;
		this.armadura = armadura;
	    this.vida = vida;
	    this.nome = nome;
	}
	
	
	

	public abstract void defender(int Ataque);
	public abstract void atacar(Personagem adversario);
	public abstract void receberDano(int dano);


	

	
}
