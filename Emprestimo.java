/*
    Exercicio 3
 */
package br.com.ap220191.ta02.cristhian.oliveira_201800236.lista03.p2;
import javax.swing.JOptionPane;
import java.util.*;
public class Emprestimo {
    static List<Pessoa> pessoa = new ArrayList<>();
    static List<Livro> livro = new ArrayList<>();
    static int  opcao = 1,qtd=0,i=0,d=0, n=0;
    
    public static void cadastroPessoa(Pessoa novo){
        pessoa.add(novo);
    }
    
    public static void cadastroLivro(Livro novo){
        livro.add(novo);
    }
    
    public static void main(String args[]){
         
        while(opcao != 6){
            String escolha = JOptionPane.showInputDialog("                       Menu                \n"+ "___________________________\n" +
            "\n1: Cadastrar usuario\n" +"2: Cadastrar livro\n" + "3: Visualizar usuarios\n" + "4: Visualizar Livros\n"+"5: Emprestimo\n" + "6: Sair\n"+"\n\nOpcao: ");
            opcao = Integer.parseInt(escolha);
            if(opcao != 6){
                switch(opcao){
                    case 1:
                        String newName = JOptionPane.showInputDialog("Digite o nome do usuario: ");
                        Pessoa novoPessoa = new Pessoa(newName,qtd); 
                        cadastroPessoa(novoPessoa);
                        JOptionPane.showMessageDialog(null, "Usuario Cadastrado");
                    break;
                    
                    case 2:
                        String newBook = JOptionPane.showInputDialog("Digite o nome do livro: ");
                        String qtdNovo = JOptionPane.showInputDialog("Digite a quantidade de exemplares do livro: ");
                        int qtdLivro = Integer.parseInt(qtdNovo);
                        String idLivro = JOptionPane.showInputDialog("Digite o ID do livro: ");
                        int id = Integer.parseInt(idLivro);
                        Livro novoLivro = new Livro(newBook,qtdLivro,id);
                        cadastroLivro(novoLivro);
                        JOptionPane.showMessageDialog(null, "Livro Cadastrado");
                    break;
                    
                    case 3:
                        for(Pessoa p : pessoa){
                            System.out.println("\nNome: "+p.nome);
                            System.out.println("\nQuantidade de livros emprestados: " +p.qtdLivros);
                            System.out.println("\n______________________________");
                        }
                        
                    break;
                    
                    case 4:
                        for(Livro l : livro){
                            System.out.println("\nNome do livro: "+l.nome);
                            System.out.println("\nID do livro: "+l.id);
                            System.out.println("\nQuantidade exemplares disponiveis: " +l.qtdEstoque);
                            System.out.println("\n______________________________");
                        }
                    break;
                    
                    case 5:
                        String nomeEmprestimo = JOptionPane.showInputDialog("Digite o nome do usuario: ");
                        for(Pessoa p : pessoa){
                            if(p.nome.equals(nomeEmprestimo)){
                                d=0;
                                i=0;
                                while(d==0){
                                    d=0;
                                    i=0;
                                    if(p.qtdLivros<=2){
                                    while(i==0){
                                        String idE = JOptionPane.showInputDialog("Digite o ID do livro: ");
                                    
                                        int idEmprestimo = Integer.parseInt(idE);
                                        n=0;
 
                                        for(Livro l : livro){
                                            if(idEmprestimo == l.id){
                                                if(l.qtdEstoque>0){
                                                  n++;
                                                  l.qtdEstoque--;
                                                  p.qtdLivros++;
                                                  JOptionPane.showMessageDialog(null,"Livro emprestado");
                                                  String repete = JOptionPane.showInputDialog("Deseja realizar outro emprestimo nesse usuario? (sim ou nao)");
                                                  if(repete.equals("sim")){
                                                      i=1;
                                                      d=0;
                                                  }
                                                  else{
                                                    i=1;
                                                    d=1;
                                                  }
                                            }
                                                else{
                                                    JOptionPane.showMessageDialog(null,"Nao existem exemplares disponiveis desse livro");
                                                }
                                            }

                                        }
                                        if(n==0){
                                        JOptionPane.showMessageDialog(null,"Livro nao encontrado ");
                                        i=0;}
                                        
                                }
                                    
                                }    
                                else{
                                    JOptionPane.showMessageDialog(null,"Esse usuario ultrapassou o limite de livros emprestados simultaneamente");
                                    d=1;
                                    break;
                                }
                            }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Usuario nao cadastrado");
                            }
                        }
                            
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opcao invalida");
                    break;
                }
            }
    
            else{
                break;
            }
        }
    }
}


