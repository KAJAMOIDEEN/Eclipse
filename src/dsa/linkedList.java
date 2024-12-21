package dsa;

import java.util.LinkedList;

public class linkedList {

	static Node countArr(int arr[]) {
		int len = arr.length;
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 0; i < len; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };

		// Node y = new Node(arr[4]);
		// System.out.println(y.next);
		Node head = countArr(arr);

		Node temp = head;
		System.out.println(temp.toString());
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

}
