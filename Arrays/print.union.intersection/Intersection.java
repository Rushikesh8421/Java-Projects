package print.union.intersection;

public class Intersection {
	public void intr(int arr1[], int arr2[], int m, int n) {
		int i=0, j=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j]<arr1[i]) {
				j++;
			}
			else {
				System.out.print(arr1[i++]+" ");
				j++;
			}
		}
	}

}
