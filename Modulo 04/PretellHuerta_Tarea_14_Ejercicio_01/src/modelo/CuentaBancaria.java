
package modelo;


  public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(int monto, String cajero, StringBuilder log) {
        saldo += monto;
        log.append(cajero + " depositó: " + monto + " | Saldo actual: " + saldo + "\n");
    }

    public synchronized void retirar(int monto, String cajero, StringBuilder log) {
        if (saldo >= monto) {
            saldo -= monto;
            log.append(cajero + " retiró: " + monto + " | Saldo actual: " + saldo + "\n");
        } else {
            log.append(cajero + " intentó retirar: " + monto + " | Fondos insuficientes | Saldo actual: " + saldo + "\n");
        }
    }

    public int getSaldo() {
        return saldo;
    }
  }
