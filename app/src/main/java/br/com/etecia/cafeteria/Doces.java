package br.com.etecia.cafeteria;

public class Doces {
    //Atributos globais
    private String titulo;
    private String desc;
    private String rate;
    private int img;

    //Criar o construtor
    public Doces(String titulo, String desc, String rate, int img) {
        this.titulo = titulo;
        this.desc = desc;
        this.rate = rate;
        this.img = img;
    }
    //Métodos de acesso - getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}