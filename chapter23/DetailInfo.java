package chapter23;

import java.util.Optional;

public class DetailInfo {
	//flatMap메소드
	//중첩된 Optional
	Optional<String> passport;
	
	public DetailInfo(Optional<String> passport) {
		this.passport = passport;
	}

	public Optional<String> getPassport() {
		return passport;
	}

	public void setPassport(Optional<String> passport) {
		this.passport = passport;
	}
	
	public static void main(String[] args) {
		Optional<DetailInfo> di=Optional.of(new DetailInfo(Optional.ofNullable(null)));
		//flatMap - Optional을 리턴하는 내용을 Optional로 감싸지않고 그대로 리턴
		//Map인 경우 중첩된 Optional을 두번 벗겨내야 하지만
		//flatMap의 경우는 한번만 벗기면 된다.
		String passport=di.flatMap(p->p.getPassport())
						  .orElse("It's null");
		System.out.println(passport);
	}
}
