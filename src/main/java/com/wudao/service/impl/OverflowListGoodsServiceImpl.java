package com.wudao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wudao.entity.OverflowListGoods;
import com.wudao.repository.OverflowListGoodsRepository;
import com.wudao.service.OverflowListGoodsService;

/**
 * 报溢单商品Service实现类
 * @author java1234_小锋老师
 *
 */
@Service("overflowListGoodsService")
public class OverflowListGoodsServiceImpl implements OverflowListGoodsService{

	@Resource
	private OverflowListGoodsRepository overflowListGoodsRepository;

	@Override
	public List<OverflowListGoods> listByOverflowListId(Integer overflowListId) {
		return overflowListGoodsRepository.listByOverflowListId(overflowListId);
	}

	

}
