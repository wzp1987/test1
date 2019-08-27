package com.tudu.sp01.service;

import java.util.List;

import com.tudu.sp01.pojo.Item;

public interface ItemService {
	
	/**
	 * 通过订单id获取
	 */
	List<Item> getItems(String orderId);
	
	
	void decreaseNumbers(List<Item> list);
	
	
}
