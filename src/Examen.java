
public class Examen 
{
	class Personaje
{
	protected int vida;
	protected int ataque;
	public static final int personajes_creados = 3;
	
	Personaje(int vida, int ataque)
	{
		this.vida = vida;
		this.ataque = ataque;
	}
	
	Personaje(int vida, int ataque, boolean escudo_activado) 
	{
		this.vida = vida;
		this.ataque = ataque;
	}

	Personaje(int vida, int ataque, int flechas) 
	{
		this.vida = vida;
		this.ataque = ataque;
	}

	public int getVida()
	{
		return vida;
	}
	
	public int getAtaque()
	{
		return ataque;
	}

	public void setVida(int vida)
	{
		this.vida = vida;
	}
	
	public void setAtaque (int ataque)
	{
		this.ataque = ataque;
	}
	
	public void poderEspecial()
	{
		
	}
	
}
	

	class Guerrero extends Personaje
	{
	
		Guerrero(int vida, int ataque)
		{
		super(vida, ataque);
		}
	
		public void poderEspecial()
		{
			System.out.println((vida/2) + (ataque *2));
		}
	
	}
	
	class Tanque extends Personaje
	{
		
		private boolean escudo_activado;
		
	
	
		Tanque(int vida, int ataque, boolean escudo_activado )
		{
			super(vida, ataque, escudo_activado);
		}
		
		public void poderEspecial()
		{
			System.out.println(escudo_activado = true) ;
		}
		
		
	}
	
	class Arquero extends Personaje
	{
		private int flechas;
		
		Arquero(int vida, int ataque, int flechas)
		{
			super (vida, ataque, flechas);
		}
	
		
		public void poderEspecial()
		{
			System.out.println(flechas + 5);
		}
	
	}	

	public static void main(String[] args) {
		
	}

}
