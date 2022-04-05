package aplicacao;

import entities.Item;
import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Produto p = new Produto("TV ", 1000.0);
		
		Item it1 = new Item(1, 1000.0, p);
		
		System.out.println(it1.getProduto().getNome());
	}

}
