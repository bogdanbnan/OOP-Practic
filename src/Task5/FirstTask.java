package Task5;
import java.util.ArrayList;
import java.util.Random;

public class FirstTask
{
    public static void main(String[] args)
    {
        int min = -100, max = 100, diff = max - min;
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
        {
            arrayList.add(random.nextInt(diff+1)+min);
        }
        System.out.println("After: \n" + arrayList);

        for(int i = 0; i < arrayList.size(); i++)
        {
            if(arrayList.get(i) < 0)
            {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println("Before: \n" + arrayList);
    }
}