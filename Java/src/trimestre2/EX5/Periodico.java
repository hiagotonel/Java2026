package trimestre2.EX5;

public class Periodico {
    private String titulo;
    private Integer volume;

    public Periodico(String titulo, Integer volume){
        this.titulo= titulo;
        this.volume = volume;
    }

    public String getTitulo(){
        return titulo;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
