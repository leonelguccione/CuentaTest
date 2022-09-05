package cuentaproyecto.Test;

import cuentaproyecto.modelo.Cuenta;
import cuentaproyecto.modelo.Persona;

import junit.framework.TestCase;

public class PersonaTest extends  TestCase
{
    private Persona persona;
    
    @Override
    protected void setUp()
    {
        Persona cliente = new Persona("Tony Stark", "18403109");
        assertEquals(persona.getDni(),"18403109" );
        assertEquals(persona.getNya(),"Tony Stark" );
    }
    
    
}
