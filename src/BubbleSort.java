import java.util.Arrays;
/**
 * Wrong!
 * @author AaronFae
 * @date 2018年7月17日 上午2:58:40
 *
 */
public class BubbleSort {

	public static int[] sort(int[] a) {
		int temp;
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j < a.length - i; j--) {
				if (a[i] > a[j]) {
					break;
				}
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {1,6,3,8,6,2,9,2,0};
		Arrays.toString(sort(a));
	}
}
