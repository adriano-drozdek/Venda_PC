package entities;

import java.util.Date;

import entities.enuns.Status;

public class Pedido {

	private Date momento;
	private Status status;

	public Pedido() {

	}

	public Pedido(Date momento, Status status) {
		this.momento = momento;
		this.status = status;
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

}
