package section_1_java;

public class Boy implements Player,Study{

    @Override
    public void play() {
        System.out.println("Run with leg");
    }

    @Override
    public void read() {
        System.out.println("hi");
    }
}
