package entities;

public class Atm {
    private String ubicacion;
    private String gestionador;
    private int monto;

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getGestionador() {
        return gestionador;
    }

    public void setGestionador(String gestionador) {
        this.gestionador = gestionador;
    }

    public Atm(String ubicacion, String gestionador, int monto) {
        this.ubicacion = ubicacion;
        this.gestionador = gestionador;
        this.monto = monto;
    }

    public void retirar(int montoRetiro) {
        this.monto = this.monto - montoRetiro;
    }

    public void depositar(int montoDeposito) {
        this.monto = this.monto + montoDeposito;
    }

    public int comprobarSaldo() {
        return this.monto;
    }

}
