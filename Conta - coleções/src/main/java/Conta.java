import java.util.Objects;

public class Conta implements Comparable<Conta> {
    private int numero;
    private String titular;
    private double limiteCredito;
    private double saldo;

    public Conta(int numero, String titular, double limiteCredito, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public int compareTo(Conta outraConta) {
        return Integer.compare(this.numero, outraConta.getNumero());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", limiteCredito=" + limiteCredito +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numero == conta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}