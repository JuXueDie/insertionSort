public class insertionSort {
    public static int[] insertion(int[] number) {
        for (int i = 1; i < number.length; i++) {
            int temp = number[i]; // �����ثe�n���J����
            int datum = i - 1; // ���J�Ȫ��e�@����Ƭ�����I
            while(datum > -1 && temp < number[datum]){ // �M���񴡤J���٭n�p���A�Y�_�h�ȩ����
                number[datum + 1] = number[datum];
                datum--;
            }
            number[datum + 1] = temp; // datum�]���ŦXwhile�Ӹ��X�A�ҥHdatum�e�@�����̫�ŦX���ȡA���J
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