package test;

import exception.MinhaExcecao;

public class Fluxo {

	public static void test() {
		System.out.println("Início do teste");

		try {
			metodoA();
		} catch(Exception ex) {
			String msg = ex.getMessage();

			System.out.println("Exception " + msg);

			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void metodoA() throws MinhaExcecao {
		System.out.println("Início do método (A)");

		metodoB();

		System.out.println("Fim do método (A)");
	}

	private static void metodoB() throws MinhaExcecao {
		System.out.println("Início do método (B)");

		throw new MinhaExcecao("deu muito errado");
	}
}