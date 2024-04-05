package control;


public class Controller {

 
 public int [][] Retirada ( int [] cx, int quantSaque, int valor, int [][] notasRetiradas, int i)throws Exception {
	
	if (valor == 0) {
		quantSaque -=1;
		return notasRetiradas;
	}
	else if (quantSaque<=0) {
		throw new Exception("Quantidade de saque atingiu o limite");
	}
	else if (cx[i]>0 && valor<10 && valor%2 == 0) {
		i=0;
		return Retirada (cx,quantSaque,valor, notasRetiradas,i);
	}
	else if(cx[i]>0 && valor>notasRetiradas[i][1]){
		notasRetiradas[i][0] += 1;
		valor -= notasRetiradas [i][1];
		cx[i] -= 1;
		i--;
		
		return Retirada (cx,quantSaque,valor, notasRetiradas,i);
	}
	
		return Retirada (cx,quantSaque,valor, notasRetiradas,i);
	
	
}


public void EncherCx(int[] cx, int quant)
{
	 for (int i =0 ; i < cx.length-1; i++)
	 {
	 cx[i] = quant;
};
	
}
 

 
}


