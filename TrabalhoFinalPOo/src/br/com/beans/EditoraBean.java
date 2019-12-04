package br.com.beans;

public class EditoraBean {

    private int cdEditora;
    private String nmEditora;

    public EditoraBean(int cdEditora, String nmEditora) {
		this.cdEditora = cdEditora;
		this.nmEditora = nmEditora;
	}
    
	public EditoraBean(String nmEditora) {
		this.nmEditora = nmEditora;
	}

	public int getCdEditora() {
        return cdEditora;
    }

    public void setCdEditora(int cdEditora) {
        this.cdEditora = cdEditora;
    }

    public String getNmEditora() {
        return nmEditora;
    }

    public void setNmEditora(String nmEditora) {
        this.nmEditora = nmEditora;
    }
}
