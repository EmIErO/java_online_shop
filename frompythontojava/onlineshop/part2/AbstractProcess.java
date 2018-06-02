//package frompythontojava.onlineshop.part2;

public abstract class AbstractProcess {

    public void process(Orderable item) {
        //stepBefore();
        action(item);
        //stepAfter();
    }

    //public void stepBefore(Orderable item) {}

    protected abstract void action(Orderable item);

    //public void stepAfter() {}
}