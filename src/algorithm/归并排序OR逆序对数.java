package algorithm;
public class ¹é²¢ÅÅĞòORÄæĞò¶ÔÊı {
    public static int cnt = 0;
    
    public int InversePairs(int [] array) {
        if(null == array)    return 0;
        sortLeft2Right(array, 0, array.length - 1);
        
        return cnt;
    }
    
    public void sortLeft2Right(int[] array, int start, int end){
        if(start >= end)    return;
        int mid = (start + end) / 2;
        
        sortLeft2Right(array, start, mid);
        sortLeft2Right(array, mid + 1, end);
        
        merge(array, start, mid, end);
    }
    
    public void merge(int[] array, int start, int mid, int end){
        int []temp = new int[end - start + 1];
        int i = start, j = mid + 1;
        int index = 0;
        while(i <= mid && j <= end){
            if(array[i] <= array[j]){
                temp[index++] = array[i++];
            } else {
                temp[index++] = array[j++];
                cnt += mid - i + 1;
                if(cnt >= 1000000007)    cnt %= 1000000007;
            }
        }
        while(i <= mid)    temp[index++] = array[i++];
        while(j <= end)    temp[index++] = array[j++];
        index = 0;
        i = start;
        while(i <= end)    array[i++] = temp[index++];
    }
    
    public static void main(String[] args) {
    	int[] array = new int[] {1,2,3,4,5,6,7,0};
    	new ¹é²¢ÅÅĞòORÄæĞò¶ÔÊı().InversePairs(array);
    	for(int x : array)	System.out.print(x + " ");
    	System.out.println("\n" + cnt);
    }
}