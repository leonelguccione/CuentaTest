package cuentaproyecto.modelo;


/**inv: codigo único
 * inv: titular != null
 * inv: estado == OPERATIVA || INACTIVA || CANCELADA
 */
public class Cuenta
{
    private static int ultimoCodigo = 0;
    private int codigo;
    private double saldo;
    private final Persona titular;
    private int estado;

    /**
     * @param persona != null
     * @param saldoInicial >= 0
     * post: estado == EstadoCuenta.OPERATIVA
     * post: ultimoCodigo == ultimoCodigo + 1
     * post: codigo == ultimoCodigo //codigo único
     */
    public Cuenta(Persona persona, double saldoInicial)
    {
        codigo = ++ultimoCodigo;
        saldo = saldoInicial;
        titular = persona;
        estado = EstadoCuenta.OPERATIVA;
    }

    
    /**
     * SRS
     * El saldo se incrementa en un valor igual a la cantidad (no fue implementado en el contrato aún).
     * CONTRATO
     * pre: cantidad >= 0
     * pre: estado == EstadoCuenta.OPERATIVA
     * inv: titular != null
     */
    public void ingreso(double cantidad)
    {
        assert cantidad >= 0 : "cantidad negativa";
        assert estado == EstadoCuenta.OPERATIVA: "estado incorrecto";
        saldo = saldo + cantidad;
        assert invariante() : "Fallo invariante";
    }

    private boolean invariante()
    {
        return titular != null;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public Persona getTitular()
    {
        return titular;
    }

    public void setEstado(int estado)
    {
        this.estado = estado;
    }

    public int getEstado()
    {
        return estado;
    }


}
