package SWexpert;

// 중위 순회
import java.util.*;
public class Swea7985 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int K;
	static int N;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			K = sc.nextInt();
			
			N = (int)Math.pow(2, K) - 1;
			
			Tree tree = new Tree(N);
			
			tree.addParent(sc.nextInt());
		}

	}
}

class Tree{
	static Scanner sc = new Scanner(System.in);
	
	class TreeNode{
		int parent;
		int[] child;
		
		TreeNode(int parent){
			this.parent = parent;
			for(int i=0;i<2;i++) {
				child[i] = -1;
			}
		}
	}
	
	TreeNode[] treenode;
	int nodeNum;
	Tree(int nodeNum){
		this.nodeNum = nodeNum;
		treenode = new TreeNode[nodeNum+1];
		
		for(int i=0;i<=nodeNum;i++) {
			treenode[i] = new TreeNode(-1);
		}
	}
	public void addParent(int node) {
		if()
		
	}
	
}

