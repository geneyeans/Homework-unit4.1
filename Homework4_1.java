package homework4;

public class Homework4_1 {
public static void main(String[] args) {
	int score = 0 ;
	if (score >= 80) {
	System.out.println("Good");
	} else if (score >= 50 && score < 80) {
	  System.out.println("normal");
	} else if (score < 50) {
	  System.out.println("fail");
	} else {
	  System.out.println("InvaIid!");
	}
}
}

