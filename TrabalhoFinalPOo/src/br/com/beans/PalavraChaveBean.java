package br.com.beans;

public class PalavraChaveBean {

    private int cdPalavraChave;
    private String nmPalavraChave;
    
    public PalavraChaveBean(int cdPalavraChave, String nmPalavraChave) {
		this.cdPalavraChave = cdPalavraChave;
		this.nmPalavraChave = nmPalavraChave;
	}

    public PalavraChaveBean(String nmPalavraChave) {
        this.nmPalavraChave = nmPalavraChave;
    }

    public int getCdPalavraChave() {
        return cdPalavraChave;
    }

    public void setCdPalavraChave(int cdPalavraChave) {
        this.cdPalavraChave = cdPalavraChave;
    }

    public String getNmPalavraChave() {
        return nmPalavraChave;
    }

    public void setNmPalavraChave(String nmPalavraChave) {
        this.nmPalavraChave = nmPalavraChave;
    }
}
