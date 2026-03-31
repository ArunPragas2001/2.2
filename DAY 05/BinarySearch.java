class BinarySearch{
    static int binarySearch(int[] arr, int target){
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int left, int right){
        if (left > right) {
            return -1;
        } else {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                return binarySearch(arr, target, mid + 1, right);
            else
                return binarySearch(arr, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}