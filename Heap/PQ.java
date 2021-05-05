import java.util.PriorityQueue;




public class PQ{
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        System.out.println(pq);

        pq.add("pradeep");
        pq.add("par");
        pq.add("aman");
        pq.add("bali");

        System.out.println(pq);

        System.out.println(pq.peek());
        while(pq.size() > 0){

            System.out.println(pq.remove());
        }
        
    }
}