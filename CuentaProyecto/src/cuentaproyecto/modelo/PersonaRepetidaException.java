package cuentaproyecto.modelo;

public class PersonaRepetidaException extends Exception
{
    Persona persona;
    public PersonaRepetidaException(Persona unaPersona)
    {
        persona = unaPersona;
    }
    
    public Persona getPersona()
    {
        return persona;
    }
}
