import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Junit {
    
    @Test
    public void trasnlateWeb(){

        assertEquals("La pizza Margherita è impressionante", SeleniumTest.translate());
    }
    

}
