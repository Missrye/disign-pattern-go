package com.deepocean.algorithm;

public class BinaryTreeDemo {
    // 二叉树的下一个节点
    BinaryTreeNode getNext(BinaryTreeNode root, BinaryTreeNode target) {
        // parameters check
        if (root == null || target == null) {
            return null;
        }
        BinaryTreeNode pNext = null;
        // 1、节点有右子树
        if (target.right != null) {
            // pRight: 右子树根结点
           BinaryTreeNode pRight = target.right;
           while (pRight.left != null) {
               pRight = pRight.left;
           }
           pNext = pRight;
        } else if (target.parent != null) {
            BinaryTreeNode pCurrent = target;
            BinaryTreeNode pParent = target.parent;
            // 2、节点没有右子树，并且它是其父节点的右子节点（下一个节点为：存在父级节点的左节点，则左节点的父节点为下一个节点）
            while (pParent != null && pCurrent == pParent.right) {
                pCurrent = pParent;
                pParent = pParent.parent;
            }
            // 3、节点没有右子树，并且它是其父节点的左子节点（下一个节点为：其父节点）
            pNext = pParent;
        }

        return pNext;
    }

}

class BinaryTreeNode {
    String val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode parent;

    public BinaryTreeNode(String val) {
        this.val = val;
    }
}
