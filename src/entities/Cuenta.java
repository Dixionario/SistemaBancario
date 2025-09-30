package entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private long numero;
    private BigDecimal saldo;
    private List<Transaccion> transaccions;
    private List<Cliente> cliente;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public List<Transaccion> getTransaccions() {
        return transaccions;
    }

    public void setTransaccions(List<Transaccion> transaccions) {
        this.transaccions = transaccions;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public Cuenta(long numero, Cliente cliente, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = new ArrayList<>();
        this.transaccions = new ArrayList<>();
    }

    public void retirar(BigDecimal montoRetiro) {
        this.saldo.subtract(montoRetiro);
        Transaccion nueva = new Transaccion(1, LocalDate.now(), "retiro", montoRetiro);
        this.transaccions.add(nueva);
    }

    public void depositar(BigDecimal montoRetiro) {
        this.saldo.add(montoRetiro);
        Transaccion nueva = new Transaccion(1, LocalDate.now(), "deposito", montoRetiro);
        this.transaccions.add(nueva);
    }
}
