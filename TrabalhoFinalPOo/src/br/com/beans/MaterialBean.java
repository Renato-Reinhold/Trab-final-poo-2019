package br.com.beans;

import java.util.List;

public class MaterialBean {

    private int cdMaterial;
    private EditoraBean editora;
    private EntidadeBean entidade;
    private LocalPublicacaoBean localPublicacao;
    private TipoMaterialBean tpMaterial;
    private TipoDivulgacaoBean divulgacao;
    private List<AutorBean> autores;
    private List<PalavraChaveBean> palavrasChave;
    private String nmTitulo;
    private String dsAnoProducao;
    private String dsAnoPublicao;
    private String dsEdicao;
    private int nrPaginas;
    private String dsUrlDisponivel;
    private String nrISBN;
    private String nrISSN;

    public MaterialBean(EditoraBean editora, EntidadeBean entidade, LocalPublicacaoBean localPublicacao,
			TipoMaterialBean tpMaterial, TipoDivulgacaoBean divulgacao, List<AutorBean> autores,
			List<PalavraChaveBean> palavrasChave, String nmTitulo, String dsAnoProducao, String dsAnoPublicao,
			String dsEdicao, int nrPaginas, String dsUrlDisponivel, String nrISBN, String nrISSN) {
		this.editora = editora;
		this.entidade = entidade;
		this.localPublicacao = localPublicacao;
		this.tpMaterial = tpMaterial;
		this.divulgacao = divulgacao;
		this.autores = autores;
		this.palavrasChave = palavrasChave;
		this.nmTitulo = nmTitulo;
		this.dsAnoProducao = dsAnoProducao;
		this.dsAnoPublicao = dsAnoPublicao;
		this.dsEdicao = dsEdicao;
		this.nrPaginas = nrPaginas;
		this.dsUrlDisponivel = dsUrlDisponivel;
		this.nrISBN = nrISBN;
		this.nrISSN = nrISSN;
	}

	public int getCdMaterial() {
        return cdMaterial;
    }

    public void setCdMaterial(int cdMaterial) {
        this.cdMaterial = cdMaterial;
    }

    public EditoraBean getEditora() {
        return editora;
    }

    public void setEditora(EditoraBean editora) {
        this.editora = editora;
    }

    public EntidadeBean getEntidade() {
        return entidade;
    }

    public void setEntidade(EntidadeBean entidade) {
        this.entidade = entidade;
    }

    public LocalPublicacaoBean getLocalPublicacao() {
        return localPublicacao;
    }

    public void setLocalPublicacao(LocalPublicacaoBean localPublicacao) {
        this.localPublicacao = localPublicacao;
    }

    public TipoMaterialBean getTpMaterial() {
        return tpMaterial;
    }

    public void setMaterial(TipoMaterialBean tpMaterial) {
        this.tpMaterial = tpMaterial;
    }

    public TipoDivulgacaoBean getDivulgacao() {
        return divulgacao;
    }

    public void setDivulgacao(TipoDivulgacaoBean divulgacao) {
        this.divulgacao = divulgacao;
    }

    public String getNmTitulo() {
        return nmTitulo;
    }

    public void setNmTitulo(String nmTitulo) {
        this.nmTitulo = nmTitulo;
    }

    public String getDsAnoProducao() {
        return dsAnoProducao;
    }

    public void setDsAnoProducao(String dsAnoProducao) {
        this.dsAnoProducao = dsAnoProducao;
    }

    public String getDsAnoPublicao() {
        return dsAnoPublicao;
    }

    public void setDsAnoPublicao(String dsAnoPublicao) {
        this.dsAnoPublicao = dsAnoPublicao;
    }

    public String getDsEdicao() {
        return dsEdicao;
    }

    public void setDsEdicao(String dsEdicao) {
        this.dsEdicao = dsEdicao;
    }

    public int getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas) {
        this.nrPaginas = nrPaginas;
    }

    public String getDsUrlDisponivel() {
        return dsUrlDisponivel;
    }

    public void setDsUrlDisponivel(String dsUrlDisponivel) {
        this.dsUrlDisponivel = dsUrlDisponivel;
    }

    public String getNrISBN() {
        return nrISBN;
    }

    public void setNrISBN(String nrISBN) {
        this.nrISBN = nrISBN;
    }

    public String getNrISSN() {
        return nrISSN;
    }

    public void setNrISSN(String nrISSN) {
        this.nrISSN = nrISSN;
    }

    public List<AutorBean> getAutores() {
        return autores;
    }

    public void setAutores(List<AutorBean> autores) {
        this.autores = autores;
    }

    public List<PalavraChaveBean> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(List<PalavraChaveBean> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }
}
