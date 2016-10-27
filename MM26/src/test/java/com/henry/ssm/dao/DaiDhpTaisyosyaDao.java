package com.henry.ssm.dao;

import java.util.List;
import java.util.Map;

import com.henry.ssm.po.DaiDhpTaisyosya;
import com.henry.ssm.po.DaiKsyokaiRireki;

public interface DaiDhpTaisyosyaDao {

	List<DaiDhpTaisyosya> getDhpTaisyosyaList(Map data);

	DaiDhpTaisyosya getDhpNote(Map data);

	List<DaiKsyokaiRireki> getKsyokaiRireki(Map data);

	void updateDhpTaisyosya(Map data);

	void insertDhpTaisyosyaRireki(Map data);

	List<DaiDhpTaisyosya> getCsvData(Map data);

	List<DaiDhpTaisyosya> getCsvRireData(Map data);
}
