package section_1_java;

public abstract class Human {
    public Human() {
    }

    public Human(int q) {
        System.out.println(q);
    }

    public Human(String q) {
        System.out.println(q);
    }
    public abstract void func();
}
