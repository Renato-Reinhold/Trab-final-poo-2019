package br.com.validacoes;

import java.util.HashMap;
import java.util.Map;

import br.com.beans.PalavraChaveBean;

public class ValidaPalavraChave {
	private HashMap<Integer, PalavraChaveBean> relPalavraChava = new HashMap<Integer, PalavraChaveBean>();

	public HashMap<Integer, PalavraChaveBean> getRelPalavraChava() {
		return relPalavraChava;
	}

	public void setRelPalavraChava(HashMap<Integer, PalavraChaveBean> relPalavraChava) {
		this.relPalavraChava = relPalavraChava;
	}
	
	public PalavraChaveBean valPalavraChave(String nome) {
		for (Map.Entry<Integer, PalavraChaveBean> palavraChave : relPalavraChava.entrySet()) {
			if (palavraChave.getValue().getNmPalavraChave().equals(nome))
				return palavraChave.getValue();
		}
		
		int cd = relPalavraChava.size() + 1;
		PalavraChaveBean obj = new PalavraChaveBean(cd, nome);
		relPalavraChava.put(cd, obj);
		
		return obj;
	}
}
