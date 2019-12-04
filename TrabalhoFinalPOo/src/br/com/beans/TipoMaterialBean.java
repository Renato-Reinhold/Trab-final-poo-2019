package br.com.beans;

public class TipoMaterialBean {

    private int tpMaterial;
    private String dsMaterial;

    public TipoMaterialBean(int tpMaterial, String dsMaterial) {
		this.tpMaterial = tpMaterial;
		this.dsMaterial = dsMaterial;
	}
    
	public TipoMaterialBean(String dsMaterial) {
		this.dsMaterial = dsMaterial;
	}

	public int getTpMaterial() {
        return tpMaterial;
    }

    public void setTpMaterial(int tpMaterial) {
        this.tpMaterial = tpMaterial;
    }

    public String getDsMaterial() {
        return dsMaterial;
    }

    public void setDsMaterial(String dsMaterial) {
        this.dsMaterial = dsMaterial;
    }
}
