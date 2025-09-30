package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String codigo;
    private String direccion;
    private List<Cuenta> cuentas;
    private List<Atm> cajeros;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco(String codigo, String direccion) {
        this.codigo = codigo;
        this.direccion = direccion;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public List<Atm> getAtms() {
        return cajeros;
    }

    public void setAtms(List<Atm> atms) {
        this.cajeros = atms;
    }

    public Banco(String codigo, String direccion, List<Cuenta> cuentas) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.cuentas = cuentas;
        this.cajeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Banco: " + this.codigo + ", en " + this.direccion+ ", con "+
                this.cuentas.size() + ", y " + this.cajeros.size() + " cajeros";
    }
}
