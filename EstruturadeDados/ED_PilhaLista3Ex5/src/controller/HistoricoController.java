package controller;

import control.Pilha;

public class HistoricoController {
	public void inserirEndereco(Pilha historico, String endereco) throws Exception{
		if (endereco == null || endereco.isEmpty()) {
			throw new Exception("Endereço inválido, o endereço não pode ser vazio");
		}
		
		if (!endereco.startsWith("http://www.")) 
		{
			throw new Exception("Endereço inválido, o endereço deve começar com http ou https e conter www");
		}
		if (endereco.chars().filter(ch -> ch == '.').count() < 2) 
		{
			throw new Exception("Endereco inválido o endereço deve ser por exemplo: http://www.oo.com");
		}
		
		historico.push(endereco);
		
	}
	public String consultLastAdress(Pilha historico) throws Exception{
		if(historico.isEmpty())
		{
			throw new Exception("Histórico vazio");
		}
		
		return historico.top();
	}
	public void removerUltimoEndereco(Pilha historico) throws Exception{
		if (historico.isEmpty())
		{
			throw new Exception("Histórico vazio");
		}
		historico.pop();
	}
	

}
