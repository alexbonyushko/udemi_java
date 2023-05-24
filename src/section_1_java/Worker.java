package section_1_java;

public class Worker {
    String name;
    boolean isAtWork;
    boolean isSober;

    public Worker(String name) {
        this.name = name;
    }

    void atWork() {
        isAtWork = true;
    }

    void sober() {
        isSober = true;
    }

    void work() throws WorkerIsNotReadyException{
        if (isAtWork && isSober){
            System.out.println("You can work");
        }else {
            throw new WorkerIsNotReadyException("Worker is not ready!");
        }
    }
}
