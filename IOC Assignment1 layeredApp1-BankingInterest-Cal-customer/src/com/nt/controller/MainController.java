package com.nt.controller;

import com.nt.dto.AccHolderDTO;
import com.nt.service.AccHolderService;
import com.nt.vo.AccHolderVO;


public final class MainController {
	
     private AccHolderService service;

	public MainController(AccHolderService service) {
		this.service = service;
	}
	
	public String processAccHolder(AccHolderVO vo)throws Exception{
		AccHolderDTO dto=null;
		String result=null;
		//Convert VO class obj data to DTO class object
		dto=new AccHolderDTO();
		dto.setAccNo(Long.parseLong(vo.getAccNo()));
		dto.setAccHolderName(vo.getAccHolderName());
		dto.setAccHolderAdd(vo.getAccHolderAdd());
		dto.setPrincipalAmt(Double.parseDouble(vo.getPrincipalAmt()));
		dto.setTime(Integer.parseInt(vo.getTime()));
		dto.setRateOfInterest(Integer.parseInt(vo.getRateOfInterest()));
		
		//use Service class object
				result=service.generateResult(dto);
				return result;

	}
}
