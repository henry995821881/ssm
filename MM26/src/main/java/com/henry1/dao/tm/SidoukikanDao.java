package com.henry1.dao.tm;

import java.util.List;

import com.henry1.bean.tm.SidoukikanData;

public interface SidoukikanDao {

	
	
        List<SidoukikanData>	getSidoukikanList();

		SidoukikanData getSidoukikanDataById(String skCd);
}
