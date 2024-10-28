package aula06.questao02;

import aula06.questao02.models.Conta;
import aula06.questao02.services.ContaService;
import aula06.questao02.services.RelatorioContaService;

public class MainContaTudoEmUm {

	public static void main(String[] args) {
		Conta conta = new Conta("João Silva", 500.0);
		ContaService contaService = new ContaService();

		contaService.depositar(conta, 200.0);
		contaService.sacar(conta, 150.0);

		RelatorioContaService.gerarRelatorioSaldo(conta);
		RelatorioContaService.gerarRelatorioTransacoes(contaService.getTransacoes());
	}
}
