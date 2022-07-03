public class exceptionHandelling {

    public static void main(String args[])
    {
        int x,y,z;
        int arr[] = new int[4];
        x = 8;
        y = 2;
        int divide=0 ;
        try{
            divide = x / y; // this is a crirical statement
            for(int c = 0;c<=4;c++)
                arr[c] += c;
            for(int i=0;i<=4;i++)
                System.out.println(arr[i]);
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
        System.out.println(divide);
    }

}
