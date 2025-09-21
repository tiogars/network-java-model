package fr.tiogars.network;

import java.util.List;

/**
 * Represents a network device with a name, type, and associated interfaces.
 * A Device is categorized by its DeviceType and can have multiple network interfaces.
 */
public class Device {
    /** The name of the device. */
    private String name;
    /** The type of the device. */
    private DeviceType type;
    /** The list of interfaces associated with the device. */
    private List<Interface> interfaces;

    /**
     * Constructs a Device with the specified name, type, and interfaces.
     *
     * @param name the name of the device
     * @param type the type of the device
     * @param interfaces the list of interfaces associated with the device
     */
    public Device(String name, DeviceType type, List<Interface> interfaces) {
        this.name = name;
        this.type = type;
        this.interfaces = interfaces;
    }

    /**
     * Returns the name of the device.
     * @return the device name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the device.
     * @param name the device name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the type of the device.
     * @return the device type
     */
    public DeviceType getType() {
        return type;
    }

    /**
     * Sets the type of the device.
     * @param type the device type
     */
    public void setType(DeviceType type) {
        this.type = type;
    }

    /**
     * Returns the list of interfaces associated with the device.
     * @return the list of interfaces
     */
    public List<Interface> getInterfaces() {
        return interfaces;
    }

    /**
     * Sets the list of interfaces associated with the device.
     * @param interfaces the list of interfaces
     */
    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }
}
