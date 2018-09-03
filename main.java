public class main{
    public static void main(String [] args){
        Produto produto;
        CategoriaProduto categoria;
        ControladorProdutos controlador = new ControladorProdutos();

        categoria = (CategoriaProduto)controlador.incluiCategoriaProduto(11,"categoria");
        produto = (Produto)controlador.incluiProduto(1,"pinga" ,"descricao",3,100,categoria);    

    }
}