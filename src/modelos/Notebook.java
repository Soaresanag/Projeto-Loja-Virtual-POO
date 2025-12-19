/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ana Luiza Soares
 */
public class Notebook extends Produto{
    //atributos
    private String marca = "";
    private String modelo = "";
    private String memoriaRAM = "";
    private String capacidadeHD = "";
    private String processador = "";
    private double tamanhoTela = 0;
    private String sistemaOperacional = "";
    private double preco = 0;
    //metodos
    public Notebook(){}
    public Notebook(int codigo, String marca, String modelo, String memoriaRAM, 
            String capacidadeHD, String processador,double tamanhoTela, String sistemaOperacional, double preco){
        super(codigo);
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.capacidadeHD = capacidadeHD;
        this.processador = processador;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(String capacidadeHD) {
        this.capacidadeHD = capacidadeHD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String descricaoCompleta() {
        String descricao = "Marca: " + marca + "\nModelo: " + modelo + "\nMemoriaRAM: " + memoriaRAM +
                           "\nCapacidade: " + capacidadeHD + "\nProcessador: " + processador + 
                           "Tamanho tela: " + tamanhoTela + "Sistema Operacional: " + sistemaOperacional;
                           
        return descricao;
    }
    @Override
    public double precoVenda() {
        return this.preco;
    }

    @Override
    public String tipoProduto() {
       return "Notebook";
    }

    @Override
    public String toString() {
        return "Notebook{" + "marca=" + marca + ", modelo=" + modelo + ", memoriaRAM=" + memoriaRAM + ", capacidadeHD=" + capacidadeHD + ", processador=" + processador + ", tamanhoTela=" + tamanhoTela + ", sistemaOperacional=" + sistemaOperacional + ", preco=" + preco + '}';
    }
    
}
