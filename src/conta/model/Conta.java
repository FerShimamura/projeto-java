package conta.model;

public abstract class Conta {
	
	private int numero;
	private int tipo;
	private int qtnd;
	private float preco;
	String cliente;
	public Conta(int numero, int tipo, int qtnd, float preco, String cliente) {
		this.numero = numero;
		this.tipo = tipo;
		this.qtnd = qtnd;
		this.preco = preco;
		this.cliente = cliente;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public float getQtnd() {
		return qtnd;
	}
	public void setValor(int qtnd) {
		this.qtnd = qtnd;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void cobrar (int qtnd) {
}
}