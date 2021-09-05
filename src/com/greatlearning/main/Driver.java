package com.greatlearning.main;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.TechDepartment;

public class Driver {
	
	public static void main(String[] args) {
		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();
		AdminDepartment adminDept = new AdminDepartment();
		
		System.out.println(adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		System.out.println('\n');
		
		System.out.println(hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		System.out.println('\n');
		
		System.out.println(techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
		
	}

}
