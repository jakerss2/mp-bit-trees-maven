package edu.grinnell.csc207.util;

/**
 *
 * An implementation of my BitTreeNode.
 * @author Jake Bell
 *
 * @param <T>
 *  Type of value the BitTreeNode will hold.
 */
public class BitTreeNodeInterior<T> implements BitTreeNode<T> {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /** Tree to the left. */
  private BitTreeNode<T> left;

  /** Tree to the right. */
  private BitTreeNode<T> right;

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Set the value for the node.
   *
   * @param element
   *  the value we will set in its proper place in the tree.
   */
  public void setValue(T element) {
    throw new UnsupportedOperationException("Interior Node doesn't have values");
  } // setValue()

  /**
   * Get the value of the current node.
   *
   * @return
   *  Value of current node.
   */
  public T getValue() {
    throw new UnsupportedOperationException("Interior Node doesn't have values");
  } // getValue()

  /**
   * Get the child to the left.
   *
   * @return
   *  The left tree.
   */
  public BitTreeNode<T> getLeft() {
    return left;
  } // getLeft()

  /**
   * Get the child to the right.
   *
   * @return
   *  The right tree.
   */
  public BitTreeNode<T> getRight() {
    return right;
  } // getRight()

  /**
   * Set the child to the left.
   *
   * @param left
   *  The tree that goes to the left.
   */
  public void setLeft(BitTreeNode<T> left) {
    this.left = left;
  } // setLeft(BitTreeNode<T>)

  /**
   * Set the child to the right.
   *
   * @param right
   *  The tree that goes to the right.
   */
  public void setRight(BitTreeNode<T> right) {
    this.right = right;
  } // setRight(BitTreeNode<T>)
} // BitTreeNodeInterior<T>
