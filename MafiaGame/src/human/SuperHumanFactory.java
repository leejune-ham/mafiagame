package human;

public class SuperHumanFactory extends HumanFactory {
	@Override
	Human createHuman(String job) {
		Human human = null;
		try {
			Class<?> cls = Class.forName(job);
			Object obj = cls.newInstance();
			human = (Human)obj; 
		}catch(Exception e) {
		 return null;
		}
		return human;	 
	}	
}
