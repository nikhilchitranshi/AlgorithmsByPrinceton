package com.learning.princeton.dynamicconnectivity;

public class QuickFind {
	private int[] id;
	private int count;
	
	//initialize the id array
	QuickFind(int n){
		id = new int[n];
		for(int i=0; i<n; i++) {
			id[i] = i;
		}		
	}
	
	public static void main(String[] args) {
		QuickFind quickFind = new QuickFind(10);
		quickFind.union(4, 3);
		quickFind.union(3, 8);
		quickFind.union(6, 5);
		quickFind.union(9, 4);
		quickFind.union(2, 1);
		quickFind.union(8, 9);
		quickFind.union(5, 0);
		quickFind.union(7, 2);
		quickFind.union(6, 1);
		quickFind.union(5, 9);
	}
	
	private boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	private void union(int p, int q) {
		
		int pId = id[p];
		int qId = id[q];
		
		if(pId == qId) return;
		
		for(int i=0; i<id.length; i++) {
			if(id[i] == pId) id[i] = qId; 
		}
		
		for(int n : id) {
			System.out.print(n+", ");
		}
		System.out.println();
	}

}
