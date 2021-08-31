
//Edgar Enthony Ferreira Lima
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
            
           
            System.out.println("                                          ------------------- Bem-Vindo -------------------        " );
            Login l = new Login();
            Scanner s = new Scanner(System.in);

            //System.out.println("Nome: ");
            //String nome = s.next();
            
            //System.out.println("Senha: ");
            //String senha = s.nextLine();
            
            l.EfetuarLogin("Paulin","12345");
            
            if (l.confirm == 1){

                Pessoa c = new Pessoa();
                int repeat = 0;

                while(repeat == 0){
                    System.out.println("Você Deseja: ");
                    System.out.println("            ");
                    System.out.println("1.Cadastra um Cliente");
                    System.out.println("2.Modificar um Cliente");
                    System.out.println("3.Excluir Conta");
                    System.out.println("4.Sair");

                    int v = s.nextInt();

                    if( v == 1){
                        String nome = s.nextLine();
                        String senha = s.nextLine();
                        String endereco = s.nextLine();

                        c.CadastrarConta(nome,senha,endereco);
                        repeat = 0;
                    }if ( v == 2){
                        
                        cone con = new cone();
                        String read = "SELECT * from cliente";
                        ResultSet rs = con.busca(read);
                        
                        try {
                            while (rs.next()){
                                int id = rs.getInt("id");
                                String nome = rs.getString("nome");
                                System.out.println(nome);
                            }
                        } catch (SQLException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        int option = s.nextInt();
                        System.out.println("1.Modificar um cliente");
                        System.out.println("2.Voltar");
                        if(option == 1){
                            int id = s.nextInt();
                            String nome = s.nextLine();
                            String senha = s.nextLine();
                            String endereco = s.nextLine();
                            c.AlterarConta(id,nome,senha,endereco);
                            repeat = 0;
                        }
                    }if ( v == 3){
                        c.ExcluirConta(204);
                        repeat = 0;
                    }if ( v == 4){
                        repeat = 1;
                        System.out.println("Obrigado!!!");
                    }
                }
            }else{
                Pessoa c = new Pessoa();

                int x = 1;
                while ( x != 0 ){
                System.out.println("Escolha um disco: ");
                int escolha = s.nextInt();
                c.InserirProduto(escolha);
                x = escolha;              
                  //Deixar salvo na lista

                    //c.ExcluirProduto();
                    //Tirar da lista
                }
                c.FinalizarPedido();
                    //Salvar no banco
                }
            }
        }

