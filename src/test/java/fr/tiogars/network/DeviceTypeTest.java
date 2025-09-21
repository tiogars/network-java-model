// Java
package fr.tiogars.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the DeviceType enum.
 */
public class DeviceTypeTest {

    /**
     * Default constructor for DeviceTypeTest.
     * Required for Javadoc compliance.
     */
    public DeviceTypeTest() {}

    /**
     * Tests that all expected enum constants exist.
     */
    @Test
    public void testEnumConstantsExistence() {
        assertNotNull(DeviceType.Server);
        assertNotNull(DeviceType.Router);
        assertNotNull(DeviceType.Firewall);
        assertNotNull(DeviceType.Switch);
        assertNotNull(DeviceType.AccessPoint);
        assertNotNull(DeviceType.Repeater);
        assertNotNull(DeviceType.Printer);
        assertNotNull(DeviceType.Desktop);
        assertNotNull(DeviceType.Laptop);
        assertNotNull(DeviceType.Tab);
        assertNotNull(DeviceType.Phone);
        assertNotNull(DeviceType.Television);
    }

    /**
     * Tests valueOf returns the correct enum constant for each name.
     */
    @Test
    public void testValueOf() {
        assertEquals(DeviceType.Server, DeviceType.valueOf("Server"));
        assertEquals(DeviceType.Router, DeviceType.valueOf("Router"));
        assertEquals(DeviceType.Firewall, DeviceType.valueOf("Firewall"));
        assertEquals(DeviceType.Switch, DeviceType.valueOf("Switch"));
        assertEquals(DeviceType.AccessPoint, DeviceType.valueOf("AccessPoint"));
        assertEquals(DeviceType.Repeater, DeviceType.valueOf("Repeater"));
        assertEquals(DeviceType.Printer, DeviceType.valueOf("Printer"));
        assertEquals(DeviceType.Desktop, DeviceType.valueOf("Desktop"));
        assertEquals(DeviceType.Laptop, DeviceType.valueOf("Laptop"));
        assertEquals(DeviceType.Tab, DeviceType.valueOf("Tab"));
        assertEquals(DeviceType.Phone, DeviceType.valueOf("Phone"));
        assertEquals(DeviceType.Television, DeviceType.valueOf("Television"));
    }

    /**
     * Tests that values() returns all constants in the correct order.
     */
    @Test
    public void testValuesOrder() {
        DeviceType[] expected = {
            DeviceType.Server,
            DeviceType.Router,
            DeviceType.Firewall,
            DeviceType.Switch,
            DeviceType.AccessPoint,
            DeviceType.Repeater,
            DeviceType.Printer,
            DeviceType.Desktop,
            DeviceType.Laptop,
            DeviceType.Tab,
            DeviceType.Phone,
            DeviceType.Television
        };
        assertArrayEquals(expected, DeviceType.values());
    }

    /**
     * Tests that enum constants have the correct names.
     */
    @Test
    public void testEnumNames() {
        for (DeviceType type : DeviceType.values()) {
            assertEquals(type.name(), type.toString());
        }
    }

    /**
     * Tests that enum constants are unique.
     */
    @Test
    public void testEnumUniqueness() {
        DeviceType[] types = DeviceType.values();
        for (int i = 0; i < types.length; i++) {
            for (int j = i + 1; j < types.length; j++) {
                assertNotEquals(types[i], types[j]);
            }
        }
    }
}