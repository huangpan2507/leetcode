package zuochengyun_book;

public class del_wuyong1 {
	class Contents{
		private int i = 11;
		public int value() { return i;}
		
	}
	
	class Destination {
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		
		String readLabel() { return label;}
		
	}
	
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents(){
		return new Contents();
		
	}
	
	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	
	}
	
	public static void main(String[] args) {
		
		del_wuyong1 p = new del_wuyong1();
		p.ship("zhogguo");
		del_wuyong1 q = new del_wuyong1();
		Contents c = q.contents();
		Destination d = q.to("jiangxi");
		System.out.println(c.value()+ d.readLabel());
		
	}

}
