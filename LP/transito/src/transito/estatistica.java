package transito;

class estatistica {
 static int cod;
 static String cidade;
 static int qtdAcid;
 
 estatistica () {
	 this(0,"",0);
 }

public estatistica(int CodCidade   , String NomeCidade  , int QtdAcidentes ) {
	cod = CodCidade;
	cidade = NomeCidade;
	qtdAcid = QtdAcidentes;
}


}
       