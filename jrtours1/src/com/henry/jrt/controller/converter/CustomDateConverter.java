package com.henry.jrt.controller.converter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/** 
 * 蜿よ焚扈大ｮ夊ｽｬ謐｢蝎ｨ
* @author  菴懆�� E-mail: 
* @date 蛻帛ｻｺ譌ｶ髣ｴ�ｼ�2016蟷ｴ5譛�27譌･ 荳句壕1:59:46 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class CustomDateConverter implements Converter<String, Date> {

	
	
	@Override
	public Date convert(String arg0) {
		//譌･譛殱tring霓ｬ謐｢謌先律譛溽ｱｻ蝙�
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			//螯よ棡霓ｬ謐｢謌仙粥
			return format.parse(arg0);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//蜿よ焚扈大ｮ壼､ｱ雍･縲りｿ泌屓null
		return null;
	}

}
