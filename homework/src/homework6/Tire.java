package homework6;

public class Tire<T> {
    private Object[] catalog = new Object[0];

    public Tire(int startCapasiti) {
        catalog = new Object[startCapasiti];
    }

    public void setCatalogValue(int position, T value) {
        if (position >= catalog.length || position < 0) {
            throw new IllegalArgumentException();
        }
        catalog[position] = value;
    }

    protected Object[] getCatalog() {
        return catalog;
    }

    protected void first() {
        System.out.println(catalog[0]);
    }

    protected void last() {
        System.out.println(catalog[catalog.length - 1]);
    }

    protected void swap(int replaceable, int changing) {
        if (replaceable < 0 || replaceable >= catalog.length & changing < 0 || changing >= catalog.length) {
            throw new IllegalArgumentException();
        }
        Object var = catalog[replaceable];
        catalog[replaceable] = catalog[changing];
        catalog[changing] = (String) var;
    }

    protected void replaceFirst(String newFirstParametr) {
        catalog[0] = newFirstParametr;
    }

    protected void replaceLast(String newLastParametr) {
        catalog[catalog.length - 1] = newLastParametr;
    }

}
