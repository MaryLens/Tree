package tom;

import java.util.List;

public class Node {

	private int value;
	private List<Node> children;

	public Node(int value, List<Node> children) {
		setValue(value);
		setChildren(children);
	}

	public Node(int value) {
		setValue(value);
	}

	public Node() {
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public void prependChild(Node child) {
		children.add(0, child);
	}

	public void appendChild(Node child) {
		children.add(child);
	}

	public void insertChild(int index, Node child) {
		children.add(index, child);
	}

	public void removeChild(Node child) {
		children.remove(child);
	}

	public void removeChild(int index) {
		children.remove(index);
	}

	public void swapChild(Node oldChild, Node newChild) {
		Node oldChildValue = oldChild;
		int newChildInd = children.indexOf(newChild);
		children.set(children.indexOf(oldChild), newChild);
		children.set(newChildInd, oldChildValue);
	}

	public Node getChild(int index) {
		return children.get(index);
	}

	public Node getFirstChild() {
		return children.get(0);
	}

	public Node getLastChild() {
		return children.get(children.size() - 1);
	}
}
