package composite.app;

import java.util.ArrayList;
import java.util.List;

public class Fase extends ItemCronograma {

    private List<ItemCronograma> itens;

    public Fase(String descricao) {
        super(descricao);
        this.itens = new ArrayList<ItemCronograma>();
    }

    public void addItem(ItemCronograma item) {
        this.itens.add(item);
    }

    public String getItem() {
        String saida = "";
        saida = "Fase: " + this.getDescricao() + "\n";
        for (ItemCronograma item : itens) {
            saida += item.getItem();
        }
        return saida;
    }
}
