package com.nt.Test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.AccHolderVO;


public class BankService {

	public static void main(String[] args) {
		BeanFactory factory=null;
		MainController controller=null;
		String result=null;
		AccHolderVO vo=null;
		Scanner sc=null;
		String accNo=null;;
		String accHolderName=null;
		String accHolderAdd=null;
		String principalAmt=null;
		String time=null;
		String rateOfInterest=null;
		//read input
		sc=new Scanner(System.in);
		System.out.println("Enter Customer AccNo::");
		accNo=sc.next();
		System.out.println("Enter Customer name::");
		accHolderName=sc.next();
		System.out.println("Enter Customer Address::");
		accHolderAdd=sc.next();
		System.out.println("Enter Customer Pricipal Amount::");
		principalAmt=sc.next();
		System.out.println("Enter time::");
		time=sc.next();
		System.out.println("enter rateOfInterest");
		rateOfInterest=sc.next();
		
		//create StudentVO class object
				vo=new AccHolderVO();
				vo.setAccNo(accNo);
				vo.setAccHolderName(accHolderName);
				vo.setAccHolderAdd(accHolderAdd);
				vo.setPrincipalAmt(principalAmt);
				vo.setTime(time);
				vo.setRateOfInterest(rateOfInterest);
				
				//create IOC container
				factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
				//get Bean Controller class object
				controller=factory.getBean("controller",MainController.class);
				try {
					result=controller.processAccHolder(vo);
					System.out.println(result);
				}
				catch(Exception e) {
					System.out.println("Internal Problem ----> try again..");
					e.printStackTrace();
				}
	}
}
