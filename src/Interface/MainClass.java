package Interface;

import java.util.Iterator;

public class MainClass {
    public static void main(String args[])
    {
        Database database;
        database=new OracleDB();
        database.connect();
        database.disconnect();
        database=new SybaseDB();
        database.connect();
        database.disconnect();
    }
}
