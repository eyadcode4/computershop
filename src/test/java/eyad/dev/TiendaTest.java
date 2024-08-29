package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {
    private Tienda store;
    private Computador computer1;
    private Computador computer2;

    @BeforeEach
    void setUp() {
        store = new Tienda("banana", "jose", "123", new ArrayList<>());
        computer1 = new Computador("HP", 16, "i5", "W98", 1200.00);
        computer2 = new Computador("Lenovo", 16, "15", "W10", 1100.00);
    }

    @Test
    public void testGetName() {
        assertEquals("banana", store.getName());
    }

    @Test
    public void testSetName() {
        store.setName("banana1");
        assertEquals("banana1", store.getName());
    }

    @Test
    public void testGetOwner() {
        assertEquals("jose", store.getOwner());
    }

    @Test
    public void testSetOwner() {
        store.setOwner("Maria");
        assertEquals("Maria", store.getOwner());
    }

    @Test
    public void testGetStoreTaxId() {
        assertEquals("123", store.getStoreTaxId());
    }

    @Test
    public void testSetStoreTaxId() {
        store.setStoreTaxId("1234");
        assertEquals("1234", store.getStoreTaxId());
    }

    @Test
    public void testGetComputers() {
        assertTrue(store.getComputers().isEmpty());
    }

    @Test
    public void testSetComputers() {
        List<Computador> computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
        store.setComputers(computers);
        assertEquals(computers, store.getComputers());
    }

    @Test
    void testAddComputer() {
        store.addComputer(computer1);
        assertEquals(1, store.listComputers().size());
        assertTrue(store.listComputers().contains(computer1));
    }

    @Test
    void testRemoveComputer() {
        store.addComputer(computer1);
        store.addComputer(computer2);
        assertTrue(store.removeComputer("HP"));
        assertEquals(1, store.listComputers().size());
        assertFalse(store.listComputers().contains(computer1));
    }

    @Test
    void testFindComputer() {
        store.addComputer(computer1);
        store.addComputer(computer2);
        assertEquals(computer1, store.findComputer("HP"));
        assertNull(store.findComputer("Dell"));
    }

    @Test
    void testListComputer() {
        store.addComputer(computer1);
        store.addComputer(computer2);
        List<Computador> computerList = store.listComputers();
        assertEquals(2, computerList.size());
        assertTrue(computerList.contains(computer1));
        assertTrue(computerList.contains(computer2));
    }
}