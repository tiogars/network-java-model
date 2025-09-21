package fr.tiogars.network;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link Interface} class.
 * <p>
 * These tests verify the correct behavior of the Interface class methods,
 * including constructor, getters, and setters.
 */
public class InterfaceTest {

    /**
     * Default constructor for InterfaceTest.
     * Required for Javadoc compliance.
     */
    public InterfaceTest() {}

    /**
     * Tests the constructor and getter methods of Interface.
     */
    @Test
    public void testConstructorAndGetters() {
        InterfaceType type = InterfaceType.Ethernet;
        String ip = "192.168.1.10";
        String mac = "AA:BB:CC:DD:EE:FF";
        Interface iface = new Interface(type, ip, mac);

        assertEquals(type, iface.getType());
        assertEquals(ip, iface.getIpAddress());
        assertEquals(mac, iface.getMacAddress());
    }

    /**
     * Tests the setType method of Interface.
     */
    @Test
    public void testSetType() {
        Interface iface = new Interface(InterfaceType.WiFi, "10.0.0.1", "11:22:33:44:55:66");
        iface.setType(InterfaceType.Ethernet);
        assertEquals(InterfaceType.Ethernet, iface.getType());
    }

    /**
     * Tests the setIpAddress method of Interface.
     */
    @Test
    public void testSetIpAddress() {
        Interface iface = new Interface(InterfaceType.WiFi, "10.0.0.1", "11:22:33:44:55:66");
        iface.setIpAddress("172.16.0.2");
    /**
     * Tests the setType method of Interface.
     */
        assertEquals("172.16.0.2", iface.getIpAddress());
    }

    /**
     * Tests the setMacAddress method of Interface.
     */
    @Test
    public void testSetMacAddress() {
        Interface iface = new Interface(InterfaceType.WiFi, "10.0.0.1", "11:22:33:44:55:66");
        iface.setMacAddress("FF:EE:DD:CC:BB:AA");
    /**
     * Tests the setIpAddress method of Interface.
     */
        assertEquals("FF:EE:DD:CC:BB:AA", iface.getMacAddress());
    }

    /**
     * Tests setters with null and empty values for Interface.
     */
    @Test
    public void testSettersWithNullAndEmpty() {
        Interface iface = new Interface(InterfaceType.WiFi, "10.0.0.1", "11:22:33:44:55:66");
        iface.setType(null);
    /**
     * Tests the setMacAddress method of Interface.
     */
        iface.setIpAddress(null);
        iface.setMacAddress(null);
        assertNull(iface.getType());
        assertNull(iface.getIpAddress());
        assertNull(iface.getMacAddress());

        iface.setIpAddress("");
    /**
     * Tests setters with null and empty values for Interface.
     */
        iface.setMacAddress("");
        assertEquals("", iface.getIpAddress());
        assertEquals("", iface.getMacAddress());
    }

    /**
     * Tests independence of multiple Interface instances.
     */
    @Test
    public void testMultipleInstancesIndependence() {
        Interface iface1 = new Interface(InterfaceType.WiFi, "10.0.0.1", "11:22:33:44:55:66");
        Interface iface2 = new Interface(InterfaceType.Ethernet, "192.168.0.2", "AA:BB:CC:DD:EE:FF");

        iface1.setIpAddress("1.2.3.4");
        iface2.setMacAddress("00:00:00:00:00:00");

        assertEquals("1.2.3.4", iface1.getIpAddress());
        assertEquals("192.168.0.2", iface2.getIpAddress());
        assertEquals("11:22:33:44:55:66", iface1.getMacAddress());
    /**
     * Tests independence of multiple Interface instances.
     */
        assertEquals("00:00:00:00:00:00", iface2.getMacAddress());
    }
}
