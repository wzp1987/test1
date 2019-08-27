package com.tudu.sp01.service;

import com.tudu.sp01.pojo.Order;

public interface OrderService {

	/**
	 * 获取订单数据
	 * @param orderId
	 * @return
	 */
	Order getOrder(String orderId);
	
	/**
	 * 保存订单
	 * @param order
	 */	
	void addOrder(Order order);
	
}
