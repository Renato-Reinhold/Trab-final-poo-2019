package br.com.validacoes;

import java.util.HashMap;
import java.util.Map;

import br.com.beans.AutorBean;

public class ValidaAutor {
	private HashMap<Integer, AutorBean> relAutor = new HashMap<Integer, AutorBean>();

	public HashMap<Integer, AutorBean> getRelAutor() {
		return relAutor;
	}

	public void setRelAutor(HashMap<Integer, AutorBean> relAutor) {
		this.relAutor = relAutor;
	}
	
	public AutorBean valAutor(String nome) {
		for (Map.Entry<Integer, AutorBean> autor : relAutor.entrySet()) {
			if (autor.getValue().getNmAutor().equals(nome))
				return autor.getValue();
		}
		
		int cd = relAutor.size() + 1;
		AutorBean obj = new AutorBean(cd, nome);
		relAutor.put(cd, obj);
		
		return obj;
	}
}
