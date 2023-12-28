import java.util.PriorityQueue;

public class AlexaDevice {
    public static void main(String[] args) {
        int n = 4;
        double diameter[] = {6, 3, 2, 4};

        HeapSort(diameter);

        System.out.println("Diameter of combined alexa devices " + combinedDiameter(diameter, n) + " units");
        System.out.println("Minimal cost : " + minimalCost(diameter, n) + " units.");
    }

    public static void HeapSort(double arr[]) {
        int n = arr.length;

        // Build max heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from max heap
        for (int i = n - 1; i > 0; i--) {
            // Swap root with current element
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(double arr[], int i, int n) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            double swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static double minimalCost(double[] diameter, int n) {
        double minimalCost = 0;

        // Use a priority queue to efficiently extract the largest elements
        PriorityQueue<Double> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b, a));
        for (double d : diameter) {
            maxHeap.add(d);
        }

        while (maxHeap.size() > 1) {
            double cost = maxHeap.poll() / 2.0 + maxHeap.poll() / 2.0;
            minimalCost += cost;
            maxHeap.add(cost);
        }

        return minimalCost;
    }

    public static double combinedDiameter(double diameter[], int n) {
        double combinedDiameter = 0;
        for (int i = 0; i < n; i++) {
            combinedDiameter += diameter[i];
        }
        return combinedDiameter;
    }
}
