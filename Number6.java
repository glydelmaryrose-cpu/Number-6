
/**
 * Write a description of class Number6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number6
{
    public static void main(String [] args){
    
        int [] arr = {3, 8, 11, 14, 17};
        int sum = 0;
        int count = 0;
        
        for (int x : arr){
            if (x % 2 != 0) {
                sum += x;
                count++;
            }
        }
        System.out.println("Average of odd number = " + (sum / count));
    }
}
