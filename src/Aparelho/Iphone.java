package Aparelho;

import Aparelho.Apps.Aparelho_Telefonico;
import Aparelho.Apps.Navegador_Internet;
import Aparelho.Apps.Reprodutor_Musica;

public class Iphone extends Aparelho_Telefonico implements Navegador_Internet,Reprodutor_Musica{
    
    public String cor;

    public Iphone(){
        cor = "Preto";
    }
    //Funções para Reprodutor de musica-------------------------------
    private void obterListaMusicas(){
        System.out.println("*Obtendo lista das musicas*");
    }
    public void tocar() {
        obterListaMusicas();
        System.out.println("Tocando musica pelo iphone;");
    }
    
    public void pausar() {
        System.out.println("Musica Pausada;");
    }

    public void selecionarMusica() {
        obterListaMusicas();
        System.out.println("Musica selecionada;");
    }

    //Funções p/ Navegador--------------------------------------------
    private void obterConexaoNet(){
        System.out.println("*Obtendo Conexão com a internet*");
    }
    public void exibirPagina() {
        obterConexaoNet();
        System.out.println("Exibindo pagina;");
    }

    public void adicionarNovaAba() {
        obterConexaoNet();
        System.out.println("Adicionando aba nova;");
    }

    public void atualizarPagina() {
        obterConexaoNet();
        System.out.println("Atualizando pagina;");
    }
    //Gets/Sets-----------------------------------------------------
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    
}
