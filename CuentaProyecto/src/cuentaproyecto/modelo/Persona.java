package cuentaproyecto.modelo;


/**inv: nya != null
 * inv: nya != ""
 * inv: dni != null
 * inv: dni != ""
 * inv: dni compuesto por digitos numéricos
 */
public class Persona
{
    private String nya;
    private String dni;

    /**
     * pre: nya != null 
     * pre: nya != ""
     * pre: nya compuesto por caracteres numéricos
     * pre: dni != null
     * pre: dni != ""
     * pre: dni compuesto por dígitos numéricos
     * post: this.nya = nya
     * post: this.dni = dni
     */
    public Persona(String nya, String dni)
    {
        super();
        this.nya = nya;
        this.dni = dni;
    }

    public void setNya(String nya)
    {
        this.nya = nya;
    }

    public String getNya()
    {
        return nya;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getDni()
    {
        return dni;
    }


    @Override
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Persona))
        {
            return false;
        }
        final Persona other = (Persona) object;
        if (!(nya == null ? other.nya == null : nya.equals(other.nya)))
        {
            return false;
        }
        if (!(dni == null ? other.dni == null : dni.equals(other.dni)))
        {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((nya == null) ? 0 : nya.hashCode());
        result = PRIME * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }
}
