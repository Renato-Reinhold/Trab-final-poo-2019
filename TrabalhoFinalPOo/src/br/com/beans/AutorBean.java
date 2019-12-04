package br.com.beans;

public class AutorBean {

    private int cdAutor;
    private String nmAutor;

    public AutorBean(int cdAutor, String nmAutor) {
		this.cdAutor = cdAutor;
		this.nmAutor = nmAutor;
	}
    
	public AutorBean(String nmAutor) {
		this.nmAutor = nmAutor;
	}

	public int getCdAutor() {
        return cdAutor;
    }

    public void setCdAutor(int cdAutor) {
        this.cdAutor = cdAutor;
    }

    public String getNmAutor() {
        return nmAutor;
    }

    public void setNmAutor(String nmAutor) {
        this.nmAutor = nmAutor;
    }
}
