package cuentaproyecto.Test;

import cuentaproyecto.modelo.Cuenta;
import cuentaproyecto.modelo.EstadoCuenta;
import cuentaproyecto.modelo.Persona;

import junit.framework.TestCase;

public class CuentaTest extends TestCase
{
    private Cuenta cuenta;

    @Override
    protected void setUp()
    {
        Persona persona = new Persona("Juan González", "33435332");
        cuenta = new Cuenta(persona, 100.00);
        assertEquals("falló el constructor en el titular", cuenta.getTitular(), persona);
        assertEquals("fallo la inicialización del saldo", cuenta.getSaldo(), 100.00);
    }

    public void testIngreso_1()
    {
        cuenta.ingreso(1000.00);
        assertEquals("falló ingreso x clase de equivalencia",1100.00, cuenta.getSaldo());
        assertEquals("falló estado",EstadoCuenta.OPERATIVA, cuenta.getEstado());
    }
    
    public void testIngreso_2()
    {
        cuenta.ingreso(1);
        assertEquals("falló ingreso x valores límites",101.00, cuenta.getSaldo());
        assertEquals("falló estado",EstadoCuenta.OPERATIVA, cuenta.getEstado());
    }
    
}
