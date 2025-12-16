package dsa.binarysearch;

public class TestMountainArray {

    // MountainArray interface
    interface MountainArray {
        int get(int index);
        int length();
    }

    // Concrete implementation for local testing
    static class MountainArrayImpl implements MountainArray {
        private int[] arr;

        MountainArrayImpl(int[] arr) {
            this.arr = arr;
        }

        public int get(int index) {
            return arr[index];
        }

        public int length() {
            return arr.length;
        }
    }

    // Your solution (fixed)
    static class Solution {

        public int findInMountainArray(int target, MountainArray mountainArr) {
            int length = mountainArr.length();
            int pivot = findPivot(mountainArr, 0, length - 1);

            if (target > mountainArr.get(pivot)) return -1;

            int left = binarySearch(target, mountainArr, 0, pivot, true);
            if (left != -1) return left;

            return binarySearch(target, mountainArr, pivot + 1, length - 1, false);
        }

        public int binarySearch(int target, MountainArray mountainArr, int start, int end, boolean isAsc) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                int val = mountainArr.get(mid);

                if (val == target) return mid;

                if (isAsc) {
                    if (val > target) end = mid - 1;
                    else start = mid + 1;
                } else {
                    if (val < target) end = mid - 1;
                    else start = mid + 1;
                }
            }
            return -1;
        }

        public int findPivot(MountainArray mountainArr, int start, int end) {
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            return start;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 12, 11, 7, 3};
        MountainArray mountainArray = new MountainArrayImpl(arr);

        Solution sol = new Solution();

        int target = 11;
        int index = sol.findInMountainArray(target, mountainArray);

        System.out.println("Target: " + target);
        System.out.println("Index found: " + index);
    }
}

