
public class Logical {

	public static void main(String[] args) {
		boolean flag;
		flag = 10 > 5;
		System.out.println(flag);

		long age = 30;
		flag = age == 30;
		
		flag = age <= 40;
		flag = age != 30;
		
		flag = (age < 35) && (age > 20);

		flag = (age < 30) || (age > 20);
	}

}
