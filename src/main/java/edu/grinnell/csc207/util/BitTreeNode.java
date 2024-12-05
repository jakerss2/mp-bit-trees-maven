package edu.grinnell.csc207.util;

/**
 *
 * An interface of my BitTreeNodes.
 * @author Jake Bell
 *
 * @param <T>
 *  Type of value the BitTreeNode will hold.
 */
public interface BitTreeNode<T> {
  /**
   * Set the value for the node.
   *
   * @param element
   *  the value we will set in its proper place in the tree.
   */
  void setValue(T element);

  /**
   * Get the value of the current node.
   *
   * @return
   *  Value of current node.
   */
  T getValue();

  /**
   * Get the child to the left.
   *
   * @return
   *  The left tree.
   */
  BitTreeNode<T> getLeft();

  /**
   * Get the child to the right.
   *
   * @return
   *  The right tree.
   */
  BitTreeNode<T> getRight();

  /**
   * Set the child to the left.
   *
   * @param left
   *  The tree that goes to the left.
   */
  void setLeft(BitTreeNode<T> left);

  /**
   * Set the child to the right.
   *
   * @param right
   *  The tree that goes to the right.
   */
  void setRight(BitTreeNode<T> right);
} // interface BitTreeNode<T>
