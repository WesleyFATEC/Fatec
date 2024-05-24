package model;

public class Votacao  {
	int secao;
	int candidato;


public Votacao (int secao, int candidato){
	this.secao = secao;
	this.candidato = candidato;
}

public int getSecao() {
    return secao;
}

public void setSecao (int section) {
	this.secao = section;
}

public int getCandidato () {
	return candidato;
}

public void setCandidato(int candidato) {
	this.candidato =candidato;
}

}