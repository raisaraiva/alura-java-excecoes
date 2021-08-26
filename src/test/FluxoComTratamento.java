package test;

public class FluxoComTratamento {

    public static void test() {
        System.out.println("Início do teste");

        try {
            metodoA();
        } catch (ArithmeticException | NullPointerException ex) {
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

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            int a = i / 0;
        }

        System.out.println("Fim do método (B)");
    }
}