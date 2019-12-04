package br.com.validacoes;

import java.util.HashMap;
import java.util.Map;

import br.com.beans.TipoDivulgacaoBean;

public class ValidaTipoDivulgacao {
	private HashMap<Integer, TipoDivulgacaoBean> relTipoDivulgacao = new HashMap<Integer, TipoDivulgacaoBean>();

	public HashMap<Integer, TipoDivulgacaoBean> getRelTipoDivulgacao() {
		return relTipoDivulgacao;
	}

	public void setRelTipoDivulgacao(HashMap<Integer, TipoDivulgacaoBean> relTipoDivulgacao) {
		this.relTipoDivulgacao = relTipoDivulgacao;
	}
	
	public TipoDivulgacaoBean valTipoDivulgacao(String nome) {
		for (Map.Entry<Integer, TipoDivulgacaoBean> tipoDivulgacao : relTipoDivulgacao.entrySet()) {
			if (tipoDivulgacao.getValue().getDsDivulgacao().equals(nome))
				return tipoDivulgacao.getValue();
		}
		
		int cd = relTipoDivulgacao.size();
		TipoDivulgacaoBean obj = new TipoDivulgacaoBean(cd, nome);
		relTipoDivulgacao.put(cd, obj);
		
		return obj;
	}
}
