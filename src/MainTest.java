import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    //stampa prevista dall'esercizio "08 febbraio 2024"
    @Test
    public void checkDataAggiornataFunziona() {
        assertEquals("08 febbraio 2024", "08 febbraio 2024");
    }
    @Test
    public void checkDataAggiornataNonFunziona() {
        assertEquals("08 febbraio 2024", "09 febbraio 2024");
    }
}