package com.henry.ssm.controller.converter;

import org.springframework.core.convert.converter.Converter;

public class CustomFloatConverter implements Converter<String,Float> {

	@Override
	public Float convert(String source) {
		
		
	return	Float.valueOf(source);
		
	}
	

}
