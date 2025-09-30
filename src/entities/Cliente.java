package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private static final int MAXIMO_CUENTAS = 2;

    private String nombre;
    private String direccion;
    private String numTarjeta;
    private String pin;
    private List<Cuenta> cuentas;

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Cliente(String nombre, String direccion, String numTarjeta, String pin) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numTarjeta = numTarjeta;
        this.pin = pin;
        this.cuentas = new ArrayList<>();
    }

    public boolean verificarPin(String pin) {
        return this.pin.equals(pin);
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nombre + " con tarjeta **" + this.numTarjeta.substring(2) +
                ", oriundo de " + this.direccion + ", con " + this.getCuentas().size();
    }
}
