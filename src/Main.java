public class Main {
    public static void main(String[] args) {

        int talArray[]={0,10,3,5,7,10,5,20,10,20};
        int x=indexOfLargest(talArray,10);
        System.out.println(x);
    }

    public static int indexOfLargest(int[] a,int antal){
        int index=0;
        int max=0;
        for(int i=1;i<antal;i++){
            if(a[i]>=max){
                max=a[i];
                index=i;
            }
        }
        return index;
    }
}