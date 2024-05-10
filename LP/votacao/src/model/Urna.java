package model;

public class Urna {
	int numSection;
	int numCandidt;
	int numvote;
	
public Urna() {
	this.numSection = numSection;
	this.numCandidt = numCandidt;
	this.numvote = numvote;
}

public int getnumSection() {
    return numSection;
}

public void setnumSection(int section) {
	this.numSection = section;
}

public int getnumCandidt() {
    return numCandidt;
}

public void setnumCandidt(int numCandit) {
	this.numCandidt = numCandit;
}

public int getnumvote() {
    return numvote;
}

public void setnumvote(int vote) {
	this.numvote = vote;
}
}