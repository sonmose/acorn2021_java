package test.emp;

import test.emp.EmpDto;

public class MainClass10 {
	public static void maain(String[] args) {
		EmpDto dto=new EmpDto();
		dto.setEmpno(7839);
		dto.setEname("KING");
		dto.setJob("PRESIDENT");
		dto.setSal(5000);
		
		EmpDto dto2=new EmpDto(7839, "KING", "PRESIDENT",5000);
	}

}
