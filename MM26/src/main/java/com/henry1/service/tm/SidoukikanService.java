package com.henry1.service.tm;

import java.util.List;

import com.henry1.bean.tm.SidoukikanData;

public interface SidoukikanService {
	List<SidoukikanData>	getSidoukikanList();

	SidoukikanData getSidoukikanDataById(String skCd);
}
