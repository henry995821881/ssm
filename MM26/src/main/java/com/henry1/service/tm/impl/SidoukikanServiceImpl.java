package com.henry1.service.tm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry1.bean.tm.SidoukikanData;
import com.henry1.dao.tm.SidoukikanDao;
import com.henry1.service.tm.SidoukikanService;

@Service("sidoukikanService")
public class SidoukikanServiceImpl implements SidoukikanService {

	
	@Autowired
	private SidoukikanDao sidoukikanDao;
	
	@Override
	public List<SidoukikanData> getSidoukikanList() {
		
		return sidoukikanDao.getSidoukikanList();
	}

	@Override
	public SidoukikanData getSidoukikanDataById(String skCd) {
		
		return sidoukikanDao.getSidoukikanDataById(skCd);
	}

}
