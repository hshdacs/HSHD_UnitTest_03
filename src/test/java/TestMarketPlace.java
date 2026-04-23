import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestMarketPlace {
    private MarketPlace marketPlace;

    @Mock
    private Car myCar;



    @BeforeEach
    public void setup() {
        marketPlace = new MarketPlace();
    }

    @AfterEach
    public void teardown() {
        marketPlace = null;
    }

    @Test
    public void TestConstructor() {
        //assumeTrue(marketPlace != null);
        assertNotNull(marketPlace);
    }

    @Test
    public void TestSomeOtherStuff() {
        float f = 0.1F;
        assertEquals(0.1, f, 0.000001);
    }

    @Test
    public void TestAddACar() {
        assumeTrue(marketPlace != null);
        marketPlace.addCar(myCar);
        // how to test this?
        when( myCar.sellingValue()).thenReturn(100.0);
        assertEquals(100, marketPlace.getPriceForAllCars());
    }
}
