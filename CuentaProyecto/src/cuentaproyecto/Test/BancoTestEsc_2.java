package cuentaproyecto.Test;

import cuentaproyecto.modelo.Banco;
import cuentaproyecto.modelo.OtraExcepcion;
import cuentaproyecto.modelo.Persona;

import cuentaproyecto.modelo.PersonaRepetidaException;

import junit.framework.TestCase;

public class BancoTestEsc_2 extends TestCase
{
    private Banco banco;

    @Override
    protected void setUp()
    {
        banco = new Banco();
        assertEquals("falló el constructor en el banco", banco.getPersonas().size(), 0);
        Persona persona1 = new Persona("Tony Stark", "18403109"); //es necesario testear esto??
        Persona persona2 = new Persona("El chavo del 8", "1234"); //es necesario testear esto??
        try
        {
            banco.addPersona(persona1);
            banco.addPersona(persona2);
        }
        catch (PersonaRepetidaException e)
        {
        }


    }

    /**
     * testea agregar una nueva persona (no repetido)
     */
    public void testAdd_nuevo()
    {
        int cant_personas = banco.getPersonas().size();
        Persona persona = new Persona("Moe", "213344"); //es necesario testear esto??
        try
        {
            banco.addPersona(persona);
            assertEquals("falló addPersona nueva", banco.getPersonas().size(), cant_personas + 1);
        }
        catch (PersonaRepetidaException pr)
        {

        }
    }

    /**
     * testea agregar una nueva persona repetida
     *
     */
    @SuppressWarnings("oracle.jdeveloper.java.insufficient-catch-block")
    public void testAdd_repetido()
    {
        int cant_personas = banco.getPersonas().size();
        Persona persona = new Persona("El chavo del 8", "1234"); //podría haber buscado una persona de la colección
        try
        {
            banco.addPersona(persona);
            fail();
        }
        catch (PersonaRepetidaException pr)
        {
            //si llegamos acá no es necesario hacer nada
        }
        catch (Exception oe)
        {
            fail();
        }
    }

}
