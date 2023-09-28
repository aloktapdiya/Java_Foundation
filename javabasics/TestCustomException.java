package javabasics;

// class representing the custom exception
class UserException extends Exception
{

}

// class that uses custom exception UserException
public class TestCustomException
{
    // main method
    public static void main(String args[])
    {
        try
        {
            // throw an object of the user-defined exception
            throw new UserException();
        }
        catch (UserException M)
        {
            System.out.println("Caught the exception");
            System.out.println(M.getMessage());
        }
    }
}
