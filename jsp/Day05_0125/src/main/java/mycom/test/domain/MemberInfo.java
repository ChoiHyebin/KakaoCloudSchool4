package mycom.test.domain;

public class MemberInfo {

	private String memberid;
	private String password;
	private String name;
	private String email;
	
	public MemberInfo() {
		
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		//정규표현식으로 유효성검사
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberInfo [memberid=" + memberid + ", password=" + password + ", name=" + name + ", email=" + email
				+ "]";
	}

};