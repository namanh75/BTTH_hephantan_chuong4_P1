public class ThreadedWorkerWithoutSync extends Thread{
    private ResourcesExploiter rExp;


    public ThreadedWorkerWithoutSync(ResourcesExploiter resource) {
        rExp=resource;
    }

    public void run(){
        for(int i=0;i<100;i++){
            rExp.exploit();
        }
    }
}
