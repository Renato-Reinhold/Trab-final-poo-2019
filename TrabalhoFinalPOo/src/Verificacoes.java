import java.util.ArrayList;

import br.com.beans.MaterialBean;
import br.com.beans.TipoMaterialBean;

public class Verificacoes {
	public TipoMaterialBean verificaTipoMaterial(ArrayList<MaterialBean> listaMateriais, TipoMaterialBean tipoMat) {
		
		for (MaterialBean dados : listaMateriais) {
			if (dados.getMaterial().getDsMaterial().equals(tipoMat.getDsMaterial()))
				return dados.getMaterial();
		}
		return tipoMat;
	}
}
