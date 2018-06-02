//package frompythontojava.onlineshop.part2;

public abstract class AbstractProcess {

    public void process(Orderable item) {
        System.out.println("Starting new process.");
        action(item);
        stepAfter();
        System.out.println("End of this process.");
    }

    protected abstract void action(Orderable item);

}