package com.learning.princeton.dynamicconnectivity;

public class WeightedQuickUnion {
	int parent[];
	int size[];
	
	WeightedQuickUnion(int n){
		parent = new int[n];
		size = new int[n];
		
		for(int i=0; i<n; i++) {
			parent[i] = i;
			size[i]=1;
		}
	}
	
	public static void main(String[] args) {
		WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(10);
		weightedQuickUnion.union(4, 3);
		weightedQuickUnion.union(3, 8);
		weightedQuickUnion.union(6, 5);
		weightedQuickUnion.union(9, 4);
		weightedQuickUnion.union(2, 1);
		weightedQuickUnion.union(5, 0);
		weightedQuickUnion.union(7, 2);
		weightedQuickUnion.union(6, 1);
		weightedQuickUnion.union(5, 9);
	}
	
	private int root(int p) {
		while(p!= parent[p]) {
			p=parent[p];
		}
		return p;
	}
	
	
	private void union(int p, int q) {
		int pRoot = root(p);
		int qRoot = root(q);
		
		if(size[pRoot] > size[qRoot]) {
			parent[qRoot] = pRoot;
			size[pRoot] += size[qRoot];
			
		}else {
			parent[pRoot] =qRoot;
			size[qRoot] += size[pRoot];
		}
		
		System.out.print("Parent Array : ");
		displayArray(parent);
		System.out.println();
		System.out.print("Size Array   : ");
		displayArray(size);
		System.out.println();
		System.out.println();
	}
	
	private void displayArray(int[] arr){
		for(int i: arr) {
			System.out.print(i+",");
		}
	}

}
