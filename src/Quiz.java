import java.util.Scanner;

public class Quiz {


	public static void main(String[] args){
		int situ1 = situmon1();
		int situ2 = situmon2();
		int situ3 = situmon3();
		int situ4 = situmon4();
		int situ5 = situmon5();
		int situ6 = situmon6();


	}



	public static int situmon1(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon2(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon3(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon4(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon5(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		// 質問内容を表示
		String kotae;
		System.out.println("問5");
		System.out.println("戦場ヶ原ひたぎを担当している声優はだれでしょう？");
		kotae=sc.next();
		if(kotae.equals("斎藤千和")){
			return 1;
		}else{
			return 2;
		}
	}

	public static int situmon6(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

}
