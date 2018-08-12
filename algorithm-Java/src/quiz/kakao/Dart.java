package quiz.kakao; 

public class Dart {
	public static void main(String args[]) {
		String case1 = "1S2D*3T";
		String case2 = "1S*2T*3S";
		String case3 = "1D#2S*3S";
		
		System.out.println(dartScore(case1));
		System.out.println(dartScore(case2));
		System.out.println(dartScore(case3));
		
	}
	
	
	public static int dartScore(String s) {
		int result = 0;
		
		String[] byDigits = s.split("[0-9]+");
		// _, S, D, T
		String[] byChars = s.split("\\D+");
		// 1, 2, 3
		int score[] = new int[byChars.length];
		
		for(int i=0; i < byChars.length; i++) {
			score[i] = Integer.parseInt(byChars[i]);
			
			if(byDigits[i+1].contains("S")) {
				score[i] = score[i];
			} else if(byDigits[i+1].contains("D")) {
				score[i] = score[i] * score[i];
			} else if(byDigits[i+1].contains("T")) {
				score[i] = score[i] * score[i] * score[i];
			}
			
			if(byDigits[i+1].length() >= 2) {
				if(byDigits[i+1].contains("#")) {
					score[i] = score[i] * -1;
				} else if(byDigits[i+1].contains("*")) {
					if(i < 1) {
						score[i] = score[i] * 2;
					} else {
						score[i-1] = score[i - 1] * 2;
						score[i] = score[i] * 2;
					}
				}
			}
		}
		
		for(int n : score) {
			result += n;
		}
		
		return result;
	}
}
