package javabasics;

class checkVote  extends Exception
{
    public checkVote (String eM)
    {
        // calling the constructor of the parent Exception
        super(eM);
    }
}

// Class to test the custom exception
public class TestAge
{

    // function to check the age limit
    static void verify (int age) throws checkVote{
        if(age < 18){

            // throw an object of user-defined exception
            throw new checkVote("Age is less than 18, sorry can't vote.");
        }
        else {
            System.out.println("You're eligible to vote.");
        }
    }

    // main method
    public static void main(String args[])
    {
        try
        {
            // calling the function
            verify(15);
        }
        catch (checkVote M)
        {
            System.out.println("Caught the exception");

            // printing the message from the checkVote object
            System.out.println("An Exception occurred: " + M.getMessage());
        }
    }
}
