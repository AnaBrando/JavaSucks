package Infra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Model.Pizza;


public class BancoDeDados {
	private static List<Pizza> lista = new ArrayList<Pizza>();
	
	static {
		Pizza pizza =  new Pizza();
		pizza.setDescricao("mussarela");
		pizza.setFeedback("mussarela");
		pizza.setPreco(50);
		lista.add(pizza);
		
		Pizza pizza2 =  new Pizza();
		pizza2.setDescricao("calabresa");
		pizza2.setFeedback("calabresa");
		pizza2.setPreco(30);
		lista.add(pizza2);
		
	}
	
	private static int incremento = 1; 
	
	public void adiciona(Pizza pizza) {
		pizza.setId(BancoDeDados.incremento++);
		BancoDeDados.lista.add(pizza);
	}
	
	public List<Pizza> getPizza(){
		return BancoDeDados.lista;
	}

	public void removePizza(int codigo) {
		Iterator<Pizza> it = lista.iterator();
		
		while (it.hasNext()) {
			Pizza cliente = (Pizza) it.next();
			
			if(cliente.getId() == codigo) {
				it.remove();
			}
			
		}
		
	}
	
	public Pizza busca(int codigo) {
		for (Pizza jogo : lista) {
			if(jogo.getId() == codigo) {
				return jogo;
			}
		}
		return null;
	}

	
}