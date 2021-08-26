import test.Fluxo;
import test.FluxoComError;
import test.FluxoComTratamento;

public class Program {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("Fluxo");
        System.out.println("--------------------------------");
        Fluxo.test();
        System.out.println("--------------------------------");
        System.out.println("FluxoComTratamento");
        System.out.println("--------------------------------");
        FluxoComTratamento.test();
        System.out.println("--------------------------------");
        System.out.println("FluxoComError");
        System.out.println("--------------------------------");
        FluxoComError.test();
    }
}
