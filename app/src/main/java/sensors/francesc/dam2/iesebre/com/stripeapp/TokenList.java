package sensors.francesc.dam2.iesebre.com.stripeapp;

/**
 * Created by francesc on 06/02/16.
 */
import com.stripe.android.model.Token;

public interface TokenList {
    public void addToList(Token token);
}