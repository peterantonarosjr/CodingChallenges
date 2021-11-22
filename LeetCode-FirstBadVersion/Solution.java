/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        //Binaaray Search for bad versions

        int low = 0;
        int high = n;

        while(high>low){

            int mid = low+(high-low)/2;

            if(isBadVersion(mid)){
                high = mid;;
            }else{
                low = mid+1;
            }
        }
        return low;

    }
}
