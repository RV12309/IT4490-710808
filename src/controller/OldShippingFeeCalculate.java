package controller;

import java.util.Random;
import java.util.logging.Logger;
import entity.order.Order;

public class OldShippingFeeCalculate implements ShippingFeeCalculator {
	private static Logger LOGGER = utils.Utils.getLogger(PlaceOrderController.class.getName());
    public int calculateShippingFee(Order order) {
	    	 Random rand = new Random();
	         int fees = (int)( ( (rand.nextFloat()*10)/100 ) * order.getAmount() );
	         LOGGER.info("Order Amount: " + order.getAmount() + " -- Shipping Fees: " + fees);
	         return fees;
	     }
	

}
