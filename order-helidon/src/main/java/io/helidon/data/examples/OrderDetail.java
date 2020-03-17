package io.helidon.data.examples;

import javax.json.bind.annotation.JsonbProperty;

public class OrderDetail {

    @JsonbProperty("orderId")
    private int orderId = -1;
    @JsonbProperty(nillable = true)
    private String suggestiveSaleItem = "";
    @JsonbProperty(nillable = true)
    private String suggestiveSale = "";
    @JsonbProperty
    private String inventoryLocationItem = "";
    @JsonbProperty
    private String inventoryLocation = "none";
    @JsonbProperty
    private String shippingEstimate = "none";
    @JsonbProperty
    private String shippingEstimateItem = "";
    @JsonbProperty
    private String orderStatus = "none";
    @JsonbProperty
    private String deliveryLocation = "none";


    public String toString() {
        String returnString = "";
        returnString+=" orderId =" + orderId;
        returnString+=" suggestiveSaleItem = " + suggestiveSaleItem;
        returnString+=" suggestiveSale = " + suggestiveSale;
        returnString+=" inventoryLocationItem = " + inventoryLocationItem;
        returnString+=" inventoryLocation = " + inventoryLocation;
        returnString+=" shippingEstimate = " + shippingEstimate;
        returnString+=" shippingEstimateItem = " + shippingEstimateItem;
        returnString+=" orderStatus = " + orderStatus;
        returnString+=" deliveryLocation = " + deliveryLocation;
        return returnString;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getSuggestiveSaleItem() {
        return suggestiveSaleItem;
    }

    public void setSuggestiveSaleItem(String suggestiveSaleItem) {
        this.suggestiveSaleItem = suggestiveSaleItem;
    }

    public String getSuggestiveSale() {
        return suggestiveSale;
    }

    public void setSuggestiveSale(String suggestiveSale) {
        this.suggestiveSale = suggestiveSale;
    }

    public String getInventoryLocationItem() {
        return inventoryLocationItem;
    }

    public void setInventoryLocationItem(String inventoryLocationItem) {
        this.inventoryLocationItem = inventoryLocationItem;
    }

    public String getInventoryLocation() {
        return inventoryLocation;
    }

    public void setInventoryLocation(String inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public String getShippingEstimate() {
        return shippingEstimate;
    }

    public void setShippingEstimate(String shippingEstimate) {
        this.shippingEstimate = shippingEstimate;
    }

    public String getShippingEstimateItem() {
        return shippingEstimateItem;
    }

    public void setShippingEstimateItem(String shippingEstimateItem) {
        this.shippingEstimateItem = shippingEstimateItem;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setDeliveryLocation(String deliverylocation) {
        this.deliveryLocation = deliverylocation;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

}
