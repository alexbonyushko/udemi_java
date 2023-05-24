package section_1_java;

/**
 * 15.Overload
 */
public class Main {
    public static void main(String[] args) {
        Computer apple = new Computer(1000, 1500, "MacBook");
        //apple.isMemory();

        Cow burenka = new Cow("Muuu", 28);
        burenka.mu();

        Boy ivan = new Boy();
        Girl ira = new Girl();
        Player unit = ivan;

        InnerClass sony = new InnerClass();
        sony.say();

        Worker worker=new Worker("John");
        worker.atWork();

        try {
            worker.work();
        } catch (WorkerIsNotReadyException e) {
            throw new RuntimeException(e);
        }
    }
}