package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem geTbItemById(Long itemId) {
		// TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);
		TbItemExample tItemExample = new TbItemExample();
		Criteria criteria = tItemExample.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = tbItemMapper.selectByExample(tItemExample);
		TbItem tbItem = list.get(0);
		return tbItem;
	}

}
