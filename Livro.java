/*
    Exercicio 3
 */
package br.com.ap220191.ta02.cristhian.oliveira_201800236.lista03.p2;
public class Livro {
    String nome;
    int qtdEstoque;
    int id;
    
    public Livro(String n, int q, int i){
        nome = n;
        qtdEstoque = q;
        id = i;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque=qtdEstoque;
    }
    public int getQtdEstoque(){
        return qtdEstoque;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
