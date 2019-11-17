package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.bean.Medicine;

public class MedicineTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("medicineConfig.xml");
		Medicine medicine = context.getBean("medicine" , Medicine.class);
		System.out.println("Medicine name is : " + medicine.getName());
		System.out.println("Medicine price is: "+medicine.getPrice());
		System.out.println("Medicine type is: "+ medicine.getType());
	//System.out.println("Medicine Drugs are: "+ medicine.getDrugs());	  //for list
		System.out.println("\"Medicine Drugs are: "+ medicine.getDrugsSet()); //for set
	}//End of main()

}//End of class
