package Exception_handling;

public class throwAndThrows {
	static void method() throws ArithmeticException  
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing ArithmeticException");  

    }  
    //main method  
    public static void main(String args[])  
    {  
        try  
        {  
            method();
            System.out.println("try completed");
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println("caught in main() method");  
        }  
    }  
}
