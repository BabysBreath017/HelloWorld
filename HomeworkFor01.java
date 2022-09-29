
//打印 2 到 10000 的所有素数，每行显示 8 个素数。

public class HomeworkFor01{
	public static void main(String[] args) {
		int count = 0;
		for(int i=2;i<=10000;i++){
			boolean isPrimeNum = true;
		    for(int j=2;j<i;j++){
		    	if(i % j == 0){
		    		isPrimeNum = false;
		    		break;
		    	} 
		    }
		    if(isPrimeNum){
		    	System.out.print(i + " ");
		    	count++;
		    	if(count == 8){
		    		System.out.println();
		    		count = 0;
				}
			}
		}
	}
}