package aula03.exemplo01;

public class Pedido {

	private int id;
	private String data;
	private Status statusPedido;
	
	public Pedido(int id, String data) {
		
		this.id = id;
		this.data = data;
		this.statusPedido = Status.AGUARDANDO_PAGAMENTO;
	}
	
	public void alterarStatus(Status novoStatus) {
		
		this.statusPedido = novoStatus;
	}
	
	public void verificarPedido() {
		
		System.out.println("Id: " + this.id);
		System.out.println("Data: " + this.data);
		System.out.println("Status: " + this.statusPedido);
	}
}












