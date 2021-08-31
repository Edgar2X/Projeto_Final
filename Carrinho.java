import java.util.Random;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Carrinho{

    private String disc1 = "Back in Black - AC/DC";
    private String disc2 = "Black Album - Metallica";
    private String disc3 = "Whats going on - Marvin Gaye";
    private String disc4 = "Blackstar - David Bowie";
    private String disc5 = "Lemonade - Beyoncé";
    private int[] p = new int[30];
    int i=0;

    Random random = new Random();
    int ale = random.nextInt(100000);

    cone con = new cone();
    //Inserir na Lista
    public void InserirProduto(int x){
        if (x == 1){
            p[i] = 1;
            System.out.println("Você escolheu: " + disc1);
            i++;
        }if (x == 2){
            System.out.println("Você escolheu: " + disc2);
            p[i]= 2;
            i++;
        }if (x == 3){
            System.out.println("Você escolheu: " + disc3);
            p[i]= 3;
            i++;
        }if (x == 4){
            System.out.println("Você escolheu: " + disc4);
            p[i]= 4;
            i++;
        }if (x == 5){
            System.out.println("Você escolheu: " + disc5);
            p[i]= 5;
            i++;
        }if(x > 5){
            System.out.println("Numero Invalido");
            p[i]= 6;
            i++;
        }    
    }

    //Apago na lista
    public void ExcluirProduto(){
        System.out.println("Excluido");
    }
    
    //Apaga no Banco
    public void FinalizarPedido(){
        int n = 0;
        while(n < i ){
            String create = "INSERT into compra (codigo,cliente_id,album_id)"+
                   " values("+ale+",1,"+p[n]+")";
            int res_c = con.executa(create);
            n++;
        }
    }

}
