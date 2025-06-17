public class finNo {
    public static void main(String[] args) {
        int a[] = {2,7,1,45,6,9};
        int temp;
        int j;

        for(int i = 0; i<a.length;i++){
            temp = a[i];
            j = i;
            while(j>0 && a[j-1] > temp){
                a[j] = a[j-1];
                j = j-1;
            }
            a[j] = temp;
        }
        System.out.print(a[0] + " ");
        System.out.print(a[a.length-1]);

    }
}
