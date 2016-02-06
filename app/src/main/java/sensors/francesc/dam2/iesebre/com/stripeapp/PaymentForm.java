package sensors.francesc.dam2.iesebre.com.stripeapp;

/**
 * Created by francesc on 06/02/16.
 */
public interface PaymentForm {
    public String getCardNumber();
    public String getCvc();
    public Integer getExpMonth();
    public Integer getExpYear();
    public String getCurrency();
}