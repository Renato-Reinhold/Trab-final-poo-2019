package br.com.validacoes;

import java.util.HashMap;
import java.util.Map;

import br.com.beans.EditoraBean;

public class ValidaEditora {
	private HashMap<Integer, EditoraBean> relEditora = new HashMap<Integer, EditoraBean>();
	
	public HashMap<Integer, EditoraBean> getRelEditora() {
		return relEditora;
	}

	public void setRelEditora(HashMap<Integer, EditoraBean> relEditora) {
		this.relEditora = relEditora;
	}

	public EditoraBean valEditora(String nome) {
		for (Map.Entry<Integer, EditoraBean> editora : relEditora.entrySet()) {
			if (editora.getValue().getNmEditora().equals(nome))
				return editora.getValue();
		}
		
		int cd = relEditora.size() + 1;
		EditoraBean obj = new EditoraBean(cd, nome);
		relEditora.put(cd, obj);
		
		return obj;
	}
}
