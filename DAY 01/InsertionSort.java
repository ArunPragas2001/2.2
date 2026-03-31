class InsertionSort {
    public int[] sort(int[] datalist){
        int n = datalist.length;

        for (int i = 0; i < n; i++) {
            int key = datalist[i];
            int j = i - 1;
            
            while (j >= 0 && datalist[j] > key){
                datalist[j + 1] = datalist[j];
                j--;
            }
            datalist[j + 1] = key;
        }
        return datalist;
    }

    public static void main(String[] args) {
        int[] data = {5, 1, 3, 2, 4, 9, 10, 7, 6, 8};
        InsertionSort sorter = new InsertionSort();
        int[] sorted = sorter.sort(data);

        System.out.print("Sorted data: ");
        for(int num : sorted){
            System.out.print(num + ", ");
        }
    }
}