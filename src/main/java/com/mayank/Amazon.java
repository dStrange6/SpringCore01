package com.mayank;

import com.mayank.services.DeliveryService;

public class Amazon {

    static {
        System.out.println("Amazon class loaded");
    }

    public DeliveryService deliveryService;

    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public Amazon(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }
    public Amazon(){
        System.out.println("Object of Amazon class created");
    }

    public void deliverProduct(float amount){
        this.deliveryService.productDelivered(amount);
    }
}
