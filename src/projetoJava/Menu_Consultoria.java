package projetoJava;

import java.util.Scanner;

public class Menu_Consultoria {
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int opcao, produto;
        
        while(true) {
        	
			System.out.println( "**********************************************************************************************");
			System.out.println("                                                                                               ");
			System.out.println("                                 Consultoria TRADE                                             ");
			System.out.println("                                                                                               ");
			System.out.println("***********************************************************************************************");
			System.out.println("                                        Menu:                                                  ");
			System.out.println("         1 - Triagem de currículos                                                             ");
			System.out.println("         2 - Entrevista Comportamental                                                         ");
			System.out.println("         3 - Entrevista Técnica                                                                ");
			System.out.println("         4 - Entrevista Comportamental                                                         ");
			System.out.println("         5 - Tech Recruiter                                                                    ");
			System.out.println("         6 - Consultoria de Recrutamento                                                       ");
			System.out.println("         7 - Sair                                                                              ");
			System.out.println("                                                                                               ");
			System.out.println("***********************************************************************************************");
			System.out.println("Digite a opção desejada:                                                                       ");
			System.out.println("                                                                                               ");
			
			opcao = leia.nextInt();
			
			if (opcao == 7) {
				System.out.println("\nConsultoria TRADE - Seu candidato está aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("\nQuantas Triagens?");
					produto = leia.nextInt();
					break;
					
				case 2:
					System.out.println("\nQuantas Entrevistas Comportamentais?");
					produto = leia.nextInt();
					break;
					
				case 3:
					System.out.println("\nQuantas Entrevistas Técnicas?");
					produto = leia.nextInt();
					break;
					
				case 4:
					System.out.println("\nQuantas Entrevistas Comportamentais + Técnicas?");
					produto = leia.nextInt();
					break;
					
				case 5:
					System.out.println("\nQuantos Tech Recruiters?");
					produto = leia.nextInt();
					break;
					
				case 6:
					System.out.println("\nQuantas Consultorias?");
					produto = leia.nextInt();
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
