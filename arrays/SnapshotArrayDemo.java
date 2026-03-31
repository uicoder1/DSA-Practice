import java.util.*;

class SnapshotArray {

    private List<List<int[]>> history;
    private int snapId;

    public SnapshotArray(int length) {
        history = new ArrayList<>();
        snapId = 0;

        for (int i = 0; i < length; i++) {
            List<int[]> list = new ArrayList<>();
            list.add(new int[]{0, 0}); // {snap_id, value}
            history.add(list);
        }
    }

    public void set(int index, int val) {
        List<int[]> list = history.get(index);

        // If same snapId already exists, update it
        if (list.get(list.size() - 1)[0] == snapId) {
            list.get(list.size() - 1)[1] = val;
        } else {
            list.add(new int[]{snapId, val});
        }
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        List<int[]> list = history.get(index);

        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid)[0] <= snap_id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return list.get(right)[1];
    }
}

public class SnapshotArrayDemo {
    public static void main(String[] args) {
        SnapshotArray snapshotArr = new SnapshotArray(3);

        snapshotArr.set(0, 5);
        int snap0 = snapshotArr.snap();
        snapshotArr.set(0, 6);

        System.out.println("snap id: " + snap0);
        System.out.println("get(0, 0): " + snapshotArr.get(0, 0)); // 5

        snapshotArr.set(1, 10);
        int snap1 = snapshotArr.snap();

        System.out.println("snap id: " + snap1);
        System.out.println("get(1, 1): " + snapshotArr.get(1, 1)); // 10
        System.out.println("get(1, 0): " + snapshotArr.get(1, 0)); // 0
    }
}