package com.learning.princeton.dynamicconnectivity;

public class QuickUnion {
	int parent[];
	
	public QuickUnion(int n) {
		parent = new int[n];
		for(int i=0; i<n; i++) {
			parent[i] = i;
		}
	}
	
	public static void main(String[] args) {
		
		
		QuickUnion quickunion = new QuickUnion(10);
		quickunion.union(4, 3);
		quickunion.union(3, 8);
		quickunion.union(6, 5);
		quickunion.union(9, 4);
		quickunion.union(2, 1);
		quickunion.union(8, 9);
		quickunion.union(5, 0);
		quickunion.union(7, 2);
		quickunion.union(6, 1);
		quickunion.union(5, 9);
	}
	
	private int root(int p) {
		while(p != parent[p]) {
			p = parent[p];
		}
		return p;		
	}
	
	private void union(int p, int q) {
		int pRoot = root(p);
		int qRoot = root(q);
		
		if(pRoot == qRoot)
			return;
		
		parent[pRoot] = qRoot;
		
		for(int n : parent) {
			System.out.print(n+", ");
		}
		System.out.println();
	}

}
