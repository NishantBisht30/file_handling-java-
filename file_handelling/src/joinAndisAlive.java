

public class joinAndisAlive {
    public static void main(String [] args) throws Exception
    {


//        ob1.start();             // we don't have start in runnable class...but thread have   so how we can use it
//        ob2.start();
// so you can do like this ...... you have to create an object of Thread
        Thread t1 = new Thread(()->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(() ->
        {
              for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("bye");
//        ob1.start();
//        ob2.start();
    }
}
