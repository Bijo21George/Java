package Interface;

public class SybaseDB implements Database {
    public void connect()
    {
        System.out.println("Sybase DB connected");
    }
    public void disconnect()
    {
        System.out.println("Sybase DB disconnected");
    }
}
