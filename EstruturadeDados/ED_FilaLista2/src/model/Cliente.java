package model;

public class Cliente {
    String nome;
    int quant;
    double value;


	public Cliente() {
		this.nome = nome;
		this.quant =  quant;
		this.value = value;
	}

	public String getNome() {
	    return nome;
	}
	
	public void setNome(String nome) {
	    this.nome = nome;
	}
	
	public int getQuantidade() {
	    return quant;
	}
	
	public void setQuantidade(int quantidade) {
	    this.quant = quantidade;
	}
	
	public double getValor() {
	    return value;
	}
	
	public void setValor(double valor) {
	    this.value = valor;
	}
}
