package ir.hri.bl;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Icomponent {
    private List<Icomponent> children = new ArrayList<Icomponent>();
    private String name;

    public Composite(String sname) {
        this.name = sname;
    }

    public void add(Icomponent component) {
        children.add(component);
    }

    public void remove(Icomponent component) {
        children.remove(component);
    }

    public void display(int depth) {
        String repeated = new String(new char[depth]).replace("\0", "-");
        System.out.println(repeated + name);

        for (Icomponent child : children) {
            child.display(depth + 2);
        }
    }
}