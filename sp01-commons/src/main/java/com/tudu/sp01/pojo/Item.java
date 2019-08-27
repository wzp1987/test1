package com.tudu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	private Integer id;		//商品id
	private String name;
	private Integer number; //商品库存
	
}
