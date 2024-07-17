package chapter09;

	public class Person {
		private String name; //변수에 직접 접근을 막기 위함
		private int age;
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			//나이를 음수로 입력할 때 막아주는 코드-제약사항체크
			if(age<0) {
				System.out.println("나이는 음수로 입력할 수 없습니다.");
				return;
			}
			this.age = age;
			
		}


		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
}
