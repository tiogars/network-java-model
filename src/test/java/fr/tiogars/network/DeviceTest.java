package fr.tiogars.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

/**
 * Unit tests for the {@link Device} class.
 * <p>
 * These tests verify the correct behavior of the Device class methods,
 * including constructor, getters, and setters.
 */
public class DeviceTest {

    /**
     * Default constructor for DeviceTest.
     * Required for Javadoc compliance.
     */
    public DeviceTest() {}

    /**
     * Tests the constructor and getter methods of Device.
     */
    @Test
    public void testConstructorAndGetters() {
        Interface iface = new Interface(InterfaceType.Ethernet, "192.168.1.2", "00:11:22:33:44:55");
        List<Interface> interfaces = Arrays.asList(iface);
        Device device = new Device("Device1", DeviceType.Router, interfaces);
        assertEquals("Device1", device.getName());
        assertEquals(DeviceType.Router, device.getType());
        assertEquals(interfaces, device.getInterfaces());
    }

    /**
     * Tests the setName method of Device.
     */
    @Test
    public void testSetName() {
        Device device = new Device("OldName", DeviceType.Switch, Arrays.asList());
        device.setName("NewName");
        assertEquals("NewName", device.getName());
    }

    /**
     * Tests the setType method of Device.
     */
    @Test
    public void testSetType() {
        Device device = new Device("Device2", DeviceType.Switch, Arrays.asList());
        device.setType(DeviceType.Server);
        assertEquals(DeviceType.Server, device.getType());
    }

    /**
     * Tests the setInterfaces method of Device.
     */
    @Test
    public void testSetInterfaces() {
        Device device = new Device("Device3", DeviceType.Desktop, Arrays.asList());
        Interface iface = new Interface(InterfaceType.WiFi, "10.0.0.1", "AA:BB:CC:DD:EE:FF");
        List<Interface> newInterfaces = Arrays.asList(iface);
        device.setInterfaces(newInterfaces);
        assertEquals(newInterfaces, device.getInterfaces());
    }
}
