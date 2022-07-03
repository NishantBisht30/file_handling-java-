public class exeption_handelling_01
{

    public static void main(String args[])
    {
        int x,y,z;

        x = 8;
        y = 0;
        int divide=0 ;
        try{
            divide = x / y; // this is a crirical statement
            System.out.println(divide);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero "+e);
            // you can print this also--> System.out.println("Cannot divide by zero");

        }
        catch(ArrayIndexOutOfBoundsException ie)
        {
            System.out.println("out of  bounds "+ie);
        }

        // and if you don't know the type of exception then you can simply use Exception
        // and this exception will be written in last becuz if we'll write this first then in x/y if y =0 ..then
        // it will see this exception first ..then wht will be the use of arithmetic exception
        catch(Exception e)
        {
            System.out.println("Unknown Exception.."+e);
        }

        // if we want ki koi ek cheez print ho chahe error aaye ya naa aye to ham use
        // aise likhte ha--> finally block ka istemaal krke

        finally
        {
            System.out.println("Bye..");
        }
    }

}


