import java.util.ArrayList;
public class BubbleSort<T extends Comparable <T>>
{
    public static <T extends Comparable<T>> ArrayList<T>
    bubbleSort(ArrayList<T> list)
    {
        for (int pass=0; pass<list.size()-1;pass++)
        {
            for(int i=0; i<list.size()-1-pass; i++)
            {
                if ((list.get(i)).compareTo(list.get(i+1))>0)
                {
                    T temp1 = list.get(i);
                    T temp2 = list.get(i+1);
                    list.set(i,temp2);
                    list.set(i+1,temp1);
                }
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(51);
        list.add(44);
        list.add(12);
        list.add(19);
        list.add(100);
        System.out.println(bubbleSort(list));
    }
} 