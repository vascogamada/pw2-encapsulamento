
public class TestaCaixa {
	
	public static void main(String[] args) {
		int diametro = 3;
		
		Caixa c = new Caixa();
		c.setLargura(3);
		c.setProfundidade(5);
		c.setAltura(2);
		
		c.cabeDentro(diametro);
	}
	
}
