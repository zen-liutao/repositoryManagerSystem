package com.wudao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wudao.entity.GoodsUnit;
import com.wudao.repository.GoodsUnitRepository;
import com.wudao.service.GoodsUnitService;

/**
 * 商品单位Service实现类
 * @author wudao 小锋 老师
 *
 */
@Service("goodsUnitService")
public class GoodsUnitServiceImpl implements GoodsUnitService{

	@Resource
	private GoodsUnitRepository goodsUnitRepository;
	
	@Override
	public List<GoodsUnit> listAll() {
		return goodsUnitRepository.findAll();
	}

	@Override
	public void save(GoodsUnit goodsUnit) {
		goodsUnitRepository.save(goodsUnit);
	}

	@Override
	public void delete(Integer id) {
		goodsUnitRepository.delete(id);
	}

	@Override
	public GoodsUnit findById(Integer id) {
		return goodsUnitRepository.findOne(id);
	}

}
