package ohtu;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplierTest {
    @Test
    public void kertominenToimii()  {
        Multiplier kolme = new Multiplier(3);

        assertEquals(3, kolme.multipliedBy(1));
        assertEquals(24, kolme.multipliedBy(85));
    }
}