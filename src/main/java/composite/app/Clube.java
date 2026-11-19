package composite.app;

public class Clube {

    private String nome;
    private ItemCronograma cronograma;

    public Clube(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCronograma(ItemCronograma cronograma) {
        this.cronograma = cronograma;
    }

    public String getCronograma() {
        if (this.cronograma == null) {
            throw new NullPointerException("Clube sem cronograma");
        }
        return this.cronograma.getItem();
    }
}
