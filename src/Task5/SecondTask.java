package Task5;
import java.util.ArrayList;
import java.util.Random;

public class SecondTask
{
    public static void main(String[] args)
    {
        int min = 2, max = 20, diff = max - min;
        Random random = new Random();
        ArrayList<Integer> firstArrayList = new ArrayList<Integer>();
        ArrayList<Integer> secondArrayList = new ArrayList<Integer>();
        int arr[] = new int[20];

        for (int i = 0; i < 20; i++)
        {
            System.out.print((arr[i] = i+1) + " ");
        }

        for (int i = 0; i < 20; i++)
        {
            if(i%2 == 0)
                firstArrayList.add(arr[i]);
            else
                secondArrayList.add(arr[i]);
        }

        System.out.println("\n" + firstArrayList);
        System.out.println(secondArrayList);

        int a = 0 ,b = 0;
        for (int i = 0; i < 20; i++)
        {
            if(i%2 == 0)
            {
                arr[i] = secondArrayList.get(a);
                a++;
            }
            else
            {
                arr[i] = firstArrayList.get(b);
                b++;
            }
        }

        System.out.println();

        for (int i = 0; i < 20; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
