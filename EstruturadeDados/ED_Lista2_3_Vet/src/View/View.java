package View;
import Control.Quant_Par;

public class View {
	public static void main(String[] args) {
		Quant_Par qp= new Quant_Par();
		int [] vet = {1,2,3,4,5,6,8};
		int tam = vet.length;
		int result= qp.Qp(vet,tam-1);
	
		System.out.println(result);
	}
}
