package HelloWorld;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class sortarray {
	public static void main(String[] args) {
		Integer arr[]= {12,16,45,11,18,22,22,29,20,45};
		 Integer res=Arrays.stream(arr).distinct().sorted().skip(1).findFirst().get()
				 ;
		System.out.println(res);
	}
}
