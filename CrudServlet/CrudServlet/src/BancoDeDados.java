import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {
	
	private static List<Pizza> lista = new ArrayList<Pizza>() ;
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