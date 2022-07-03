class we implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Task1 ");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}

class why implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Task2 ");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}

public class threadRunnablePrctice {
    public static void main(String [] args) throws Exception
    {
        we w1 = new we();
        why wh1 = new why();

        // as runnable class does not have start function ... therefore we will make thread
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(wh1);

        t1.start();
        t2.start();
        try{Thread.sleep(500);}catch(Exception e){}

        t1.join();
        t2.join();

        System.out.println("Bye!!");
    }
}
