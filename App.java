package main;

import java.util.ArrayList;

import tom.Node;

public class App {

	public static void main(String[] args) {

		Node root = new Node(1, new ArrayList<Node>());

		Node second = new Node(2, new ArrayList<Node>());
		Node third = new Node(3, new ArrayList<Node>());

		root.appendChild(second);
		root.appendChild(third);

		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eighth = new Node(8);
		Node ninth = new Node(9);

		second.appendChild(fourth);
		second.appendChild(fifth);
		second.appendChild(sixth);

		third.appendChild(seventh);
		third.appendChild(eighth);
		third.appendChild(ninth);

		//                       -------------|root(1)|------------
		//                       |                                |
		//                       |                                |
		//             -------|second(2)|----           -------|third(3)|---------
		//            |          |          |           |            |           | 
		//            |          |          |           |            |           | 
		//      |fourth(4)| |fifth(5)| |sixth(6)|   |seventh(7)| |eighth(8)| |ninth(9)|

		walkTheTree(root);
		System.out.println();
		
		second.removeChild(fourth);
		second.removeChild(sixth);
		walkTheTree(root);
		System.out.println();
		
		third.swapChild(seventh, ninth);
		walkTheTree(root);

	}

	public static void walkTheTree(Node start) {
		System.out.println(start.getValue());
		if (start.getChildren() != null) {
			for (int i = 0; i < start.getChildren().size(); i++) {
				walkTheTree(start.getChild(i));
			}
		}
	}
	// why is the node 1 called ROOT ? it is the first node for the whole tree

	// what is the 2nd node to the ROOT? the left subtree

	// what is the 2nd node to the node 4,5 and 6 ? parent node, root if we consider only subtree

	// what is the depth of this tree? 2

}
