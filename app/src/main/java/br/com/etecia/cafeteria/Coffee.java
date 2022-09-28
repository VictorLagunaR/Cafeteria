package br.com.etecia.cafeteria;

public class Coffee {

    private  String Titulo;
    private  int Foto;
    private  String Desc;
    private  int Rating;

    public Coffee(String Titulo, int Foto, String Desc, int Rating){
        this.Titulo = Titulo;
        this.Desc = Desc;
        this.Foto = Foto;
        this.Rating = Rating;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }
}
