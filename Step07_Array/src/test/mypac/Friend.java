package test.mypac;

public class Friend {
	
	private int number;
		
	private String name;
			
	private String phone;
		
	private String gender;
			
	//디폴트 생성자 		
	public Friend() {}
	//마우스 우클릭 source		
	public Friend(int number,String name, String phone, String gender) {
		super();
		this.number=number;
		this.name=name;
		this.phone=phone;
		this.gender=gender;
		}
		public int getnumber() {
		return number;
		}

		public void setnumber(int number) {
		this.number = number;
		}

		public String getname() {
		return name;
		}

		public void setname(String name) {
		this.name = name;
		}

		public String getphone() {
		return phone;
	    }

		public void setphone(String phone) {
			this.phone = phone;
			}

		public String getgender() {
			return gender;
			}

		public void setgender(String gender) {
			this.gender = gender;
			}
}


