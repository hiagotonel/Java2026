package trimestre2.EX5;

public class Periodico extends publicacao {
    private Integer volume;

    public Periodico(String titulo, Integer volume) {
        this.titulo = titulo;
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
