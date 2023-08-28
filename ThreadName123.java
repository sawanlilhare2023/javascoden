
class MThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());

        /*for(int i=0;i<2;i++){
            System.out.println("chls thread");*/
        }
    }

public class ThreadName123 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MThread m = new MThread();
        m.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(m.getName());
        m.setName("New Thread");
        System.out.println(m.getName());
        System.out.println("main thread");
    }
}
