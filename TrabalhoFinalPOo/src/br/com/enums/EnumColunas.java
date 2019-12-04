package br.com.enums;

public enum EnumColunas {

	TP_MATERIA("Tipo de material"),
	DIVULGACAO("Meio de divulga��o"),
	ENTIDADE("Entidade"),
	TP_ORGANIZACAO("Tipo de organiza��o"),
	AUTOR("Autor"),
	TITULO("T�tulo"),
	PALAVRA_CHAVE("Palavras-chave ou descritores"),
	ANO_PRODUCAO("Ano da produ��o"),
	ANO_PUBLICACAO("Ano da publica��o"),
	EDICAO("Edi��o"),
	LOCAL_PUBLICACAO("Local de publica��o"),
	EDITORA("Editora"),
	NR_PAGINAS_MINUTOS("N�mero de p�ginas/minutos"),
	SITE("Dispon�vel em"),
	ISBN("ISBN"),
	ISSN("ISBN");
	
	
	private String nmColuna;

	private EnumColunas(String nmColuna) {
		this.nmColuna = nmColuna;
	}
	
	public String getNmColuna() {
		return nmColuna;
	}
	
	public static EnumColunas get(String nmColuna) {
		for (EnumColunas colunas : EnumColunas.values()) {
			if (colunas.getNmColuna().equals(nmColuna)) {
				return colunas;
			}
		}
		return null;
	}
	
}
