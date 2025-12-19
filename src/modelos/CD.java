/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ana Luiza Soares
 */
public class CD extends Produto{
    //atributos
    private String nomeAlbum = "";
    private String banda = "";
    private String cantor = "";
    private String generoMusical = "";
    private double preco = 0;
    //metodos
    public CD(){}
    public CD(int codigo, String nomeAlbum, String banda, String cantor, String generoMusical, double preco){
        super(codigo);
        this.nomeAlbum = nomeAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
        this.preco = preco;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String descricaoCompleta() {
        String descricao = "Nome do Álbum: " + nomeAlbum +
                           "\nCantor: " + cantor +
                           "\nGênero Musical: " + generoMusical;
                           
        if (banda != null && !banda.isEmpty()) {
            descricao += "\nBanda: " + banda;
        }
        return descricao;
    }

    @Override
    public double precoVenda() {
        return this.preco;
    }

    @Override
    public String tipoProduto() {
        return "CD";
    }

    @Override
    public String toString() {
        return "CD{" + "nomeAlbum=" + nomeAlbum + ", banda=" + banda + ", cantor=" + cantor + ", generoMusical=" + generoMusical + ", preco=" + preco + '}';
    }
    
}
