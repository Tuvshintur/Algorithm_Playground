package DataStructures;

import java.util.HashMap;

public class Trie {

    static class Node {
        HashMap<Character, Node> map;
        boolean isWord;
        Node(HashMap<Character, Node> map, boolean isWord) {
            this.map = map;
            this.isWord = isWord;
        }
    }

    static Node root;

    void add(String word) {
        Node tmp = root;
        for(int i=0;i<word.length();i++) {
            Character c= word.charAt(i);
            if(!tmp.map.containsKey(c)) {
                tmp.map.put(c, new Node(new HashMap<>(), false));
            }
            tmp = tmp.map.get(c);
        }
        tmp.isWord = true;
    }

    boolean search(String word) {
        Node tmp = root;
        for(int i=0;i<word.length();i++) {
            Character c= word.charAt(i);
            if(!tmp.map.containsKey(c)) {
                return  false;
            }
            tmp = tmp.map.get(c);
        }
        return tmp!=null && tmp.isWord;
    }

    public static void main(String[] args) {
        Trie t = new Trie();
        root = new Node(new HashMap<>(), false);

        t.add("hahaha");
        t.add("bonbon");

        System.out.println(t.search("hahaha123"));
    }
}
