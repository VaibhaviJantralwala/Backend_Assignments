package MultiThreading;

public class usingThreadClass extends Thread{

    public void run(){
        for(int i=0 ; i<5 ; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+" >"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        
        usingThreadClass th1 = new usingThreadClass();
        th1.setName("Thread - 1");
        th1.start();

        usingThreadClass th2 = new usingThreadClass();
        th2.setName("Thread - 2");
        th2.start();
        

    }
}
