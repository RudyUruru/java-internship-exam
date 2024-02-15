package ru.liga.ppr.exam.task_6_treesum;

public class Task6TreeSum {

    public int treeSum(SimpleTreeNode node) {
        int sum = node.value();
        if (node.right() != null)
            sum += treeSum(node.right());
        if (node.left() != null)
            sum += treeSum(node.left());
        return sum;
    }
}
