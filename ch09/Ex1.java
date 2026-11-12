/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    /*
        用飛機來比喻：
        - try： 飛機正常飛行，執行預定任務。
        - catch： 飛行發生異常，啟動應變程序。
        - finally： 不論飛行是否發生異常，都要執行必要的收尾程序。
        
        簡言之，
        catch 是異常處理機制，finally 是最後的收尾機制。
        catch 處理問題，finally 善後；但是善後不代表問題一定會被解決。
    */
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入整數a及b(以空白隔開):");
		try 
		 {
			int a = keyin.nextInt();
			int b = keyin.nextInt();
			System.out.println(a + "/" + b + "=" + (a / b));
		 } 
		catch (InputMismatchException e) 
		 {
		  System.out.println("發生例外的類別名稱或原因:" + e.toString());
	      //若覺得「e.toString ()」的結果，使用者不容易了解，可改用下面敘述
		  //「System.out.println("發生例外的原因:資料輸入的型態與需求的型態不符時");」
		  // 它可以輸出錯誤訊息，但不一定要輸出訊息，也可以採取其他處理方式。
		     
		 }
		catch (ArithmeticException e) 
		 {
			System.out.println("發生例外的原因:" + e.getMessage());
	        //若覺得「e.getMessage()」的結果，使用者不容易了解，可改用下面敘述
			//「System.out.println("發生例外的原因:除數為0");」
			// 它可以輸出錯誤訊息，但不一定要輸出訊息，也可以採取其他處理方式。
		 }  
		finally 
		 {
		    // 執行最後的清理工作。 不論 try 是否發生 Exception，也不論是否進入 catch，
		    // 在一般情況下都會執行 finally，例如關閉檔案、釋放資源等。
			System.out.println("finally區塊內的敘述有執行到，且程式沒有異常中止.");
			keyin.close();
		 }
	}
}
