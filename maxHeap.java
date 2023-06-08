public class maxHeap{
    private int position=1;
    private int capacity;
    private int[] heap;

    public maxHeap(){
        int capacity=10;
        heap =new int[capacity];
    }
    public maxHeap (int Capacity){
        int capacity=Capacity+1;
        heap =new int[Capacity];
    }
    public void insert(int value) {
        if (position == capacity) {
            System.out.println("heap is full now");
        } else {
            heap[position] = value;
            position++;
            int child = (position);
            int parent = child / 2;
            while (heap[parent] < heap[child] && parent > 0) {
                int swap = heap[parent];
                heap[parent] = heap[child];
                heap[child] = swap;

                child = parent;
                parent = child / 2;
            }
        }
    }

//        public  int pop() {
//            if (position == 1) {
//                throw new IndexOutOfBoundsException("Heap is empty");
//            }
//            else {
//
//            }
//        }
//    }
//     class usingmaxHeap{
//         public static void main(String[] args) {
//             maxHeap mh =new maxHeap();
//
//         }
//     }

