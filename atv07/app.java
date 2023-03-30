package atv07;

import javax.swing.JOptionPane;

public class app {
public static void main(String[] args) {
int numProdutos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos produtos diferentes serão processados?"));
produto[] produtos = new produto[numProdutos];

for (int i = 0; i < numProdutos; i++) {
    String nome = JOptionPane.showInputDialog(null, "Informe o nome do produto " + (i + 1));
    double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço do produto " + (i + 1)));
    int quantidadeEmEstoque = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade em estoque do produto " + (i + 1)));
    produtos[i] = new produto(nome, preco, quantidadeEmEstoque);
}

JOptionPane.showMessageDialog(null, "Produtos adicionados com sucesso!");

for (int i = 0; i < numProdutos; i++) {
    JOptionPane.showMessageDialog(null, "Nome: " + produtos[i].getNome() + "\nPreço: " + produtos[i].getPreco() + "\nQuantidade em estoque: " + produtos[i].getQuantidadeEmEstoque());
}
}
}
