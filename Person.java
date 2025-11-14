public class Person
{
    private String firstName; 
    private String lastName; 
    private int age; 
    private int ssn;

    public Person(String ifirstName, String ilastName, int iage, int issn)
    {
        firstName = ifirstName;
        lastName = ilastName;
        age = iage;
        ssn = issn;
    }

    public String toString()
    {
        return "SSN: " + ssn + "\n\tName: " + firstName + " " + lastName + "\n\tAge: " + age;
    }


}
