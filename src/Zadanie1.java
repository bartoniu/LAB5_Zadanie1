class Zadanie1 extends Thread
{
    int counter;
    public Zadanie1(int counter)
    {
        super("" + counter);
        this.counter = counter;
    }

    public void run()
    {
        counter++ ;
        if(counter <= 10)
        {
            Zadanie1 thr = new Zadanie1(counter);
            thr.start();
            try {
                thr.join();
                System.out.println("Hello from task: "+ getName());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main (String args[])
    {
        Zadanie1 th1 = new Zadanie1(0);
        th1.start();
    }

}