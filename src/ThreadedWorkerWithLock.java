public class ThreadedWorkerWithLock extends Thread{
    private ResourcesExploiter rExp;


    public ThreadedWorkerWithLock(ResourcesExploiter resource) {
        rExp=resource;
    }

    public void run(){
        for(int i=0;i<100;i++){
            rExp.exploit();
        }
    }
}
