package projetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;

public class Menu_Consultoria {
    public static void main(String[] args) {
    	
    	ContaController contas = new ContaController();
    	    	
        Scanner leia = new Scanner(System.in);
        
        String cliente;
        int  tipo=0, qtnd;
        float preco = 0, valorTotal;
        
        while(true) {
        	
        	System.out.println( "**********************************************************************************************");
			System.out.println("                                                                                               ");
			System.out.println("                                 Consultoria TRADE                                             ");
			System.out.println("                                                                                               ");
			System.out.println("***********************************************************************************************");
			System.out.println("                              Nossos Serviços e Valores:                                       ");
			System.out.println("         1 - Triagem de currículos (Pacote com 5 currículos por vaga): R$ 100,00               ");
			System.out.println("         2 - Entrevista Comportamental (Pacote com 5 candidatos por vaga): R$ 300,00           ");
			System.out.println("         3 - Entrevista Técnica (Pacote com 5 candidatos por vaga): R$ 400,00                   ");
			System.out.println("         4 - Entrevista Comportamental + Técnica (Pacote com 5 candidatos por vaga): R$ 600,00 ");
			System.out.println("         5 - Tech Recruiter (2 profissionais por 2 semanas): R$ 6.380,00                       ");
			System.out.println("         6 - Consultoria de Recrutamento (Completo): R$ 10.850,00                              ");
			System.out.println("         7 - Sair                                                                              ");
			System.out.println("                                                                                               ");
			System.out.println("***********************************************************************************************");
			System.out.println("Digite a opção desejada:                                                                       ");
			System.out.println("                                                                                               ");
			
			try {
				tipo = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				tipo = 0;
			}
			
			if (tipo == 7) {
				System.out.println("\nConsultoria TRADE - Seu candidato está aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (tipo) {
			case 1:
				System.out.println("Preço Triagem: R$100,00");
				preco = 100;
				System.out.println("\nNome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				System.out.println("\nQuantas triagens quer adicionar ao carrinho?");
				qtnd = leia.nextInt();
				valorTotal = contas.cobrar(qtnd, preco);
				System.out.println("Valor do seu carrinho: R$ " + valorTotal);
			
				
                		break;
			case 2:
				System.out.println("Preço Entrevista Comportamental: R$ 300,00 ");
				preco = 300;
				System.out.println("\nNome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				System.out.println("\nQuantas entrevistas comportamentais quer adicionar ao carrinho?");
				qtnd = leia.nextInt();
				valorTotal = contas.cobrar(qtnd, preco);
				System.out.println("Valor do seu carrinho: R$ " + valorTotal);
                		break;
			case 3:
				System.out.println("Preço Entrevista Técnica: R$ 400,00 ");
				preco = 400;
				System.out.println("\nNome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				System.out.println("\nQuantas entrevistas técnicas quer adicionar ao carrinho?");
				qtnd = leia.nextInt();
				valorTotal = contas.cobrar(qtnd, preco);
				System.out.println("Valor do seu carrinho: R$ " + valorTotal);
                		break;
			case 4:
				System.out.println("Preço Entrevista Comportamental + Entrevista Técnica: R$ 600,00 ");
				preco = 600;
				System.out.println("\nNome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				System.out.println("\nQuantas entrevistas (comportamentais + técnicas) quer adicionar ao carrinho?");
				qtnd = leia.nextInt();
				valorTotal = contas.cobrar(qtnd, preco);
				System.out.println("Valor do seu carrinho: R$ " + valorTotal);
                		break;
			case 5:
				System.out.println("Tech Recruiter (2 profissionais por 2 semanas): R$ 6.380,00 ");
				preco = 6380;
				System.out.println("\nNome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				System.out.println("\nQuantos Tech Recruiters quer adicionar ao carrinho?");
				qtnd = leia.nextInt();
				valorTotal = contas.cobrar(qtnd, preco);
				System.out.println("Valor do seu carrinho: R$ " + valorTotal);
               	 	break;
			case 6:
				System.out.println("Preço Consultoria Completa: R$ 10.850,00 ");
				preco = 10850;
				System.out.println("\nNome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				System.out.println("\nQuantas consultorias quer adicionar ao carrinho?");
				qtnd = leia.nextInt();
				valorTotal = contas.cobrar(qtnd, preco);
				System.out.println("Valor do seu carrinho: R$ " + valorTotal);
               	 	break;
			default:
				System.out.println("\nOpção Inválida!\n");
                		break;
			}
		}	
    }

    public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Fernanda Yoshimi Shimamura");
		System.out.println("E-mail - fershimamura.tech@gmail.com");
		System.out.println("github.com/FerShimamura");
		System.out.println("***********************************************************");
	}

}	
