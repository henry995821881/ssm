package com.henry.ssm.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.ssm.dao.DaiDhpTaisyosyaDao;
import com.henry.ssm.po.DaiDhpTaisyosya;
import com.henry.ssm.service.DtService;


@Service("dtService")
public class DtServiceImpl implements DtService {

	@Autowired
	private DaiDhpTaisyosyaDao  daiDhpTaisyosyaDao;

	public List<DaiDhpTaisyosya> getDhpTaisyosyaList() {

		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("sex", "1");
		data.put("dhpArrayCd", new String[] { "0", "A", "B", "E" });
		List<DaiDhpTaisyosya> dhpTaisyosyaList = daiDhpTaisyosyaDao.getDhpTaisyosyaList(data);

		return dhpTaisyosyaList;

	}

}
