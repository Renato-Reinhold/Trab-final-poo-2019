package br.com.beans;

public class LocalPublicacaoBean {

    private int cdLocalPublicacao;
    private String nmLocalPublicacao;

    public LocalPublicacaoBean(int cdLocalPublicacao, String nmLocalPublicacao) {
		this.cdLocalPublicacao = cdLocalPublicacao;
		this.nmLocalPublicacao = nmLocalPublicacao;
	}
    
	public LocalPublicacaoBean(String nmLocalPublicacao) {
		this.nmLocalPublicacao = nmLocalPublicacao;
	}

	public int getCdLocalPublicacao() {
        return cdLocalPublicacao;
    }

    public void setCdLocalPublicacao(int cdLocalPublicacao) {
        this.cdLocalPublicacao = cdLocalPublicacao;
    }

    public String getNmLocalPublicacao() {
        return nmLocalPublicacao;
    }

    public void setNmLocalPublicacao(String nmLocalPublicacao) {
        this.nmLocalPublicacao = nmLocalPublicacao;
    }
}
