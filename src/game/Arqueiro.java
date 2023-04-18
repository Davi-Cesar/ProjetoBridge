package game;

public class Arqueiro extends Personagem{
	
	public Arqueiro(String nome, Arma arma, Armadura armadura, Vida vida) {
	     super(nome, arma, armadura, vida);
	}

	
	@Override
    public void atacar(Personagem alvo) {
        int dano = arma.ataque();
        System.out.println(nome + "[" + vida.getQuantidade() + "]" + " ataque " + arma.getNome() + "[" + dano + "]");
        alvo.receberDano(dano);
        System.out.println(alvo.nome + "[" + alvo.vida.getQuantidade() + "] ");
    }

	

	@Override
	public void receberDano(int dano) {
		vida.receberDano(dano);
        if (vida.getQuantidade() <= 0) {
            System.out.println(nome + " morreu!");
        } 
	}


	@Override
	public void defender(int Ataque) {
		// TODO Auto-generated method stub
		
	}
	
}
