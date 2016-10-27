import java.util.*;
import java.io.*;
public class InputNumData {

	public static void main(String[] args) throws IOException{
		Scanner sf = new Scanner(new File("E:\\Workspace\\StringsExcercises\\+"));
		int maxIndx = -1;
		String []text = new String[1000];
		while (sf.hasNext()){
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();
		String answer = "";
		int sum;
		for (int j = 0; j <= maxIndx; j++){
			Scanner a = new Scanner(text[j]);
			sum = 0;
			answer = "";
			while (a.hasNext()){
				int i = a.nextInt();
				if(answer.equals("")){
					answer = answer + i;
				}
				answer = answer + " + " + i;
				sum = sum + i;
			}
			answer = answer + " = " + sum;
			System.out.println(answer);
		}
	}

}