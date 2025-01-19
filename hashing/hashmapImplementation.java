package hashing;

import java.util.*;

public class hashmapImplementation {
    static class HashMap<K, V> { // K , V are generics( any data types)
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i=0;i<4;i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // search in linked list
        private int searchInLL(K key , int bIdx) {
            LinkedList<Node> ll = buckets[bIdx];
            int dataIdx = 0;

            for(int i=0;i<ll.size();i++) {
                Node node = ll.get(i);
                if(node.key == key) {
                    return dataIdx;
                }
                dataIdx++;
            }
            return -1;
        }

        // rehashing
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;

            for(int i=0;i<buckets.length;i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in bucket
            for(int i=0;i<oldBuckets.length;i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for(int j=0;j<ll.size();j++) {
                    Node node = ll.get(j);
                    put(node.key , node.value);
                }
            }
        }

        // put function
        public void put(K key , V value) { // O(lambda) -> O(1)
            int bIdx = hashFunction(key);
            int dataIdx = searchInLL(key , bIdx);

            if(dataIdx != -1) {
                Node node = buckets[bIdx].get(dataIdx);
                node.value = value;
            } else {
                buckets[bIdx].add(new Node(key, value));
                size++;
            }

            double lambda = (double)size/N;
            if(lambda > 2.0) {
                rehash();
            }
        }

        // contains key function
        public boolean containsKey(K key) { // O(1)
            int bIdx = hashFunction(key);
            int dataIdx = searchInLL(key , bIdx);

            if(dataIdx != -1) {
                return true;
            } else {
                return false;
            }
        }

        // get function
        public V get(K key) { // O(1)
            int bIdx = hashFunction(key);
            int dataIdx = searchInLL(key , bIdx);

            if(dataIdx != -1) {
                Node node = buckets[bIdx].get(dataIdx);
                return node.value;
            } else {
                return null;
            }
        }

        // remove function
        public V remove(K key) { // O(1)
            int bIdx = hashFunction(key);
            int dataIdx = searchInLL(key , bIdx);

            if(dataIdx != -1) {
                Node node = buckets[bIdx].remove(dataIdx);
                size--;
                return node.value;
            } else {
                return null;
            }
        }

        // keyset function
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0;i<buckets.length;i++) {
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // isempty function
        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal" , 5);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.println(key);
        }
    }
}
