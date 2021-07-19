import java.util.Scanner;//import를 통해 외부 클래스를 호출

public class no6test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//이렇게 객체생성을 하며 System.in은 입력한 값을 바이트 단위로 읽는것이 가능해진다.
		
		String name;
		int age;
		
		System.out.print("이름은 : ");
		name = scan.nextLine();//즉 next + 자료형 ()이 기본 이라고 생각하면 될꺼같다.
		//name = scan.nextLine(); 이렇게 하면 문장 전체를 받아들여서 뒤에 오는 자료형과는 상관없이 전부다 받아 들인다
		//그래서 만일 첫 스캔문에 문장와 숫자를 같이 입력을 하게되면 앞에 문장만 입력받고 뒤의 숫자는 밑에 있는 nextInt형에서 바로 받아 들인다
		//ex : 최지호 90이라는 문장을 입력하면 next()는 최지호만 입력받고 뒤에 남아있는 90은 바로 다음에 오는 nextInt()가 받게된다
		//이렇게 하면 결과값은 '이름은 : 최지호 90 나이는 : 최지호 90'이라는 결과값을 얻게된다
		//따라서 공백의 여지가 있는 문장은 nextLine() 으로 받자
		System.out.print("나이는 : ");
		age = scan.nextInt();//이렇게 next다음에 오는 문자 형태로 받게 할수 있는데 문장전체를 받을려면 nextLine()으로 받으면 된다
		
		scan.close(); // scan문의 종료를 선언한다.
		System.out.println("이름은 : " + name + '\n' + "나이는 : " + age);
	}

}
