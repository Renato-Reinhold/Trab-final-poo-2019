package br.com.beans;

import br.com.enums.EnumGovernamental;

public class EntidadeBean {

    private int cdEntidade;
    private String nmEntidade;
    private EnumGovernamental isGovernamental;

    public EntidadeBean(int cdEntidade, String nmEntidade, int isGovernamental){
        this.cdEntidade = cdEntidade;
        this.nmEntidade = nmEntidade;
        this.isGovernamental = EnumGovernamental.get(isGovernamental);
    }
    
    public EntidadeBean(String nmEntidade, EnumGovernamental isGovernamental) {
		this.nmEntidade = nmEntidade;
		this.isGovernamental = isGovernamental;
	}

	public EntidadeBean () {
		
	}

    public int getCdEntidade() {
        return cdEntidade;
    }

    public void setCdEntidade(int cdEntidade) {
        this.cdEntidade = cdEntidade;
    }

    public String getNmEntidade() {
        return nmEntidade;
    }

    public void setNmEntidade(String nmEntidade) {
        this.nmEntidade = nmEntidade;
    }

    public EnumGovernamental getIsGovernamental() {
        return isGovernamental;
    }

    public void setIsGovernamental(EnumGovernamental isGovernamental) {
        this.isGovernamental = isGovernamental;
    }
}
