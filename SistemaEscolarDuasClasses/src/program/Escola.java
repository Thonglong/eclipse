package program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Escola {

	String usuario;
	String senha;
	boolean loginErrado = true;

	void autentica() {

		while (loginErrado) {

			Map<String, String> mapLogin = new HashMap<String, String>();
			mapLogin.put("HENRIQUE", "HGG123");
			mapLogin.put("DOUGLAS", "DGG456");
			mapLogin.put("JOAO", "JGG789");
			Scanner cs = new Scanner(System.in);

			System.out.println("Digite seu usuario: ");
			usuario = cs.nextLine();
			System.out.println("Digite sua Senha: ");
			senha = cs.nextLine();

			if (mapLogin.get(usuario) != null) {
				if (mapLogin.get(usuario).equals(senha)) {
					loginErrado = false;
				}
			}

		}
	}
}