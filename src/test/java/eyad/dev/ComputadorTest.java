package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputadorTest {
    private Computador computer;

    @BeforeEach
    void setUp() {
        computer = new Computador("HP", 16, "i7", "W10", 1200.00);
    }

    @Test
    void testGetBrand() {
        assertEquals("HP", computer.getBrand());
    }

    @Test
    void testSetBrand() {
        computer.setBrand("Dell");
        assertEquals("Dell", computer.getBrand());
    }

    @Test
    void testGetMemory() {
        assertEquals(16, computer.getMemory());
    }

    @Test
    void testSetMemory() {
        computer.setMemory(8);
        assertEquals(8, computer.getMemory());
    }

    @Test
    void testGetProcessor() {
        assertEquals("i7", computer.getProcessor());
    }

    @Test
    void testSetProcessor() {
        computer.setProcessor("i5");
        assertEquals("i5", computer.getProcessor());
    }

    @Test
    void testGetOperationSystem() {
        assertEquals("W10", computer.getOperatingSystem());
    }

    @Test
    void testSetOperationSystem() {
        computer.setOperatingSystem("OS");
        assertEquals("OS", computer.getOperatingSystem());
    }

    @Test
    void testGetPrince() {
        assertEquals(1200.00, computer.getPrice());
    }

    @Test
    void testSetPrice() {
        computer.setPrice(1250.00);
        assertEquals(1250.00, computer.getPrice());
    }
}
