package section_1_java;

public class InnerClass {
    public Head head;

    public InnerClass() {
        this.head = new Head();
    }

    void say(){
        System.out.println("My voice "+ head.voice);
    }

    class Head{
        String voice="High";
    }
}
