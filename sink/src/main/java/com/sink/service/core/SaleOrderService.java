package com.sink.service.core;

public interface SaleOrderService {
    public SaleOrder findSaleOrderById(int id);

    public List<SaleOrder> findAllSaleOrders();
    public List<SaleOrder> findSaleOrdersByCustomer(Customer customer);
    
    public int addSaleOrder(SaleOrder order);
    public void updateSaleOrder(SaleOrder order);

}
