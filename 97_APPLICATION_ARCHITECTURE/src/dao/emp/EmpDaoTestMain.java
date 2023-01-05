package dao.emp;

import java.util.List;
import java.util.Map;

public class EmpDaoTestMain {

	public static void main(String[] args) throws Exception{
		EmpDao empDao = new EmpDao();
		System.out.println("------findByPrimarKeywithDept-----");
		Map rowMap = empDao.findByPrimarKeywithDept(7369);
		System.out.println(rowMap);
		System.out.println(rowMap.get("EMPNO")+"\t"+
						   rowMap.get("ENAME")+"\t"+
						   rowMap.get("JOB")+"\t"+
						   rowMap.get("DNAME")+"\t"+
						   rowMap.get("LOC")+"\t");
		System.out.println("------findAllwithDept-----");
		List<Map> rowMapList = empDao.findAllwithDept();
		for (Map tempRowMap : rowMapList) {
			System.out.println(tempRowMap.get("EMPNO")+"\t"+
								tempRowMap.get("ENAME")+"\t"+
								tempRowMap.get("JOB")+"\t"+
								tempRowMap.get("DNAME")+"\t"+
								tempRowMap.get("LOC")+"\t");
		}
	}

}
