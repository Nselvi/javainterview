package edabit;

public class CamelCase {

	public static void main(String[] args) {


		System.out.println(toSnakeCase("helloEdabitEdabit"));
		System.out.println(toCamelCase("hello_edabit"));
		
	}

	public static String toSnakeCase(String str) {
		// helloEdabit -->hello_edabit
		String reg = str.replaceAll("([A-Z])", "_$1").toLowerCase();
		return reg;

	}

	public static String toCamelCase(String str2) {
		// toCamelCase("hello_edabit") ➞ "helloEdabitEdabit"
		String result="";
		
		if (str2.contains("_")) {
			String[] ch = str2.split("_");
			for(int i=1; i< ch.length;i++) {
				result=result+ch[i].substring(0, 1).toUpperCase()+ch[i].substring(1);

				}
			result=ch[0]+result;
			}else {
			return str2;
		}
		return result;

	}
}

/*
public class Challenge {
	public static String toCamelCase(String str) {
		String []arr=str.split("_");
		String newstr=arr[0];
		for(int i=1;i<arr.length;i++) {
			newstr+=(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1));
		}	
		return newstr;
	}

	public static String toSnakeCase(String str) {
		String newstr="";
		for(int i=0;i<str.length()-1;i++) {
			if(str.substring(i,i+1).matches("[A-Z]")) {
				newstr=newstr + "_" + str.substring(i,i+1).toLowerCase();
			}else {
				newstr+=str.substring(i,i+1);
			}
		}
		newstr+=str.substring(str.length()-1);
		return newstr;
	}
}
 */







