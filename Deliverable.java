public interface Deliverable<T> {

    public String determineBoxSize(T item);
    public void deliver(T item, Customer customer);

}
