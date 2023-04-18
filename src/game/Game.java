package game;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arqueiro arqueiro = new Arqueiro("arqueiro", new Arco(), new ArmaduraMetal(), new VidaArqueiro());
		Mago mago = new Mago("mago", new Cajado(), new ArmaduraMetal(), new VidaMago());
		
		arqueiro.atacar(mago);
	    
	    mago.atacar(arqueiro);
	   
	    arqueiro.atacar(mago);
	   
	    mago.atacar(arqueiro);
	  
	}

}
