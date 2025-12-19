/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ana Luiza Soares
 */
abstract public class Produto {
    //atributos
    protected int codigo = 0;
    //metodos
    public Produto(){}
    public Produto(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    abstract public String descricaoCompleta(); //metodo abstrato, logo torna a classe abstrata
    abstract public double precoVenda(); //metodo abstrato, logo torna a classe abstrata
    abstract public String tipoProduto(); //metodo abstrato, logo torna a classe abstrata   

    public void setCodigo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
