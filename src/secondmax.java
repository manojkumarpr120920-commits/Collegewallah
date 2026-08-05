import java.util.Scanner;
public  class secondmax {
    static int findmax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }
        static int findsecondmax(int arr[]){
            int mx=findmax(arr);
            for(int i=0;i<arr.length;i++){
              if(arr[i]==mx){
                  arr[i]=Integer.MIN_VALUE;
              }
            }
            int findsecond=findmax(arr);
            return findsecond;
        }

public  static  void  main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
        arr[i] = sc.nextInt();
    }
        System.out.print(findsecondmax(arr));

    }
}
