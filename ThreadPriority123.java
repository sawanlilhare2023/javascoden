
class Mthread extends Thread{
    public void run(){

        System.out.println("Child thread");
    }
}

public class ThreadPriority123 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());
        MThread mt = new MThread();
        System.out.println("the priority of Mthread thread is:" +mt.getPriority());
        mt.setPriority(4);
        System.out.println(mt.getPriority());
    }


}
