
class du extends Thread
{
    public void run()
    {
        for(int i = 0;i<5 ; i++) {
            System.out.println("Ticket check");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class qu extends Thread
{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ticket confirmed");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class mutlithreading_practice {
    public static void main(String [] args)
    {
        du d1 = new du();
        qu q1 = new qu();

        d1.setPriority(Thread.MAX_PRIORITY);
        q1.setPriority(Thread.MIN_PRIORITY);
        d1.start();
        q1.start();
    }
}
