
public class Mergesortedarray {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        int[] b = {40,50,60,70};
        int n = a.length;
        int m = b.length;
        int[] c = new int[n+m];
        int i=0, j=0, k=0;
        //merging concept start here
        while(i<a.length && j<b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            }
        else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
            while(j<b.length){
                c[k] = b[j];
                j++;
                k++;
            }
            while(i<a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        for(k=0;k<c.length;k++){
            System.out.print(c[k]+" ");
        }
    }
}
