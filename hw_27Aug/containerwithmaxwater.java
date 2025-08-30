package hw_27Aug;
//we can simply use 2 pointer i and j and 
//find the min height out of those two and once we calculate width we can find the area
//and we can have a maxwater variable after finding area we can find max of both and return as answer

class containerwithmaxwater {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0;
        int j=n-1;
        int maxwater=0;
        while(i<j){
            int w = j-i;
            int h= Math.min(height[i],height[j]);
            int area_rn = w*h;
            maxwater = Math.max(maxwater,area_rn);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxwater;
    }
}
