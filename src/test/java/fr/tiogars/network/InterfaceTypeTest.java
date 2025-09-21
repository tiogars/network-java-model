package fr.tiogars.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the InterfaceType enum.
 */
public class InterfaceTypeTest {

    /**
     * Default constructor for InterfaceTypeTest.
     * Required for Javadoc compliance.
     */
    public InterfaceTypeTest() {}

    /**
     * Tests that all expected enum constants exist.
     */
    @Test
    public void testEnumConstantsExistence() {
        assertNotNull(InterfaceType.Ethernet);
        assertNotNull(InterfaceType.WiFi);
        assertNotNull(InterfaceType.Virtual);
    }

    /**
     * Tests valueOf returns the correct enum constant for each name.
     */
    @Test
    public void testValueOf() {
        assertEquals(InterfaceType.Ethernet, InterfaceType.valueOf("Ethernet"));
        assertEquals(InterfaceType.WiFi, InterfaceType.valueOf("WiFi"));
        assertEquals(InterfaceType.Virtual, InterfaceType.valueOf("Virtual"));
    }

    /**
     * Tests that values() returns all constants in the correct order.
     */
    @Test
    public void testValuesOrder() {
        InterfaceType[] expected = {
            InterfaceType.Ethernet,
            InterfaceType.WiFi,
            InterfaceType.Virtual
        };
        assertArrayEquals(expected, InterfaceType.values());
    }

    /**
     * Tests that enum constants have the correct names.
     */
    @Test
    public void testEnumNames() {
        for (InterfaceType type : InterfaceType.values()) {
            assertEquals(type.name(), type.toString());
        }
    }

    /**
     * Tests that enum constants are unique.
     */
    @Test
    public void testEnumUniqueness() {
        InterfaceType[] types = InterfaceType.values();
        for (int i = 0; i < types.length; i++) {
            for (int j = i + 1; j < types.length; j++) {
                assertNotEquals(types[i], types[j]);
            }
        }
    }
}
