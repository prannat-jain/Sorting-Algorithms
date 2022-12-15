//Sorts an ArrayList using the MergeSort algorithm
import java.util.ArrayList;
import java.util.Scanner;
public class MergeSort<T extends Comparable<T>>{
    /*
     * @param list The ArrayList to be sorted
     * @return The sorted version of the ArrayList
     * Uses Split, Recur and Merge
     * Merge is done using the 2-finger walk algorithm
     */
    public static <T extends Comparable<T>> ArrayList<T>
    mergeSort(ArrayList<T> list) {
        if (list.size()>1){
            int n1= list.size()/2;
            int n2 = list.size()- n1;
            ArrayList<T> left = new ArrayList<T>();
            for(int i=0; i<n1;i++)
                left.add(list.get(i));
            ArrayList<T> right = new ArrayList<T>();
            for (int i=n1; i<list.size(); i++)
                right.add(list.get(i));
            left = mergeSort(left);
            right = mergeSort(right);
            return merge(left, right);
        }
        return list;
    }
    public static <T extends Comparable<T>> ArrayList<T>
    merge(ArrayList<T> first, ArrayList<T> second){
        ArrayList<T> result = new ArrayList<T>();
        int iFirst=0;
        int iSecond=0;
        int j=0;
        while (iFirst<first.size()&&iSecond<second.size())
        {
            if
            ((first.get(iFirst).compareTo(second.get(iSecond))<0))
            {
                result.add(first.get(iFirst));
                iFirst++;
            }
            else if
            (first.get(iFirst).compareTo(second.get(iSecond))>0)
            {
                result.add(second.get(iSecond));
                iSecond++;
            }
            else
                //if they are equal, copy both elements and move both pointers (duplicates allowed)
            {
                result.add(first.get(iFirst));
                result.add(second.get(iSecond));
                iFirst++;
                iSecond++;
            }
        }
        //copy remaining elements
        while (iFirst<first.size())
        {
            result.add(first.get(iFirst));
            iFirst++;
        }
        while (iSecond<second.size())
        {
            result.add(second.get(iSecond));
            iSecond++;
        }
        return result;
    }
    public static void main(String[] args){
        //add your test code here
    }
}
