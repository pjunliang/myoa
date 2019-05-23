package com.yueqian.service;


import com.yueqian.pojo.BaoxiaoBill;

import java.util.List;

public interface BaoxiaoService {

	public List<BaoxiaoBill> findBaoxiaoBillListByUser(Long userid);
	
	public void saveBaoxiao(BaoxiaoBill baoxiaoBill); 
	
	public BaoxiaoBill findBaoxiaoBillById(Long id);
	
	public void deleteBaoxiaoBillById(Long id);

	public List<BaoxiaoBill> findLeaveBillListByUser(Long id);
}
