public class insertionSort {
    public static int[] insertion(int[] number) {
        for (int i = 1; i < number.length; i++) {
            int temp = number[i]; // 紀錄目前要插入的值
            int datum = i - 1; // 插入值的前一筆資料為基準點
            while(datum > -1 && temp < number[datum]){ // 尋找到比插入值還要小的，若否則值往後推
                number[datum + 1] = number[datum];
                datum--;
            }
            number[datum + 1] = temp; // datum因不符合while而跳出，所以datum前一筆為最後符合的值，插入
        }
        return number;
    }
    
    public static void main(String[] args) {
        int[] a = {92, 77, 67, 8, 6, 84, 55, 85, 43, 67};
        int[] b = insertion(a);
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
    }
}