package Control;

public class QuantDig {
	public int Quant_Dig(int n) {
		if(n<10){
			return 1;
			//condicao de parada quando n for menor do q 10 retorna 1,
			//já que todo numero inteiro menor que 10 contém apenas um digito
		}
		else {
			return 1 + Quant_Dig(n/10);
			//soma 1 e divide n por 10 diminuindo assim uma casa decimal em n, para cada chamada da funcao; 
		}

	}
}
