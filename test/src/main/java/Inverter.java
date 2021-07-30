
public class Inverter {
	
	public String invert (String t) {
		String result = "";
		if(t == null) {
			System.out.println("param null");
			return result;
		}else {
			StringBuffer sb = new StringBuffer(t);
			result = sb.reverse().toString();
			System.out.println("result = "  + result);
		}
		return result;
	}

}
