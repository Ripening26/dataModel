package kr.or.ksmart.model.vo;

public class User {
	private String userId;
	private String userPw;
	private String userName;
	private String userAddr;
	private String userPhone;
	private String branchNo;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
	@Override
	public String toString() {
		return "user [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAddr=" + userAddr
				+ ", userPhone=" + userPhone + ", branchNo=" + branchNo + "]";
	}
	
	
}
