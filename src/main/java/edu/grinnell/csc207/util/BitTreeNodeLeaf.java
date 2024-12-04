package edu.grinnell.csc207.util;

public class BitTreeNodeLeaf<T> implements BitTreeNode<T> {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /** Hold the value of this leaf */
  T value;

  // +-------------+-------------------------------------------------
  // | Constructor |
  // +-------------+

  public BitTreeNodeLeaf(T element) {
    this.value = element;
  }

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+


  /**
   * 
   * @param element the value we will set in its proper place in the tree
   */
  public void setValue (T element) {
    this.value = element;
  }

  /**
   * Get the value of the current node
   * @return value of current node
   */
  public T getValue() {
    return this.value;
  }

  /**
   * Get the child to the left
   * @return the left tree
   */
  public BitTreeNode<T> getLeft() {
    throw new UnsupportedOperationException("Leaves don't have anything.");
  }

  /**
   * Get the child to the right
   * @return the right tree
   */
  public BitTreeNode<T> getRight() { 
    throw new UnsupportedOperationException("Leaves don't have anything.");
  }

  /**
   * Set the child to the left
   * @param left
   */
  public void setLeft(BitTreeNode<T> left) {
    throw new UnsupportedOperationException("Leaves don't have childs");
  }

  /**
   * Set the child to the right
   * @param right
   */
  public void setRight(BitTreeNode<T> right) {
    throw new UnsupportedOperationException("Leaves don't have anything.");
  }
}
