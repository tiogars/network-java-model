package fr.tiogars.network;

/**
 * Represents a network defined by a name.
 */
public class Network {

    /**
     * The network's name.
     */
    private String name;

    /**
     * Create a new network with the specified name.
     * 
     * @param name the network's name
     */
    public Network(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the network.
     *
     * @return the network's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the network.
     *
     * @param name the new name of the network
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Network{" +
                "name='" + name + '\'' +
                '}';
    }
}
