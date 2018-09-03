/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date   01/09/2017
 */
public class Produto implements IProduto {
    private CategoriaProduto categoria;
    private int codigo;
    private String descricao;
    private String nome;
    private float preco;
    private int quantidade;

    public Produto (int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria){
        this.codigo=codigo; 
        this.nome=nome;
        this.descricao=descricao;
        this.preco=preco;
        this.quantidade=quantidade;
        this.categoria=categoria;
    }
    
    public CategoriaProduto getCategoria(){
        return this.categoria;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getDescricao(){
        return this.descricao;
    }	 	  	  	 	   	  	      	      	  	        	 	
    public String getNome(){
        return this.nome;
    }
    public float getPreco(){
       return this.preco; 
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setCategoria(CategoriaProduto categoria){
        this.categoria=categoria;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPreco(float preco){
        this.preco=preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    
}	 	  	  	 	   	  	      	      	  	        	 	
