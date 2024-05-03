package Aparelho.Apps;
public abstract class Aparelho_Telefonico {

    public void ligar(){
        obterConexao();
        System.out.println("Ligando");
    }
    public void atender(){
        obterConexao();
        System.out.println("Atendendo");
    }
    public void iniciarCorrerioVoz(){
        obterConexao();
        System.out.println("Iniciando Correio de Voz");

    }
    private void obterConexao(){
        System.out.println("*Obtendo conexao*");
    }

}
