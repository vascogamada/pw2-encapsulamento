
public class Caixa {
	private int altura;
	private int largura;
	private int profundidade;

	public void cabeDentro(int diametro) {
		if (diametro <= largura && diametro <= altura && diametro <= profundidade) {
			System.out.println("Cabe.");
		}
		else {
			System.out.println("Não cabe.");
		}
	}
	
	
	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	
}
