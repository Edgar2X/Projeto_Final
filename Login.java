
public class Login {
    
    // No momento os dados estão pré definidos
    private String Usuario = "Edgar Enthony";
    private String senha = "12345";
    int confirm;
    //Deverá haver uma busca no banco para configurar a existencia do Usuario

    public void EfetuarLogin(String u,String s){
        if ( u == this.Usuario){
            if( s == this.senha){
                System.out.println("Olá, " + Usuario);
                System.out.println("            ");

                confirm = 1;
            }else{
                System.out.println("Login Incorreto");
            }
        }else{
            System.out.println("Login Incorreto");
            confirm = 0;
        }
    }
}
