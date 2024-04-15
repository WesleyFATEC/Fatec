package controller;

import br.com.fatec.filaGeneric.Fila;
import model.Document;

public class ImpressoraController {

	public void insereDocumento(Fila fprint, Document document) {
		fprint.insert(document);
	}

	public void imprime(Fila<Document> fprint) throws Exception {
		if (fprint.isEmpty()) {
			throw new Exception("Não há documentos na fila de impressão");
		}
		
		Document document = (Document) fprint.remove();
		double timeshow = document.getTime()/1000;
		System.out.println("[#PC:"+document.getId()
				+ " - Arquivo: " + document.getName()
				+ "] Impressão será concluida em:"
				+  timeshow
				+ " segundos");
		
		Thread.sleep(document.getTime());
		System.out.println("Impressão Concluída");
		
	}

}
