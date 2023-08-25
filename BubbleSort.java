public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={6,7,83,43,44};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int e: arr){
            System.out.print(e+"\t");
        }   
    }
}
