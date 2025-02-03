import java.util.Scanner;

public class b2292_벌집 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //입력받은 숫자
		int tmp = 1; // 몇번째 껍질인지,반복문 반복 횟수
		int room = 0; // 거쳐가야하는 방의 갯수
		int N = 0; // 방의 갯수의 기준
		
		while(true) {
			
			//벌집 칸 수 기준 값       1, 2, 8, 20 ...
			//증가하는 수가 6의 배수이다.  1  6  12  18
			N+=1+6*(tmp-1); // 초기값(1일때 1)+6*(반복횟수-1)
			
			if(num<=N) { //기준 값보다 작거나 같을 경우 반복횟수가 거쳐가야하는 방의 갯수이다.
				room = tmp;
				break;
			}
			tmp++; //벌집 껍질 수 증가
			continue;
		}
		
	System.out.println(room);
	sc.close();
	}
}
