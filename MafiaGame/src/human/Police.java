package human;

public class Police extends CItizen {
	int life;
	
	@Override
	void vote() {
		super.vote();
	}
	
	@Override
	public void Skill(Object name) {
		if(name instanceof Mafia) {
			System.out.println("마피아입니다.");
		}else System.out.println("선량한 시민입니다.");
	}
}
