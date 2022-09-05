package cuentaproyecto.Test;

import cuentaproyecto.modelo.Banco;

import cuentaproyecto.modelo.Persona;

import cuentaproyecto.modelo.PersonaRepetidaException;

import junit.framework.TestCase;

/**Testeo Escenario 1
 * El banco no tiene personas en su colección
 */
public class BancoTestEsc_1 extends TestCase
{
   private Banco banco;
   
    @Override
    protected void setUp()
    {
        banco = new Banco();
        assertEquals("falló el constructor en el banco", banco.getPersonas().size(), 0);
    }
    
    public void testAdd_1()
    {
        Persona persona = new Persona ("Tony Stark", "18403109"); //es necesario testear esto??
        try
        {
            banco.addPersona(persona);
        }
        catch (PersonaRepetidaException e)
        {
        }
        assertEquals("falló addPersona", banco.getPersonas().size(), 1);        
    }
}
