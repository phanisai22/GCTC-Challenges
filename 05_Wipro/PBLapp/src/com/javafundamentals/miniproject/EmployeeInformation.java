package com.javafundamentals.miniproject;

public class EmployeeInformation {

	public static void main(String[] empId) {
		String[][] data = { {"Emp No", "Emp Name", "Join Date", "Designation Code", "Department", "Basic", "HRA", "IT"},
							{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
							{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
							{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"}, 
							{"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
							{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
							{"1006", "Suman", "01/01/2000", "e", "Manufacturing", "23000", "9000", "4400"},
							{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}};
		
		String[][] DA = {{"Designation Code", "Designation", "DA"}, 
							{"e", "Engineer", "20000"}, 
							{"c", "Consultant", "32000"},
							{"e", "Clerk", "12000"},
							{"e", "Receptionist", "15000"},
							{"e", "Manager", "40000"}};
		
		
		if (empId.length < 1) {
			System.out.println("No Input.");
			return;
		}
		
		String designation = "None";
		String id = empId[0];
		String dCode = "None";
		int rowLength = 8;
		int rowId = 0;
		int dearnessAllowance = 0;
 		
		for (int i = 0; i < rowLength; i++) {
			if (id.equals(data[i][0])) {
				dCode = data[i][3];
				rowId = i;
			}
		}
		
		if(dCode.equals("None")) {
			System.out.println("There is no employee with empid: "+empId[0]);
			return;
		}
		
//		System.out.println(dCode);
		
		
		switch (dCode) {
		case "e":
			designation = DA[1][1];
			dearnessAllowance = Integer.parseInt(DA[1][2]);
			break;
		case "c":
			designation = DA[2][1];
			dearnessAllowance = Integer.parseInt(DA[2][2]);
			break;
		case "k":
			designation = DA[3][1];
			dearnessAllowance = Integer.parseInt(DA[3][2]);
			break;
		case "r":
			designation = DA[4][1];
			dearnessAllowance = Integer.parseInt(DA[4][2]);
			break;
		case "m":
			designation = DA[5][1];
			dearnessAllowance = Integer.parseInt(DA[5][2]);
			break;
		
		default:
			designation = "Not Found";
			break;
		}
		
		int salary = Integer.parseInt(data[rowId][5]) + Integer.parseInt(data[rowId][6]) + dearnessAllowance - Integer.parseInt(data[rowId][7]);
		
		System.out.format("%15s%15s%15s%15s%15s", data[0][0], data[0][1], data[0][4], DA[0][1], "Salary");
		System.out.println();
		System.out.format("%15s%15s%15s%15s%15s", data[rowId][0], data[rowId][1], data[rowId][4], designation, salary);
		
	}

}
