import java.util.*;
public class ControladorProdutos implements IControladorProdutos {
    private List<Produto> produto = new ArrayList<Produto>();
    private List<CategoriaProduto> categoria = new ArrayList<CategoriaProduto>();

    /**
     *
     * @param inflacao percentual de inflacao a ser aplicado sobre o preco de todos os produtos. Exemplo para 10% de inflacao: 10
     */
    public void atualizaPrecos(float inflacao){
        for(int i=0; i< produto.size();i++){
            float preco=0;
            preco=produto.get(i).getPreco();
            float infla = (preco*inflacao)/100;
            produto.get(i).setPreco(preco+infla);
        }
    }

      /**
     * 
     * @param codigo codigo do produto desejado
     * @return produto encontrado pelo codigo fornecido. Retorna NULL se nenhum produto foi encontrado com o codigo fornecido
     */
    public IProduto getProdutoPeloCodigo(int codigo){
        for(Produto a:produto){
            if(a.getCodigo()==codigo) return a;
        }
        return null;
    }

    /**
     *
     * @param codigo codigo da categoria a ser inserida
     * @param nome nome da categoria a ser inserida
     * @return retorna a categoria que foi inserida
     */
    public ICategoriaProduto incluiCategoriaProduto(int codigo, String nome){	 	  	  	 	   	  	      	      	  	        	 	
         CategoriaProduto categoriaobj = new CategoriaProduto (codigo,nome);
         categoria.add(categoriaobj);
         return categoriaobj;
    }

    /**
     *
     * @param codigo codigo do produto a ser inserido
     * @param nome nome do produto a ser inserido
     * @param descricao descricao do produto a ser inserido
     * @param preco preco do produto a ser inserido
     * @param quantidade quantidade em estoque do produto a ser inserido
     * @param categoria referencia para a categoria do produto a ser inserido
     * @return retorna o produto que foi inserido
     */
    public IProduto incluiProduto(int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria){
         Produto produtoobj = new Produto(codigo,nome,descricao,preco,quantidade,categoria);
         produto.add(produtoobj);
         return produtoobj;
    }
    
}