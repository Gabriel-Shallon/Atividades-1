package atv07;

import java.util.ArrayList;
import java.util.List;

public class pedido {
    private List<produto> itens;
    private double total;
    private TipoPagamento tipoPagamento;

    public pedido() {
        this.itens = new ArrayList<>();
        this.total = 0;
    }

    public void adicionarItem(produto item) {
        this.itens.add(item);
    }

    public double getTotal() {
        return total;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
