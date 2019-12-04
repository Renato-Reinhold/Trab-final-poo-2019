package br.com.validacoes;

import java.util.HashMap;
import java.util.Map;

import br.com.beans.EntidadeBean;
import br.com.enums.EnumGovernamental;

public class ValidaEntidade {
	private HashMap<Integer, EntidadeBean> relEntidade = new HashMap<Integer, EntidadeBean>();

	public HashMap<Integer, EntidadeBean> getRelEntidade() {
		return relEntidade;
	}

	public void setRelEntidade(HashMap<Integer, EntidadeBean> relEntidade) {
		this.relEntidade = relEntidade;
	}
	
	public EntidadeBean valEntidade(String nome, String tipo) {
		for (Map.Entry<Integer, EntidadeBean> entidade : relEntidade.entrySet()) {
			if (entidade.getValue().getNmEntidade().equals(nome))
				return entidade.getValue();
		}
		
		int cd = relEntidade.size();
		
		EntidadeBean obj = new EntidadeBean();
		obj.setCdEntidade(cd);
		
		if (tipo.equalsIgnoreCase("\"governamental\""))
			obj.setIsGovernamental(EnumGovernamental.GOVERNAMENTAL);
		else
			obj.setIsGovernamental(EnumGovernamental.NAO_GOVERNAMENTAL);
		
		obj.setNmEntidade(nome);
		
		relEntidade.put(cd, obj);
		
		return obj;
	}
}
