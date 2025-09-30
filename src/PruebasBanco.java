import entities.Atm;
import entities.Banco;
import entities.Cliente;
import entities.Cuenta;

import java.math.BigDecimal;

public class PruebasBanco {

    public static void main(String[] args) {
        Banco unBanco = new Banco("001", "Puriscal");
        Atm unCajero = new Atm("SJ", "banco", 4000000);
        Atm otroCajero= new Atm("Alajuela", "banco", 400000000);
        unBanco.getAtms().add(unCajero);
        unBanco.getAtms().add(otroCajero);
        Cliente unCliente = new Cliente("mortadelo","Tibas", "777", "1111");
        Cliente otroCliente = new Cliente("pepe","Cartego", "778", "2222");
        Cuenta una = new Cuenta(1, unCliente, BigDecimal.valueOf(10000).setScale(2));
        Cuenta dos = new Cuenta(2, otroCliente, BigDecimal.valueOf(20000).setScale(2));
        unCliente.getCuentas().add(una);
        otroCliente.getCuentas().add(dos);
        unBanco.getCuentas().add(una);
        unBanco.getCuentas().add(dos);
        System.out.println(unBanco);
        System.out.println(unCliente);
        System.out.println(otroCliente);
    }
}
