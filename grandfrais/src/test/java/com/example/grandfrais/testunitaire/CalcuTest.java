package com.example.grandfrais.testunitaire;

import com.example.grandfrais.Calcul;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("CalculText")
@DisplayName("Testing calcul class")
public class CalcuTest {
        private float a = 5 ;
        private float b = 2;

        Calcul calcul = new Calcul(a,b);

    @Order(value = 1)
    @DisplayName("Addition methode")
    @Test
    public void calculSoustraireTest() throws Exception{
        Assertions.assertEquals(this.calcul.soustraire(a,b),3);
    }
    @Order(value = 2)
    @DisplayName("Addition methode")
    @Test
    public void calculCarreTest() throws Exception{
        Assertions.assertEquals(this.calcul.carre(a),25);
    }
    @Order(value = 3)
    @DisplayName("Addition methode")
    @Test
    public void calculMutiplierTest() throws Exception{
        Assertions.assertEquals(this.calcul.multiplier(a,b),10);
    }
    @Order(value = 4)
    @DisplayName("Addition methode")
    @Test
    public void calculIdentiteRemarquableTest() throws Exception{
        Assertions.assertEquals(this.calcul.identiteRemarquable(a,b),49.0);
    }
    @Order(value = 5)
    @DisplayName("Addition methode")
    @Test
    public void calculDiviserTest() throws Exception{
        Assertions.assertEquals(this.calcul.diviser(a,b),2.5);
    }
    @Order(value = 6)
    @DisplayName("Addition methode")
    @Test
    public void calculAdditionTest() throws Exception{
        Assertions.assertEquals(this.calcul.additionner(a,b),7.0);
    }

}
