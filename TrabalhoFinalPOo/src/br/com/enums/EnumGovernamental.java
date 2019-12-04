package br.com.enums;

public enum EnumGovernamental {

    NAO_GOVERNAMENTAL(0, "não-governamental"),
    GOVERNAMENTAL(1, "governamental");

    private int id;
    private String nm;

    EnumGovernamental(int id, String nm) {
        this.id = id;
        this.nm = nm;
    }

    public static EnumGovernamental get(int id){
        if(id == 0){
            return  GOVERNAMENTAL;
        }else{
            return NAO_GOVERNAMENTAL;
        }
    }
    
    public static EnumGovernamental get(String nm){
        for (EnumGovernamental org : EnumGovernamental.values()) {
			if(org.getNm().equals(nm)) {
				return org;
			}
		}
        return null;
    }

    public int getId() {
        return id;
    }
    
    public String getNm() {
    	return nm;
    }
    
}
