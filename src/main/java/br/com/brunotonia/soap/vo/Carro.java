package br.com.brunotonia.soap.vo;

import java.math.BigDecimal;

public class Carro {
    
    private Integer id;
    private String nome;
    private String fabricante;
    private String pais;
    private BigDecimal potencia;
    private BigDecimal peso;
    private BigDecimal vmax;
    private Integer cilindros;
    private Integer cc;
    private Integer ano;
    private String imagem;

    public Carro() {
    }

    public Carro(Integer id, String nome, String fabricante, String pais, BigDecimal potencia, BigDecimal peso, BigDecimal vmax, Integer cilindros, Integer cc, Integer ano, String imagem) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.pais = pais;
        this.potencia = potencia;
        this.peso = peso;
        this.vmax = vmax;
        this.cilindros = cilindros;
        this.cc = cc;
        this.ano = ano;
        this.imagem = imagem;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public BigDecimal getPotencia() {
        return this.potencia;
    }

    public void setPotencia(BigDecimal potencia) {
        this.potencia = potencia;
    }

    public BigDecimal getPeso() {
        return this.peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getVmax() {
        return this.vmax;
    }

    public void setVmax(BigDecimal vmax) {
        this.vmax = vmax;
    }

    public Integer getCilindros() {
        return this.cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public Integer getCc() {
        return this.cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}
