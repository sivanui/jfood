package ivan.jfood;
/**
 * This is a description of the class CashInvoice.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/20
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CashInvoice extends Invoice {
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASH;
    int deliveryFee;

    /**
     * Constructor for objects of class CashInvoice
     * @param id id
     * @param customer customer
     * @param foods foods
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer) {
        // initialise instance variables
        super(id, foods, customer);
    }

    /**
     * Constructor for objects of class CashInvoice
     * @param id id
     * @param customer customer
     * @param foods foods
     * @param deliveryFee delivery fee
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee) {
        // initialise instance variables
        super(id, foods, customer);
        this.deliveryFee = deliveryFee;
    }
    /**
     * Get payment type
     * @return PAYMENT_TYPE
     */
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     * Get delivery fee
     * @return deliveryFee
     */
    public int getDeliveryFee() {
        return deliveryFee;
    }

    /**
     * Set delivery fee
     * @param deliveryFee delivery fee
     */
    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    /**
     * Set total price
     */
    public void setTotalPrice() {
        super.totalPrice = 0;
        for (Food foodList : getFoods()) {
            super.totalPrice = super.totalPrice + foodList.getPrice();
        }
        super.totalPrice = super.totalPrice + deliveryFee;
    }

    /**
     * Method toString
     */
    public String toString() {
        StringBuilder foodName = new StringBuilder();
        for (Food food : getFoods()) {
            foodName.append(food.getName()).append(", ");
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDateTime now = LocalDateTime.now();
        if (getDeliveryFee() != 0) {
            return "================Invoice================" + "\n" +
                    "ID          : " + getId() + "\n" +
                    "Name        : " + foodName + "\n" +
                    "Date        : " + LocalDateTime.now() + "\n" +
                    "Customer    : " + getCustomer().getName() + "\n" +
                    "Total Price : " + totalPrice + "\n" +
                    "Status      : " + getInvoiceStatus() + "\n" +
                    "Payment Type: " + getPaymentType() + "\n" +
                    "Delivery Fee: " + getDeliveryFee();
        } else {
            return "================Invoice================" + "\n" +
                    "ID          : " + getId() + "\n" +
                    "Name        : " + foodName + "\n" +
                    "Date        : " + LocalDateTime.now() + "\n" +
                    "Customer    : " + getCustomer().getName() + "\n" +
                    "Total Price : " + totalPrice + "\n" +
                    "Status      : " + getInvoiceStatus() + "\n" +
                    "Payment Type: " + getPaymentType();
        }
    }
}