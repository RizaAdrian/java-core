package com.core;

import java.util.TreeSet;

public class TreeSetComparable  implements Comparable<TreeSetComparable> {
    String label;
    String value;

    public TreeSetComparable(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public static void main(String[] args) {
        TreeSet<TreeSetComparable> treeSet = new TreeSet<>();
        treeSet.add(new TreeSetComparable("222", "say"));
        treeSet.add(new TreeSetComparable("333", "what"));
        treeSet.add(new TreeSetComparable("434", "????"));

    treeSet.forEach(m-> System.out.println(m));
    }

    public String toString() {
        return label + "|" + value;
    }

    public boolean equals(Object o) {
        TreeSetComparable other = (TreeSetComparable) o;
        return value.equalsIgnoreCase(other.value);
    }


    @Override
    public int compareTo(TreeSetComparable other) {
        return value.compareToIgnoreCase(other.value);
    }
}
