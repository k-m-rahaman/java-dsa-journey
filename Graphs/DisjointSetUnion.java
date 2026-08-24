public class DisjointSetUnion {

    int[] parent;
    int[] rank;

    DisjointSetUnion(int size) {

        parent = new int[size];
        rank = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {

        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }

        return parent[x];
    }

    void union(int a, int b) {

        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB) {
            return;
        }

        if (rank[rootA] < rank[rootB]) {

            parent[rootA] = rootB;

        } else if (rank[rootA] > rank[rootB]) {

            parent[rootB] = rootA;

        } else {

            parent[rootB] = rootA;
            rank[rootA]++;
        }
    }

    public static void main(String[] args) {

        DisjointSetUnion dsu = new DisjointSetUnion(6);

        dsu.union(0, 1);
        dsu.union(1, 2);

        dsu.union(3, 4);

        System.out.println("0 and 2 connected: "
                + (dsu.find(0) == dsu.find(2)));

        System.out.println("0 and 3 connected: "
                + (dsu.find(0) == dsu.find(3)));

        dsu.union(2, 3);

        System.out.println("0 and 3 connected after union: "
                + (dsu.find(0) == dsu.find(3)));
    }
}