package cuentaproyecto.Test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite("Test aplicación bancaria");
        suite.addTestSuite(CuentaTest.class);
        suite.addTestSuite(PersonaTest.class);
        suite.addTestSuite(BancoTestEsc_1.class);
        suite.addTestSuite(BancoTestEsc_2.class);
        return suite;
    }
}
