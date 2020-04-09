/**
 * Write a description of class CashInvoice here.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 2/4/20
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASH;
    int deliveryFee;
    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        // initialise instance variables
        super(id, foods, customer);
    }

    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee)
    {
        // initialise instance variables
        super(id, foods, customer);
        this.deliveryFee = deliveryFee;
    }

    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee = deliveryFee;
    }
    public void setTotalPrice() {
        super.totalPrice=0;
        for(Food foodList : getFoods())
        {
            super.totalPrice=super.totalPrice+foodList.getPrice();
        }
        super.totalPrice=super.totalPrice+deliveryFee;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        String foods = "";
        for(Food foodList : getFoods())
        {
            foods = foods + foodList.getName() + ", ";
        }
        foods = foods.substring(0, foods.length() - 2);

        return "============INVOICE CASH============"+
                "\nID :" + super.getId()+
                "\nFoods :"  + foods+
                "\nDate :" + sdf.format(super.getDate().getTime())+
                "\nCustomer :" + super.getCustomer().getName()+
                "\nDelivery Fee :" + getDeliveryFee()+
                "\nTotal price :" + totalPrice+
                "\nStatus :" + super.getInvoiceStatus()+
                "\nPayment Type :" + getPaymentType();
    }
}