package ua.i.mail100.template.abstractclass;

/**
 * Base class of social network.
 */
public abstract class Network {
    public String userName;
    public String password;

    public Network() {}

    /**
     * Publish the data to whatever network.
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    public abstract boolean logIn(String userName, String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logOut();
}