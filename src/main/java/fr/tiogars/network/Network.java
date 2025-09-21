package fr.tiogars.network;

/**
 * Represents a network defined by a name.
 */
public class Network {

    /**
     * The unique identifier of the network.
     * This field is intended to be managed by the persistence layer.
     */
    private Long id;

    /**
     * The network's name.
     */
    private String name;

    /**
     * Default constructor for Network.
     * Required for Javadoc compliance.
     */
    public Network() {
        // Default constructor
    }

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

    /**
     * Returns the unique identifier of the network.
     *
     * @return the network's id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the network.
     * This method is intended to be used by the persistence layer.
     *
     * @param id the new id of the network
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns a string representation of the network.
     *
     * @return a string representation of the network
     */
    @Override
    public String toString() {
        return "Network [id=" + id + ", name=" + name + "]";
    }
}
