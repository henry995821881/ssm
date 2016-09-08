package com.henry.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.ssm.dao.ItemsMapper;
import com.henry.ssm.dao.ItemsMapperCustom;
import com.henry.ssm.po.Items;
import com.henry.ssm.po.ItemsCustom;
import com.henry.ssm.po.ItemsQueryVo;
import com.henry.ssm.service.ItemsService;

/**
 * @author 作者 E-mail:
 * @date 创建时间：2016年5月25日 下午2:41:56
 * @version 1.0
 * @parameter
 * @since
 * @return
 */

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;

	@Autowired
	private ItemsMapper itemsMapper;

	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {

		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	public ItemsCustom findItemsById(Integer id) throws Exception {

		Items items = itemsMapper.selectByPrimaryKey(id);

		// 各种操作
		// 返回2次处理的对象
		ItemsCustom itemsCustom = new ItemsCustom();

		BeanUtils.copyProperties(items, itemsCustom);

		return itemsCustom;
	}

	public void updateItemsById(Integer id, ItemsCustom itemsCustom) throws Exception {

		// id 的各种校验

		itemsCustom.setId(id);

		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);

	}

}
