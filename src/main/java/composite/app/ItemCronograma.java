package composite.app;

public abstract class ItemCronograma {

    private String descricao;

    public ItemCronograma(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getItem();
}
