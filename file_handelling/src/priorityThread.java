

public class priorityThread {
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
        // priority ranges from 1-10 .....1 means least and 10 means highest priority   ....by defult they both have
        // same priority
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

//        t1.setPriority(1);
        t1.setPriority(Thread.MIN_PRIORITY);  // you can do like this also
//        t2.setPriority(10);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("bye");
//        ob1.start();
//        ob2.start();
    }
}
