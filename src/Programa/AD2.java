package Programa;


import javax.swing.JOptionPane;

import Entidades.ProdutoPerecivel;

public class AD2 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de produtos: "));
		ProdutoPerecivel pp[] = new ProdutoPerecivel[n];
		int i = 0;
		for (i=0;i<n;i++){ //loop para receber dados do produto.
			pp[i] = new ProdutoPerecivel();
			pp[i].setNome(JOptionPane.showInputDialog("Digite o nome do Produto: "));
			pp[i].setPrecoCusto(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de custo: ")));
			pp[i].setPrecoVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de Venda: ")));
			pp[i].setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque: ")));
			pp[i].setDataValidade(JOptionPane.showInputDialog("Digite a data de validade: "));
			pp[i].setTemperaturaResfriamento(Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura de resfriamento: ")));
			}
		for (i=0;i<n;i++){ // loop para imprimir os produtos e seusn dados.
		JOptionPane.showMessageDialog(null,"Nome do produto: " + pp[i].getNome() + "\nPreço de Custo: R$"+ pp[i].getPrecoCusto() + "\nPreço de Venda: R$" + pp[i].getPrecoVenda() + "\nQuantidade no Estoque: " + pp[i].getQuantidade() + "\nData de Validade: " + pp[i].getDataValidade() + "\nTemperatura de Resfriamento: "+ pp[i].getTemperaturaResfriamento()+"ºC" );
		}
		
		double menorValor = Double.MAX_VALUE;
		int indice = -1;
		for(i = 0; i < n; i++ ) { // loop para definir produto com menos preço.
			if (pp[i].getPrecoVenda() < menorValor) {
				menorValor = pp[i].getPrecoVenda();
				indice = i;
			}
		}
		JOptionPane.showMessageDialog(null,"O produto com menor valor é: " + pp[indice].getNome() + "\nPreço de Custo: R$"+ pp[indice].getPrecoCusto() + "\nPreço de Venda: R$" + pp[indice].getPrecoVenda() + "\nQuantidade no Estoque: " + pp[indice].getQuantidade() + "\nData de Validade: " + pp[indice].getDataValidade() + "\nTemperatura de Resfriamento: "+ pp[indice].getTemperaturaResfriamento()+"ºC" );
		
		double valorEstoque[] = new double[n];
		for(i = 0; i < n; i++ ) {// definir o valor de cada produto em estoque.
			valorEstoque[i] = pp[i].getPrecoCusto() * pp[i].getQuantidade();
			}
		
		double totalEstoque = 0.0;
		for(i = 0; i < n; i++ ) { // definir o valor total de estoque.
			totalEstoque += valorEstoque[i];
		}
		JOptionPane.showMessageDialog(null, "O valor total do estoque é: R$ " + totalEstoque);
		
		double soma = 0.0;
		for(i = 0; i < n; i++ ) { //realizar a soma e achar a media de preços.
			soma += pp[i].getPrecoVenda();
		}
		
		double mediaPreco = soma / n;
		for(i = 0; i < n; i++ ) { // realizar a leita dos dados e imprimir na tela os produtos com valor de venda acima da media.
			if (pp[i].getPrecoVenda() > mediaPreco) {
				indice = i;
				JOptionPane.showMessageDialog(null,"Média: R$" + mediaPreco + "\nO produto com valor acima da media é: " + pp[indice].getNome() + "\nPreço de custo: R$ " + pp[indice].getPrecoCusto() + "\nPreço de venda: R$ " + pp[indice].getPrecoVenda() + "\nEstoque: " + pp[indice].getQuantidade() + " produtos" + "\nData de Validade: " + pp[indice].getDataValidade() + "\nTemperatura de Resfriamento: "+ pp[indice].getTemperaturaResfriamento()+"ºC");
			}
		}
		
	
	}

}
