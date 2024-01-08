package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
		
		public void novoPedido(Conta conta);
		public float cobrar(int qtnd, float preco);
		public void procurarPorCliente (String cliente);
		public int gerarNumero();
		
}