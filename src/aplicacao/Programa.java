package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Item;
import entities.Pedido;
import entities.Produto;
import entities.enuns.Status;

public class Programa {

	public static void main(String[] args) throws ParseException  {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento: ");
		Date dataNasc = sdf.parse(sc.next()); 

		Cliente cliente = new Cliente(nome, email, dataNasc);

		System.out.println("Entre com os dados do pedido:");
		System.out.print("Ststus: ");
		Status status = Status.valueOf(sc.next());

		Pedido pedido = new Pedido(new Date(), status, cliente);

		System.out.print("Quantos itens o pedido vai ter? ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Entre #" + i + " pedido: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Valor do produto: ");
			double valorProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			Produto produto = new Produto(nomeProduto, valorProduto);

			Item it = new Item(quantidade, valorProduto, produto);

			pedido.addItem(it);
		}

		System.out.println();
		System.out.println(pedido);

		sc.close();

	}

}
