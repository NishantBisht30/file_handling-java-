

public class thread_usingLambdaExpression {
    public static void main(String [] args)
    {
        Runnable ob1 = () ->
        {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hi");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        ;

        Runnable ob2 = () ->
        {

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }

        };

//        ob1.start();             // we don't have start in runnable class...but thread have   so how we can use it
//        ob2.start();
// so you can do like this ...... you have to create an object of Thread
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();

//        ob1.start();
//        ob2.start();
    }
}
