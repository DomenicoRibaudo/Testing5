//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        aggiungi un anno
//        sottrai un mese
//        aggiungi 7 giorni
//        Stampa il risultato localizzata per l'Italia
//        Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        String inputString = "2023-03-01T13:00:00Z";
        ZonedDateTime zonedDateTime = OffsetDateTime.parse(inputString).toZonedDateTime();

        //Aggiungi un anno, sottrai un mese, aggiungi 7 giorni
        ZonedDateTime dataModificata = zonedDateTime.plusYears(1).minusMonths(1).plusDays(7);
        String stringa = dataModificata.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        //Stampa il risultato localizzata per l'Italia
        System.out.println(stringa);

    }

}
