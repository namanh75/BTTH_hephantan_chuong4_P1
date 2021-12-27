import java.lang.String;
public class run {
    public static void main(String[] args) throws InterruptedException {
        ResourcesExploiter resource = new ResourcesExploiter(0);

//Async
//        ThreadedWorkerWithoutSync worker1 = new ThreadedWorkerWithoutSync(resource);
//        ThreadedWorkerWithoutSync worker2 = new ThreadedWorkerWithoutSync(resource);
//        ThreadedWorkerWithoutSync worker3 = new ThreadedWorkerWithoutSync(resource);

// Sync
//        ThreadedWorkerWithoutSync worker1 = new ThreadedWorkerWithoutSync(resource);
//        ThreadedWorkerWithoutSync worker2 = new ThreadedWorkerWithoutSync(resource);
//        ThreadedWorkerWithoutSync worker3 = new ThreadedWorkerWithoutSync(resource);

// Lock
        ThreadedWorkerWithLock worker1 = new ThreadedWorkerWithLock(resource);
        ThreadedWorkerWithLock worker2 = new ThreadedWorkerWithLock(resource);
        ThreadedWorkerWithLock worker3 = new ThreadedWorkerWithLock(resource);


        worker1.start();worker1.join();
        worker2.start();worker2.join();
        worker3.start();worker3.join();
        System.out.println(resource.getRsc());
    }
}
