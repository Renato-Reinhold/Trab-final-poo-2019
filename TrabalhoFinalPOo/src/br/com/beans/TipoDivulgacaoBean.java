package br.com.beans;

public class TipoDivulgacaoBean {

    private int tpDivulgacao;
    private String dsDivulgacao;

    public TipoDivulgacaoBean(int tpDivulgacao, String dsDivulgacao) {
		this.tpDivulgacao = tpDivulgacao;
		this.dsDivulgacao = dsDivulgacao;
	}
    
	public TipoDivulgacaoBean(String dsDivulgacao) {
		this.dsDivulgacao = dsDivulgacao;
	}

	public int getTpDivulgacao() {
        return tpDivulgacao;
    }

    public void setTpDivulgacao(int tpDivulgacao) {
        this.tpDivulgacao = tpDivulgacao;
    }

    public String getDsDivulgacao() {
        return dsDivulgacao;
    }

    public void setDsDivulgacao(String dsDivulgacao) {
        this.dsDivulgacao = dsDivulgacao;
    }
}
