package composite.app;

public class Sessao extends ItemCronograma {

    private int duracao;

    public Sessao(String descricao, int duracao) {
        super(descricao);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getItem() {
        return "Sessão: " + this.getDescricao() + " - duração: " + this.duracao + " min\n";
    }
}
