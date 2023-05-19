package section_1_java;

import section_1_java.Animal;
/**
 * 13.Inheritance
 */
public class Cow extends Animal {
    public Cow(String say, int teeth) {
        setSay(say);
        setTeeth(teeth);
    }

    public String getSay() {
        String say = super.getSay();
        return say + " New ! ";
    }

    void mu() {
        System.out.println(getSay() + " with all " + getTeeth() + " of teeth");
    }
}
