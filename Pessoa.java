import java.sql.ResultSet;
import java.sql.SQLException;

public class Pessoa extends Carrinho{

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    
    //Terá dois tipos de usuario: o Admin e o Cliente
    //Somente Admin poderá fazer funcionalidades do sisteme(Cadastro,Exclusão,etc)
    private String tipo;

    // O cliente podera visualizar seus dados

    cone con = new cone();

    public void CadastrarConta(String n, String s, String ed){
        String create = "INSERT into cliente (nome,senha,endereco,tipo_id)"+
                   " values('"+n+"','"+s+"','"+ed+"',2)";
        int res_c = con.executa(create);
    }
    
    // Terá que verificar no banco se o id requisitado existe na tabela
    public void AlterarConta(int i, String n, String s, String ed){
        //Irei usar um id pré-definido temporariamente
        String update = "UPDATE cliente SET nome ='Luis',senha='123',endereco='rua do luis' WHERE id = 1";
        int res_u = con.executa(update);
    }
    
    //Apagara no banco
    public void ExcluirConta(int i){
        String delete = "DELETE FROM cliente WHERE id = "+i+"";
        int res_d = con.executa(delete);
    }

}
