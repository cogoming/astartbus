package com.taotao.service;

import com.taotao.pojo.TbItem;

/**
 * 商品管理Service
 * <p>Title: TbItem</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2017年11月15日下午10:25:20
 * @version 1.0
 */
public interface ItemService {
	TbItem getItemById(long itemId);
}
