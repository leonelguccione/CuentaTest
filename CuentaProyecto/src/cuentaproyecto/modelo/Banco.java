package cuentaproyecto.modelo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/**SRS
 * personas != null
 * cuentas != null
 * CONTRATO
 * invariante de clase
 * personas != null
 * cuentas != null
 */
public class Banco
{
    /**
     * @associates <{cuentaproyecto.modelo.Persona}>
     */
    private HashMap<String, Persona> personas;

    /**
     * @associates <{cuentaproyecto.modelo.Cuenta}>
     */
    private HashMap<String, Cuenta> cuentas;


    /**Inv:
     * personas!= null
     * cuentas != null
     */
    public Banco()
    {
        personas = new HashMap<String, Persona>();
        cuentas = new HashMap<String, Cuenta>();
        assert invariante() : "Fallo invariante";
    }


    public HashMap<String, Persona> getPersonas() //quizas sea mejor un DTO
    {
        return personas;
    }

    public HashMap<String, Cuenta> getCuentas() //quizas sea mejor un DTO
    {
        return cuentas;
    }

    public boolean invariante()
    {
        return personas != null && cuentas != null;
    }


    /**
     * SRS:
     * no se puede agregar una persona ya agregada
     * pre: newPersona != null
     */
    public void addPersona(Persona newPersona) throws PersonaRepetidaException
    {
        assert newPersona != null : "intento agregar personal null";
        if (buscarPersona(newPersona.getDni()))
        {
            throw new PersonaRepetidaException(newPersona);
        }
        personas.put(newPersona.getDni(), newPersona);
        assert invariante() : "fallo invariante al agregar persona";
    }

    public boolean buscarPersona(String dni)
    {
        return personas.containsKey(dni);
    }


}
