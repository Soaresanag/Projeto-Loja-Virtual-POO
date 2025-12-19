/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ana Luiza Soares
 */
public class Livro extends Produto {
    //atributos
    private String titulo = "";
    private String autor = "";
    private String tradutor = "";
    private String editora = "";
    private int anoPublicacao = 0;
    private double preco = 0;
    //metodos 
    public Livro(){}
    public Livro(int codigo, String titulo, String autor, String tradutor, String editora, int anoPublicacao, double preco){
        super(codigo);
        this.titulo = titulo;
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String descricaoCompleta() {
        String descricao = "Título: " + titulo +
                           "\nAutor: " + autor +
                           "\nEditora: " + editora +
                           "\nAno Publicação: " + anoPublicacao;
                            
        if (tradutor != null && !tradutor.isEmpty()) {
            descricao += "\nTradutor: " + tradutor;
        }
        return descricao;
    }

    @Override
    public double precoVenda() {
        return this.preco;
    }

    @Override
    public String tipoProduto() {
        return "Livro";
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", tradutor=" + tradutor + ", editora=" + editora + ", anoPublicacao=" + anoPublicacao + ", preco=" + preco + '}';
    }
    
    
}
