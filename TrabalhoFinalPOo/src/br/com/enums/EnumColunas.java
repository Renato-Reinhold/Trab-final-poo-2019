package br.com.enums;

public enum EnumColunas {

	TP_MATERIA("Tipo de material"),
	DIVULGACAO("Meio de divulgação"),
	ENTIDADE("Entidade"),
	TP_ORGANIZACAO("Tipo de organização"),
	AUTOR("Autor"),
	TITULO("Título"),
	PALAVRA_CHAVE("Palavras-chave ou descritores"),
	ANO_PRODUCAO("Ano da produção"),
	ANO_PUBLICACAO("Ano da publicação"),
	EDICAO("Edição"),
	LOCAL_PUBLICACAO("Local de publicação"),
	EDITORA("Editora"),
	NR_PAGINAS_MINUTOS("Número de páginas/minutos"),
	SITE("Disponível em"),
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
