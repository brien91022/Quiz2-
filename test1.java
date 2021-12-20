package Q1; 
import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {

		outsideloop:for(int j=1 ;j<=3;j++) { 

			insideloop:for(int i=1;i<=3;i++) {

				System.out.print("STEP1:請輸入密碼:\n");
				Scanner wrt = new Scanner(System.in);
				int setpass1=wrt.nextInt();


				if ( setpass1 < 0 || setpass1 > 9999 ){
					System.out.println("與第一次輸入的不同\n");
				}

				System.out.print("STEP2:請再輸入一次密碼:\n");
				Scanner wrti = new Scanner(System.in);
				int setpass2=wrti.nextInt();

				if ( setpass2 < 0 || setpass2 > 9999 ){
					System.out.println("與第一次輸入的不同\n");
				}

				else if (setpass1 == setpass2){
					System.out.print("密碼正確");
					break outsideloop;
				} 

				else if (setpass1 != setpass2){
					System.out.print("與第一次輸入不同\n");


					if (j==3) {
						System.out.println("輸入三次錯誤，程式停止");
						break outsideloop;
					}
				}
			}
		}
	}
}
