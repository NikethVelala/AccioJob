public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3,4};
        int n=removeDuplicates(a);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static int removeDuplicates(int[] a) {
        int count=0,j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[j++]=a[i];
                count++;
            }
        }
        a[j++]=a[a.length-1];
        return ++count;
    }
}
