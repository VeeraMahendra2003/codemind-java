import java.util.*;
 class Mahi {
    public static void main(String[] args)
    {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int arr[] = new int[100];
        for(int i=0;i<n;i++)
        {
            arr[i]=t.nextInt();
        }
        int max=0;
        int index = -1;
        for (int i = 0; i < n; i++) 
        {
            int c=0;
            for (int j = 0; j < n; j++) 
            {
                if (arr[i] == arr[j])
                    c++;
            }
            if (c > max) {
                max= c;
                index = i;
            }
        }
        if (max > n / 2)
            System.out.println(arr[index]);
 
        else
            System.out.println("No Majority Element");
    }
}