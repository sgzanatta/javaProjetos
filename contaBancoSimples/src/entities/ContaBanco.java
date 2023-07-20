package entities;

public class ContaBanco {

	//ATRIBUTOS
	private int numero;
	private String titular;
	private double saldoConta;
	
	//CONSTRUTOR
	public ContaBanco(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public ContaBanco(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		depositar(depositoInicial);
	}

	//METODOS
	public void depositar(double quantidade) {
		saldoConta += quantidade;
	}
	
	public void sacar(double quantidade) {
		saldoConta -= quantidade + 5;
	}
	
	//METODOS ESPECIAIS
	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldoConta() {
		return saldoConta;
	}

	@Override
	public String toString() {
		return 	"Conta "
				+ numero
				+ ", titular: " 
				+ titular 
				+ ", Saldo da conta: $" 
				+ String.format("%.2f", saldoConta);
	}	
}
