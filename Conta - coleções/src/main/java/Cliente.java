import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1001, "Maria", 5000.0, 1500.0);
        Conta conta2 = new Conta(1002, "João", 3000.0, 2500.0);
        Conta conta3 = new Conta(1003, "Ana", 4000.0, 3500.0);
        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        Collections.sort(contas);
        System.out.println("Contas ordenadas pelo número:");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
        contas.sort(Comparator.comparing(Conta::getTitular));
        System.out.println("\nContas ordenadas pelo nome do titular:");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}


