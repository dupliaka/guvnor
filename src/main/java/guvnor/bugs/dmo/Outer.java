package guvnor.bugs.dmo;

public class Outer {

    private String name;
    private Inner inner;

    public Outer() {
    }

    public Outer(String name, Inner inner) {
        this.name = name;
        this.inner = inner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    public Inner getInner() {
        return inner;
    }

    public static class Inner {

        private String value;

        public Inner() {
        }

        public Inner(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }
}
