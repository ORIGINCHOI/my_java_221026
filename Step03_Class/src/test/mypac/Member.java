package test.mypac;

public class Member {
	//이름을 저장할 필드
	public String name;
	//주소를 저장할 필드
	public String addr;
	//번호를 저장할 필드
	public int numb;
	
	//메소드
	public void showInfo() {
		System.out.println("번호:"+this.numb+", 이름:"+this.name+", 주소:"+this.addr);
	}
}
