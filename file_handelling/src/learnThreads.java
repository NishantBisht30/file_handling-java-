class hi extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++) {
            System.out.println("Hi");

            try {
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
class hello extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}


public class learnThreads {
    public static void main(String [] args)
    {
        hi ob1 = new hi();
        hello ob2 = new hello();

        ob1.start();
        ob2.start();

//        ob1.start();
//        ob2.start();
    }
}
