
public class Capsule {

	public static void main(String[] args) {
		
		Person taro = new Person("山田太郎", 20);
		System.out.println(taro.getName());
		
		taro.setName("田中花子");
		System.out.println(taro.getName());
		
		//演習5
		System.out.println(taro.getAge());
		
		taro.setAge(30);
		System.out.println(taro.getAge());
	}

}
