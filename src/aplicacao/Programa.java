package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Item;
import entities.Produto;
import entities.enuns.Status;

public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.println("Data de nascimento: ");
		Date dataNasc = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataNasc);

		System.out.println("Entre com os dados do pedido:");
		System.out.print("Ststus: ");
		Status status = Status.valueOf(sc.next());

		System.out.println("Quantos itens o pedido vai ter? ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Entre #1" + i + " pedido: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Valor do produto: ");
			double valorProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			Produto produto = new Produto(nomeProduto, valorProduto);

			Item it = new Item(quantidade, valorProduto, produto);
		}

		sc.close();

	}

}
