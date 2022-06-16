public class Main {
    public static void main(String[] args) {
       /* Thread1 t1 = new Thread1();
        t1.start();*/

        Thread2 t2 = new Thread2();
        Thread thread = new Thread(t2);
        thread.start();

        for (int i=0; i<100;i++){
            System.out.println("MAin thread");
        }
    }
}
