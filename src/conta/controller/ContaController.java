package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList <Conta> listaContas = new ArrayList<Conta>();
	int numero =0;
	String cliente;
	
	@Override
	public void procurarPorCliente(String cliente) {
		var conta = buscarNaCollection (cliente);
		
		if(conta != null)
			;
		else
			System.out.println("\nO cliente: " + cliente + " não foi encontrado!");
	}
	@Override
	public void novoPedido(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nNovo pedido - Cliente : " + conta.getCliente());
		
	}

	public Conta buscarNaCollection(String cliente) {
		for(var conta : listaContas) {
			if(conta.getCliente() == cliente) {
				return conta;
			}
		}
		 
		return null;
	}
	@Override
	public int gerarNumero() {
		return ++numero;
	}
	public float cobrar(int qtnd, float preco) {
		return qtnd*preco;
		
		
	}

}