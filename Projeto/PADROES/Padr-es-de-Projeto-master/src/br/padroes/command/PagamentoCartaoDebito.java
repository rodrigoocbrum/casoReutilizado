package br.padroes.command;

public class PagamentoCartaoDebito implements PagamentoCommand {

	@Override
	public void processarCompra(Pagamento compra) {
		System.out.println("Compra debitada!\n" + compra.getInfoNota());
	}

}
