package dao.member.test;

import java.util.List;

import dao.member.Member;
import dao.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		
		int rowCount=memberDao.delete("aaaa");
		System.out.println("0.delete   -->"+rowCount);
				
		Member newMember=new Member("eeee","eeee","박용용","서울시 강동구",27,"F",null);
		rowCount=memberDao.insert(newMember);
		System.out.println("1.insert   --> "+rowCount);
				
		Member updateMember = new Member("cccc", "cccc", "가나다", "강릉시 교동", 33, "F", null);
		rowCount=memberDao.update(updateMember);
		System.out.println("2.update   --> "+rowCount);
		
		Member findMember=memberDao.findByPrimaryKey("bbbb");
		if(findMember!=null) {
			System.out.println("3.selectById-> "+findMember);
		}else {
			System.out.println(">> 조건에 만족하는 멤버 없음");
		}
		
		List<Member> memberList=memberDao.findAll();
		System.out.println("4.selectAll--> "+memberList);
		
	}

}
