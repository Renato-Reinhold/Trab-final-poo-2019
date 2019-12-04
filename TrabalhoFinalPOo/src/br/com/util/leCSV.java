package br.com.util;
import javax.swing.*;

import br.com.beans.AutorBean;
import br.com.beans.EditoraBean;
import br.com.beans.EntidadeBean;
import br.com.beans.LocalPublicacaoBean;
import br.com.beans.MaterialBean;
import br.com.beans.PalavraChaveBean;
import br.com.beans.TipoDivulgacaoBean;
import br.com.beans.TipoMaterialBean;
import br.com.enums.EnumColunas;
import br.com.enums.EnumGovernamental;
import br.com.validacoes.ValidaAutor;
import br.com.validacoes.ValidaEditora;
import br.com.validacoes.ValidaEntidade;
import br.com.validacoes.ValidaLocalPublicacao;
import br.com.validacoes.ValidaPalavraChave;
import br.com.validacoes.ValidaTipoDivulgacao;
import br.com.validacoes.ValidaTipoMaterial;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leCSV {
	
    public static void main(String[] args) throws IOException {
    	String separador = ",";
    	ArrayList<MaterialBean> listaPublicacoes = new ArrayList<MaterialBean>();
    	
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = chooser.showSaveDialog(null);
        File arquivo = chooser.getSelectedFile();

        if (i == 1) {
            System.out.println("Arquivo nao selecionado");
        } else {

            Reader in = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(in);

            List<EnumColunas> colunas =  getColunas(reader.readLine().split(separador));
            String linha = null;
			while ((linha = reader.readLine()) != null) {
				List<String> lista = getLinha(linha.split(separador));
				System.out.println(Arrays.toString(lista.toArray()));
				
				//entidade
				String nmEntidade = lista.get(colunas.indexOf(EnumColunas.ENTIDADE));
				EnumGovernamental tpOrganizacao = EnumGovernamental.get(lista.get(colunas.indexOf(EnumColunas.TP_ORGANIZACAO)).toLowerCase());
				EntidadeBean entidade = new EntidadeBean(nmEntidade, tpOrganizacao);
				
				//lista palavras chave
				String listaPalavras[] = lista.get(colunas.indexOf(EnumColunas.PALAVRA_CHAVE)).split(";");
				List<PalavraChaveBean> listaPalavra = new ArrayList<PalavraChaveBean>();
				for (String palavra : listaPalavras) {
					PalavraChaveBean pChave = new PalavraChaveBean(palavra);
					listaPalavra.add(pChave);
				}

				String[] autores = lista.get(colunas.indexOf(EnumColunas.AUTOR)).split(";");
				List<AutorBean> listAutores = new ArrayList<AutorBean>();
				for (String nome : autores){
					AutorBean autor = new AutorBean(nome);
					listAutores.add(autor);
				}

				TipoMaterialBean tipoMaterial = new TipoMaterialBean(lista.get(colunas.indexOf(EnumColunas.TP_MATERIA)));
				TipoDivulgacaoBean tipoDivulgacao = new TipoDivulgacaoBean(lista.get(colunas.indexOf(EnumColunas.DIVULGACAO)));
				String titulo = lista.get(colunas.indexOf(EnumColunas.TITULO));
				String anoProducao = lista.get(colunas.indexOf(EnumColunas.ANO_PRODUCAO));
				String anoPublicacao = lista.get(colunas.indexOf(EnumColunas.ANO_PUBLICACAO));
				String edicao = lista.get(colunas.indexOf(EnumColunas.EDICAO));
				LocalPublicacaoBean localPublicacao = new LocalPublicacaoBean(lista.get(colunas.indexOf(EnumColunas.LOCAL_PUBLICACAO)));
				EditoraBean editora = new EditoraBean(lista.get(colunas.indexOf(EnumColunas.LOCAL_PUBLICACAO)));
				int nrPaginas = Converter.StringToInt(lista.get(colunas.indexOf(EnumColunas.NR_PAGINAS_MINUTOS)));
				String site = lista.get(colunas.indexOf(EnumColunas.SITE));
				String ISBN = lista.get(colunas.indexOf(EnumColunas.ISBN));
				String ISSN = lista.get(colunas.indexOf(EnumColunas.ISSN));

				MaterialBean material = new MaterialBean(editora, entidade, localPublicacao, tipoMaterial, tipoDivulgacao, listAutores, listaPalavra, titulo, anoProducao, anoPublicacao, edicao, nrPaginas, site, ISBN, ISSN);
				
			}
        }
    }
    
    
    //nao ? pra ter static pq vemos implementar tela com o usuario
    public static List<EnumColunas> getColunas(String[] linha){
    	List<EnumColunas> colunas = new ArrayList<EnumColunas>();
    	for (EnumColunas colunass : EnumColunas.values()) {
    		for (String valuess : linha) {
    			if(colunass.getNmColuna().equals(valuess)) {
    				colunas.add(EnumColunas.get(valuess));
    			}
			}
		}
    	return colunas;
    }
    
  //nao ? pra ter static
    public static List<String> getLinha(String[] linha) {
    	List<String> values = new ArrayList<String>();
    	for (String vl : linha) {
			values.add(vl);
		}
    	return values;
    }
    
}
