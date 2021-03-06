package ivan.jfood;

/**
 * class PriceCalculator
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class PriceCalculator implements Runnable {
    private Thread t;
    private Invoice invoice;

    /**
     * Constructor for objects of class PriceCalculator
     * @param invoice food category
     */
    public PriceCalculator(Invoice invoice) {
        this.invoice = invoice;
    }

    public void run()
    {
        try
        {
            System.out.println("Calculating Invoice ID: " + invoice.getId());
            invoice.setTotalPrice();
            System.out.println("Finish calculating Invoice ID: " + invoice.getId());
            Thread.sleep(50);
        } catch (InterruptedException e)
        {
            System.out.println("Thread Invoice " +  invoice.getId() + " interrupted.");
        }
    }
    public void start ()
    {
        if (t == null)
        {
            t = new Thread (this);
            t.start ();
        }
    }
}