package edu.grinnell.csc207.util;

public class BitTreeNodeInterior<T> implements BitTreeNode<T> {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /** Tree to the left */
  private BitTreeNode<T> left;

  /** Tree to the right */
  private BitTreeNode<T> right;

  /**
   * 
   * @param element the value we will set in its proper place in the tree
   */
  public void setValue (T element) {
    throw new UnsupportedOperationException("Interior Node doesn't have values");
  } // setValue()

  /**
   * Get the value of the current node
   * @return value of current node
   */
  public T getValue() {
    throw new UnsupportedOperationException("Interior Node doesn't have values");
  } // getValue()

  /**
   * Get the child to the left
   * @return the left tree
   */
  public BitTreeNode<T> getLeft() {
    return left;
  } // getLeft()

  /**
   * Get the child to the right
   * @return the right tree
   */
  public BitTreeNode<T> getRight() {
    return right;
  } // getRight()

  /**
   * Set the child to the left
   * @param left
   */
  public void setLeft(BitTreeNode<T> left) {
    this.left = left;
  }

  /**
   * Set the child to the right
   * @param right
   */
  public void setRight(BitTreeNode<T> right) {
    this.right = right;
  }
}
