class DS {
	String a;
	String b;
	DS(String a, String b) { 
		this.a = a;
		this.b = b;
	}
	void show() {
		System.out.println(a + " " + b);
	}
	void copy(DS ds) {
		this.a = ds.a;
		this.b = ds.b;
	}
}
public class Test {
	public static void main(String[] args) {
		DS[] ds = new DS[] {
				new DS("Hello", "world!"),
				new DS("Good", "morning!"),
				new DS("What's", "up?"),
				new DS("Are you", "OK?"),
				new DS(null, null),
				new DS(null, null),
		};
		DS unit = new DS("你好", "再见！");
		unit.show();
		System.out.println();
		for(DS s : ds) {
			if(s.a == null) {
//				s = unit;//! 别名机制陷阱
				s.copy(unit);
				break;
			}
		}
		for(DS s : ds) {
			s.show();
		}
	}
}
