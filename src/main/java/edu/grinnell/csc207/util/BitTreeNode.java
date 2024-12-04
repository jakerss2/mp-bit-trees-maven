package edu.grinnell.csc207.util;

public interface BitTreeNode<T> {
  /**
   * 
   * @param element 
   *  the value we will set in its proper place in the tree
   */
  void setValue (T element);

  /**
   * Get the value of the current node
   * @return value of current node
   */
  T getValue();

  /**
   * Get the child to the left
   * @return the left tree
   */
  BitTreeNode<T> getLeft();

  /**
   * Get the child to the right
   * @return the right tree
   */
  BitTreeNode<T> getRight();

  /**
   * Set the child to the left
   * @param left
   *  Tree that goes to the left
   */
  void setLeft(BitTreeNode<T> left);

  /**
   * Set the child to the right
   * @param right
   *  Tree that goes to the right
   */
  void setRight(BitTreeNode<T> right);
} // interface BitTreeNode<T>
