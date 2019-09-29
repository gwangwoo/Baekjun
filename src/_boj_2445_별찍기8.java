import java.io.*;
import java.util.*;

public class _boj_2445_별찍기8 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= N ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print('*');
			}
			for(int j = (N-i)*2 ; j > 0  ; j--) {
				System.out.print(' ');
			}
			for(int j = 0 ; j < i ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i = N-1 ; i > 0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print('*');
			}
			for(int j = 0 ; j < (N-i)*2 ; j++) {
				System.out.print(' ');
			}
			for(int j = 0 ; j < i ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
