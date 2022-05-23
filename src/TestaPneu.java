
public class TestaPneu 
{
	public static void main(String[] args) 
	{
		Bomba pneu = new Bomba();
		
		pneu.setPressaoDesejada(27); 
		pneu.setPressaoLida(30);
		
		
		
		System.out.println(pneu.obterResultado());
				
	}

}
