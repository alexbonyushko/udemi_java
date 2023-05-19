package section_1_java;

/**
 * 12.Classes
 */
public class Computer {
    private int memory;
    private int cpu;
    private String name;

    public Computer() {
    }

    public Computer(int memory, int cpu, String name) {
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;
    }

    void isCpu() {
        System.out.println(cpu);
    }

    void isMemory() {
        System.out.println(memory);
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public int getCpu() {
        return cpu;
    }

    public String getName() {
        return name;
    }
}
