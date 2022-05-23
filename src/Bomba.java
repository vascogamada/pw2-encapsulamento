
public class Bomba 
{
	private int pressaoDesejada, pressaoLida;

	public int getPressaoDesejada() {
		return pressaoDesejada;
	}

	public void setPressaoDesejada(int pressaoDesejada) {
		this.pressaoDesejada = pressaoDesejada;
	}

	public int getPressaoLida() {
		return pressaoLida;
	}

	public void setPressaoLida(int pressaoLida) {
		this.pressaoLida = pressaoLida;
	}
	
	public int obterResultado()
	{
		int resultado;
		
		resultado = this.pressaoDesejada - this.pressaoLida;
		
		return resultado;
	}
}
