public class CategoriaProduto implements ICategoriaProduto {
    private int codigo;
    private String nome;
    
    public CategoriaProduto (int codigo,String nome){
        this.codigo=codigo; 
        this.nome=nome; 
    }
    public String getNome(){
        return nome;    
    }
    public void setNome(String nome){
        this.nome=nome; 
    }
}	 	  	  	 	   	  	      	      	  	        	 	
