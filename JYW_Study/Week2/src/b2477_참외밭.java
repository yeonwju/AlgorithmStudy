import java.util.Scanner;

public class b2477_참외밭 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		
		int max_w =0, max_h=0, min_w=0, min_h = 0;
		int h = 0, w=0;
		
		for(int i=0; i<6; i++) {
			int way = sc.nextInt(); // 동서남북 방향 입력
			int l = sc.nextInt(); // 참외밭 변의 길이 입력
			
			if(way==1 || way==2) {//방향이 동, 서일 경우 (변이 가로인 경우)
				if(w==0) {//초기 값 입력
					w = l;
					max_w = l;
					min_w = l;
				}
				else if(l>max_w) {//최대값보다 클 경우 가로최대값 재설정
					w = l;
					max_w = l;
				}
				else if(l<min_w) {//최소값보다 작을 경우 가로최솟값 재설정
					w = l;
					min_w = l;
				}
			}
			
			if(way==3 || way==4) {//방향이 남, 북일 경우
				if(h==0) {//초기 값 입력
					h = l;
					max_h = l;
					min_h = l;
				}
				else if(l>=h) {//최대값보다 클 경우 세로최대값 재설정
					h = l;
					max_h = l; 
				}
				else if(l<h) {//최솟값보다 작을 경우 세로최솟값 재설정
					h = l;
					min_h = l;
				}
			}
		}
		
		int area = (max_w * max_h) - (min_w *min_h);//넓이 = (최대가로*최대세로)-(최소가로*최소세로)
		
		System.out.println(area*max); //넓이 * 최대참외갯수
		sc.close();
	}
}
