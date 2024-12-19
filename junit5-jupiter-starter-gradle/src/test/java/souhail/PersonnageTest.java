package souhail;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PersonnageTest{
@Test
public void testTournerDepuisEst() {
    assertEquals("SUD", Personnage.tourner("EST", 1));
}

@Test
void testTournerDepuisOuestVersNord() {
    assertEquals("NORD", Personnage.tourner("OUEST", 1));
}

}



















































/*package souhail;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonnageTest {

    @Test
    public void testTournerUneFois() {
        // Given
        String ch = "NORD";

        // When
        String res = Personnage.tourner(ch, 1);

        // Then
        assertEquals("EST", res);
    }
    @Test
    public void tourner_deuxfois(){
        //given
        String ch = "NORD";
        //when
        String res = Personnage.tourner(ch, 2);
        //then
        assertEquals("SUD", res);

    }

    @Test
    public void testTournerNegatif() {
        // Given
        String ch = "NORD";

        // When
        String res = Personnage.tourner(ch, -1);

        // Then
        assertEquals("OUEST", res);
    }
}
*/