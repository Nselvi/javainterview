package edabit;

public class RockPaperScissor {
	
	
	public static void main(String[] args) {
		String s1="paper";
		String s2="paper";
		RockPaperScissor r=new RockPaperScissor();
		System.out.println(r.rps(s1, s2));	
	}
private enum Rps {PAPER, SCISSORS, ROCK}
	
	public static String rps(String s1, String s2) {
		int p1 = Rps.valueOf(s1.toUpperCase()).ordinal();
		int p2 = Rps.valueOf(s2.toUpperCase()).ordinal();
		return (p1 == p2) ? "TIE" 
			: (p1 - p2 == 1 || p1 - p2 == 1 - Rps.values().length) ? "Player 1 wins"
			: "Player 2 wins";
	}
}

/*
 if(s1.equals(s2)) {
			return "TIE";
		}
		else if(s1.equals("rock") && s2.equals("paper")) {
			return "Player 2 wins";
		}
		else if(s1.equals("rock") && s2.equals("scissors")) {
			return "Player 1 wins";
		}
		else if(s1.equals("paper") && s2.equals("rock")) {
			return "Player 1 wins";
		}
		else if(s1.equals("paper") && s2.equals("scissors")) {
			return "Player 2 wins";
		}
		else if(s1.equals("scissors") && s2.equals("rock")) {
			return "Player 2 wins";
		}
		else{
			return "Player 1 wins";
		}
	}
}
 
 */
		
		
