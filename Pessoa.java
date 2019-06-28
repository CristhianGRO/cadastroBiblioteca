/*
    Exercicio 3
 */
package br.com.ap220191.ta02.cristhian.oliveira_201800236.lista03.p2;

public class Pessoa {
    String nome;
    int qtdLivros;
    
    public Pessoa(String n, int q){
       nome = n;
       qtdLivros=q;
}
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setQtdLivros(int qtdLivros){
        this.qtdLivros= qtdLivros;
    }
    public int getQtdLivros(){
        return qtdLivros;
    }
}
