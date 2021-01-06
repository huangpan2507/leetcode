package zuochengyun_Test;
import java.util.stream.IntStream;

import zuochengyun_book.Node_part_P41;


public class Node_part_P41_Test {
	public static void main(String[] args) {
		Node_part_P41 node = new Node_part_P41(0);
		Node_part_P41 node1 = new Node_part_P41(1);
		Node_part_P41 node2 = new Node_part_P41(4);
		IntStream.range(2,5).forEach(i->node1.append(new Node_part_P41(i)));
		IntStream.range(4,8).forEach(j->node2.append(new Node_part_P41(j)));
		node1.show();
		System.out.println("++++++++");
		node.printCommonPart(node1, node2);
		node1.append(node2);
		node1.show();
	}

}
