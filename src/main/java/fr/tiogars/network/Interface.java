package fr.tiogars.network;
/**
 * Represents a network interface of a device.
 * <p>
 * An Interface has a type, an IP address, and a MAC address.
 * It is associated with one {@link InterfaceType}.
 * A Device can have multiple Interface objects.
 */
public class Interface {
    /** The type of the network interface. */
    private InterfaceType type;
    /** The IP address assigned to the interface. */
    private String ipAddress;
    /** The MAC address of the interface. */
    private String macAddress;

    /**
     * Constructs an Interface with the specified type, IP address, and MAC address.
     *
     * @param type the type of the interface
     * @param ipAddress the IP address assigned to the interface
     * @param macAddress the MAC address of the interface
     */
    public Interface(InterfaceType type, String ipAddress, String macAddress) {
        this.type = type;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
    }

    /**
     * Gets the type of the interface.
     * @return the interface type
     */
    public InterfaceType getType() {
        return type;
    }

    /**
     * Sets the type of the interface.
     * @param type the interface type
     */
    public void setType(InterfaceType type) {
        this.type = type;
    }

    /**
     * Gets the IP address of the interface.
     * @return the IP address
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the IP address of the interface.
     * @param ipAddress the IP address
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Gets the MAC address of the interface.
     * @return the MAC address
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the MAC address of the interface.
     * @param macAddress the MAC address
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}
