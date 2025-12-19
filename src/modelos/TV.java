/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ana Luiza Soares
 */
public class TV extends Produto{
    //atributos
    private String modelo = "";
    private String marca = "";
    private String sistemaOperacional = "";
    private double tamanhoTela = 0;
    private double preco = 0;
    //metodos
    public TV(){}
    public TV(int codigo, String modelo, String marca, String sistemaOperacional,
            double tamanhoTela,  double preco){
        super(codigo);
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
        this.preco = preco;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String descricaoCompleta() {
        String descricao = "Modelo: " + modelo + "\nMarca: " + marca + "Tamanho tela: " + tamanhoTela ;
        if (sistemaOperacional != null && !sistemaOperacional.isEmpty()) {
            descricao += "\nSistema Operacional: " + sistemaOperacional;
        }                 
        return descricao;
    }

    @Override
    public double precoVenda() {
        return this.preco;
    }

    @Override
    public String tipoProduto() {
        return "TV";
    }
    
}
