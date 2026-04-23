import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUUT {

    @Test
    public void TestConstructorAndGetter() {
        UnitUnderTest uut = new UnitUnderTest(17);
        assertEquals(17, uut.getSomeAttribute());
    }
}
