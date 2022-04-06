package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enuns.Status;

public class Pedido {

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

}
