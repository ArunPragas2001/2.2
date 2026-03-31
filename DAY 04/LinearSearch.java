class LinearSearch{
    static int resursiveLinearSearch(int[] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return resursiveLinearSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 4;
        System.out.println("Index is " + resursiveLinearSearch(arr, target, 0));
    }
}