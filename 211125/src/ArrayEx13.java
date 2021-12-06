// 문제 : 배열을 달팽이로 채우기
/* 좌측 하단 시계 반대 방향
               
  / 방향에 부딛히면서 개수 감소 
  \ 방향에 부딛히면서 행열 증감
  변수 설정 - 개수, 행, 열, 증감하는 변수(sw = 1, sw *= -1) -1을 곱하여 증감 표현

 13 12 11 10  9
 14 23 22 21  8
 15 24 25 20  7
 16 17 18 19  6
  1  2  3  4  5


 *
 */
  public class ArrayEx13 {
			public static void main(String[] args) {
				final int MAX = 5;
				int ar[][] = new int[MAX][MAX];
				// 채우기
				// 변수 선언
				int k = 0, count = MAX, sw=1, row=MAX-1, col=-1; // 증가, 개수, 반전, 행, 열 
				while(true) {
					for(int i=0;i<count;i++) {
						col += sw;
						ar[row][col] = ++k;
					
					
					}
					count--; // 개수감소
					if(count==0) break; // 개수가 0이면 종료
					// 반전
					sw *= -1;
					for(int i=0;i<count;i++) {
						row += sw;
						ar[row][col] = ++k;
						
					}
				}

		// 출력
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length; j++) {
				if(ar[i][j] != 0)
					System.out.printf("%3d", ar[i][j]);
				else
					System.out.print("   ");
			}
			System.out.println();
		}// end for
		
	}// end main
}// end class
