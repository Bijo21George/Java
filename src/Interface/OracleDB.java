package Interface;

import java.sql.SQLOutput;

public class OracleDB implements Database{
    public void connect()
    {
        System.out.println("connecting to oracle");
    }
    public void disconnect()
    {
        System.out.println("disconnecting to oracle");
    }
}
