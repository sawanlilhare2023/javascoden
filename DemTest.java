
class Mythread implements Runnable{
    public void run(){
        for(int i = 0;i<5;i++){

            System.out.println("Child thread");
        }
    }
}
public class DemTest {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        Thread t = new Thread(mt);
        t.start();
        for(int i = 0;i<5;i++){

            //System.out.println("main thread");
            System.out.println("main thread2");

        }
    }
}
