package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interface {
	public static void montarMenu(ArrayList<String> lista_opcoes) {
		for (int i = 0; i < lista_opcoes.size(); i++) {
			System.out.println(i + ". " + lista_opcoes.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> lista_opcoes = new ArrayList<String>(
		List.of("Novo usuário", "Remove usuário", "Logar", "Sair")
		);
		
		int opcao_usuario = 0;
		String nome, email;
		Scanner entrada = new Scanner(System.in);
		
		do {
			Interface.montarMenu(lista_opcoes);
			
			switch (opcao_usuario)
			{
			case 1:
				System.out.println("Entre com um novo usuário: ");
				nome = entrada.nextLine();
				
				System.out.println("Entre com um novo usuário: ");
				email = entrada.nextLine();
				
				Usuario novo_usuario = new Usuario(nome, email);
				
				//ListaUsuarios.adicionarUsuario(novo_usuario);
			}
			
		} while (opcao_usuario != 0);
	}
}
