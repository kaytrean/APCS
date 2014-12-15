import java.util.*;
import java.io.*;

public class Searching{
    public static Random r = new Random();
    public Comparable[] a;
    public Searching(){
        this(10);
    }
    public Searching(int i){
        a = new Comparable[i];
    }
    public void additem(Comparable item){
        int index = 0;
        while (a[index] != null){
            index++;
        }
        a[index] = item;
    }
    public void sort(){
        Arrays.sort(a);
    }
    public Comparable lsearch(Comparable item){
        for (int i=0;i<a.length;i++){
            if (a[i] == item){
                return i;
            }
        }
        return null;
    }
    public Comparable bsearch(Comparable item){
        int high = a.length-1;
        int low = 0;
        int index = high/2;
        while (a[index]!=item){
            if (a[index].compareTo(item)<0){
                low = index + 1;
                index = (high-low)/2 + low;
            } else if (a[index].compareTo(item)>0){
                high = index - 1;
                index = (high-low)/2 + low;
            } if ((high == low+1 || high == low || index == high) && a[index] != item && a[high] != item && a[low] != item){
                return null;
            }
        } return index;
    }
    public Comparable rbsearch(Comparable item){
        return rbsearch(item, 0, a.length-1);
    }
    public Comparable rbsearch(Comparable item, int low, int high){
        int index = (high-low)/2 + low;
        if (high<low){
            return null;
        } else if (a[index].compareTo(item)==0){
            return index;
        } else if (a[index].compareTo(item)<0){
            return rbsearch(item, index + 1, high);
        } else {
            return rbsearch(item, low, index - 1);
        }
    }
}