package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enuns.Status;

public class Pedido {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private Status status;

	private Cliente cliente;

	private List<Item> itens = new ArrayList<Item>();

	public Pedido() {

	}

	public Pedido(Date momento, Status status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(Item item) {
		itens.add(item);
	}

	public void removeItem(Item item) {
		itens.remove(item);
	}

	public double total() {
		double soma = 0;
		for (Item it : itens) {
			soma += it.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:\n");
		for (Item item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
