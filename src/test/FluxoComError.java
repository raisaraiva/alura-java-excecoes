package test;

public class FluxoComError {

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

	private static void metodoA() {
		System.out.println("Início do método (A)");

		metodoB();

		System.out.println("Fim do método (A)");
	}

	private static void metodoB() {
		System.out.println("Início do método (B)");

		metodoB();

		System.out.println("Fim do método (B)");
	}
}