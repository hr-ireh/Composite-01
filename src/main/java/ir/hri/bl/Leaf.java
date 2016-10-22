package ir.hri.bl;

public class Leaf implements Icomponent {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void display(int depth) {
        String repeated = new String(new char[depth]).replace("\0", "-");
        System.out.println(repeated + name);
    }
}
