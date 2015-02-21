package it.tech.skal.algorithms.linkedlist;

public class Node {

	private int nodeValue;

	public int getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(int nodeValue) {
		this.nodeValue = nodeValue;
	}

	public Node linkReference;

	public Node getNextNode() {
		return linkReference;
	}

	public void setNextNode(Node linkReference) {
		this.linkReference = linkReference;
	}

	public Node(int nodeVal) {
		this.nodeValue = nodeVal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new Integer(nodeValue).toString();
	}

}
