package com.nt.service;

import com.nt.bo.AccHolderBO;
import com.nt.dao.AccHolderDAO;
import com.nt.dto.AccHolderDTO;
public final class AccHolderServiceImpl implements AccHolderService{
	private AccHolderDAO dao;
   public AccHolderServiceImpl(AccHolderDAO dao) {
		
		this.dao = dao;
	}

   @Override
	public String generateResult(AccHolderDTO dto)throws Exception {
	   double principalAmt=0;
	   double simpleInt=0;
	   double compoundInt=0;
	   double amt=0;
	   double time=0;
	   double rateOfInterest=0;
	   AccHolderBO bo=null;
	   //String result=null;
	   //write b.logic
	   principalAmt=dto.getPrincipalAmt();
	   time=dto.getTime();
	   rateOfInterest=dto.getRateOfInterest();
	   simpleInt=(principalAmt*time*rateOfInterest)/100;
	   
	   amt=principalAmt * Math.pow((1 + rateOfInterest/100),time);
	   compoundInt=amt-principalAmt;
		/*
		 * //amt=principalAmt*(1+rateOfInterest/100)*(1+rateOfInterest/100)*(1+
		 * rateOfInterest/100); //amt=principalAmt * Math.pow((1 +
		 * rateOfInterest/100),time); // compoundInt=principalAmt-amt;
		 */	 
	   
	   //Prepare BO class obj having  persistable data
	 		bo=new AccHolderBO();
	 		bo.setAccno(dto.getAccNo());
	 		bo.setAccHolderName(dto.getAccHolderName());
			bo.setcAdd(dto.getAccHolderAdd());
	 		bo.setPrincipalAmt(dto.getPrincipalAmt());
	 		bo.setSimpleInt(simpleInt);
	 		bo.setCompoundInt(compoundInt);
	 		//use DAO
	 		int count=dao.insert(bo);
	 		//process the reuslt
	 		if(count==0)
	 			return "Account holder details not submitted";
	 		else 
	 			return "Account holder details submitted";
	 		
	   
   }//main
   
}//class
