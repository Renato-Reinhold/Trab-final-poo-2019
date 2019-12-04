package br.com.validacoes;

import java.util.HashMap;
import java.util.Map;

import br.com.beans.LocalPublicacaoBean;

public class ValidaLocalPublicacao {
	private HashMap<Integer, LocalPublicacaoBean> relLocalPublicacao = new HashMap<Integer, LocalPublicacaoBean>();

	public HashMap<Integer, LocalPublicacaoBean> getRelLocalPublicacao() {
		return relLocalPublicacao;
	}

	public void setRelLocalPublicacao(HashMap<Integer, LocalPublicacaoBean> relLocalPublicacao) {
		this.relLocalPublicacao = relLocalPublicacao;
	}
	
	public LocalPublicacaoBean valLocalPublicacao(String nome) {
		for (Map.Entry<Integer, LocalPublicacaoBean> localPublicacao : relLocalPublicacao.entrySet()) {
			if (localPublicacao.getValue().getNmLocalPublicacao().equals(nome)) 
				return localPublicacao.getValue();
		}
		
		int cd = relLocalPublicacao.size() + 1;
		LocalPublicacaoBean obj = new LocalPublicacaoBean(cd, nome);
		relLocalPublicacao.put(cd, obj);
		
		return obj;
	}
}
