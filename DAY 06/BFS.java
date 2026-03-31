class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    public void enqueue(int data) {
        Node node = new Node(data);

        if (rear == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public int dequeue() {
        if (front == null) {
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

public class BFS {
    int vertices;
    Node[] adjList;

    public BFS(int vertices) {
        this.vertices = vertices;
        adjList = new Node[vertices];
    }

    public void addEdge(int u, int v) {
        Node node = new Node(v);
        node.next = adjList[u];
        adjList[u] = node;

        node = new Node(u);
        node.next = adjList[v];
        adjList[v] = node;
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];

        Queue queue = new Queue();

        visited[start] = true;
        queue.enqueue(start);

        System.out.print("BFS Traversal: ");
        bfsRecursive(queue, visited);
        System.out.println();
    }

    private void bfsRecursive(Queue queue, boolean[] visited) {
        if (queue.isEmpty()) {
            return;
        }

        int current = queue.dequeue();
        System.out.print(current + " ");

        Node temp = adjList[current];

        while (temp != null) {
            if (!visited[temp.data]) {
                visited[temp.data] = true;
                queue.enqueue(temp.data);
            }
            temp = temp.next;
        }

        bfsRecursive(queue, visited);
    }
}

class Main {
    public static void main(String[] args) {

        BFS g = new BFS(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.bfs(0);
    }
}