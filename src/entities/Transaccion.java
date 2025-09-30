package entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaccion {
    private long id;
    private LocalDate date;
    private String tipo;
    private BigDecimal monto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Transaccion(long id, LocalDate date, String tipo, BigDecimal monto) {
        this.id = id;
        this.date = date;
        this.tipo = tipo;
        this.monto = monto;
    }
}
