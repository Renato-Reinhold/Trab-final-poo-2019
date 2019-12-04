package br.com.validacoes;

import java.util.HashMap;
import java.util.Map;

import br.com.beans.TipoMaterialBean;

public class ValidaTipoMaterial {
	private HashMap<Integer, TipoMaterialBean> relTipoMaterial = new HashMap<Integer, TipoMaterialBean>();

	public HashMap<Integer, TipoMaterialBean> getRelTipoMaterial() {
		return relTipoMaterial;
	}

	public void setRelTipoMaterial(HashMap<Integer, TipoMaterialBean> relTipoMaterial) {
		this.relTipoMaterial = relTipoMaterial;
	}
	
	public TipoMaterialBean valTipoMaterial(String nome) {
		for (Map.Entry<Integer, TipoMaterialBean> tipoMaterial : relTipoMaterial.entrySet()) {
			if (tipoMaterial.getValue().getDsMaterial().equals(nome))
				return tipoMaterial.getValue();
		}
		
		int cd = relTipoMaterial.size() + 1;
		TipoMaterialBean obj = new TipoMaterialBean(cd, nome);
		relTipoMaterial.put(cd, obj);
		
		return obj;
	}
}
