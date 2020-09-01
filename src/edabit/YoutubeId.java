package edabit;

public class YoutubeId {

	public static void main(String[] args) {
		//youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg") ➞ "XPEr1cArWRg"

		//youtubeId("https://youtu.be/BCDEDi5gDPo") ➞ "BCDEDi5gDPo"

		//youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4") ➞ "vxP3bY-XxY4"
	}
	public static String youtubeId(String link) {
		
//		String regex = "(\\b\\w+\\b)+\\s+(\\b\\w+\\b)";
//		System.out.println(str.replaceAll(regex, "$2 $1"));
//		
//		String input = "abcdefghij";
//		input = input.replaceAll("(..)(..)", "$2$1");
//		System.out.println(input);
		
		String regex = "(https://(www.youtube|youtu|youtube)\\.(com|be)\\/)\\watch?\\?\\w(\\w+)";
		link.replaceAll(regex, "$2");
		
		return link; 
		
	}
}
