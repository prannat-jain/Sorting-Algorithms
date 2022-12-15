import java.util.ArrayList;
public class SelectionSort<T extends Comparable <T>>
{
    public static <T extends Comparable<T>> ArrayList<T>
    selectionSort(ArrayList<T> list)
    {
        for (int i=0; i<list.size()-1;i++)
        {
            int minPos=i;
//find the index with the smallest key in the 
//remainder of list
            for(int j=i+1;j<list.size();j++){
                if((list.get(j)).compareTo(list.get(minPos))<0)
                    minPos=j;
            }
//swap the items in index i and minPos
            T temp1 = list.get(i);
            T temp2 = list.get(minPos);
            list.set(i,temp2);
            list.set(minPos,temp1);
        }
        return list;
    }
    public static void main(String[] args)
    {
        //add your test code here
    }
}