package fr.tiogars.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Network class.
 */
public class NetworkTest {

    /**
     * Default constructor for NetworkTest.
     * Required for Javadoc compliance.
     */
    public NetworkTest() {}

    /**
     * Tests the constructor and getName method.
     */
    @Test
    public void testConstructorAndGetName() {
        Network network = new Network("TestNetwork");
        assertEquals("TestNetwork", network.getName());
    }

    /**
     * Tests the setName method.
     */
    @Test
    public void testSetName() {
        Network network = new Network("InitialName");
        network.setName("NewName");
        assertEquals("NewName", network.getName());
    }

    /**
     * Tests the toString method.
     */
    @Test
    public void testToString() {
        Network network = new Network("MyNetwork");
        network.setId(42L);
        String expected = "Network [id=42, name=MyNetwork]";
        assertEquals(expected, network.toString());
    }
}
