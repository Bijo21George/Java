package MultipleInheritanceusingInterfaces;


public class SonInheritanceClass implements Father,Mother{
    public void sonheight()
    {
        System.out.println("Son height " +(Father.height+Mother.height)/2);
    }
}
