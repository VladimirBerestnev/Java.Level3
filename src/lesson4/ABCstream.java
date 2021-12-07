package lesson4;

public class ABCstream {

    final private Object mon = new Object();
    private char firstLetter = 'A';

    public static void main(String[] args) throws InterruptedException {

        ABCstream abCstream = new ABCstream();


        Thread t1 = new Thread(() -> {
            try {
                abCstream.printA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {


                try {
                    abCstream.printB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        });

        Thread t3 = new Thread(() -> {


                    try {
                        abCstream.printC();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


        });

        t1.start();
        t2.start();
        t3.start();


      //  t3.join();

    }

    public void printA() throws InterruptedException {
        synchronized (mon){

            for (int i = 0; i < 5; i++) {
                while (firstLetter != 'A')
                {
                    mon.wait();
                }
                System.out.println("A");
                firstLetter = 'B';
                mon.notifyAll();
            }
        }
    }

    public void printB() throws InterruptedException {
        synchronized (mon){

            for (int i = 0; i < 5; i++) {
                while (firstLetter != 'B')
                {
                    mon.wait();
                }
                System.out.println("B");
                firstLetter = 'C';
                mon.notifyAll();
            }
        }
    }

    public void printC() throws InterruptedException {
        synchronized (mon){
            for (int i = 0; i < 5; i++) {
                while (firstLetter != 'C')
                {
                    mon.wait();
                }
                System.out.println("C");
                firstLetter = 'A';
                mon.notifyAll();
            }
        }
    }
}
