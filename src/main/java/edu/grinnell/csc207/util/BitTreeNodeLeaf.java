package edu.grinnell.csc207.util;

/**
 *
 * An implementation of my BitTreeNode.
 * @author Jake Bell
 *
 * @param <T>
 *  Type of value the BitTreeNode will hold.
 */
public class BitTreeNodeLeaf<T> implements BitTreeNode<T> {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /** Hold the value of this leaf. */
  T value;

  // +-------------+-------------------------------------------------
  // | Constructor |
  // +-------------+

  /**
   * Make a new node with value as element.
   *
   * @param element
   *  The element in which we will initialize this node to
   */
  public BitTreeNodeLeaf(T element) {
    this.value = element;
  } // BitTreeNodeLeaf(T)

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
    this.value = element;
  } // setValue()

  /**
   * Get the value of the current node.
   *
   * @return
   *  Value of current node.
   */
  public T getValue() {
    return this.value;
  } // getValue()

  /**
   * Get the child to the left.
   *
   * @return
   *  The left tree.
   */
  public BitTreeNode<T> getLeft() {
    throw new UnsupportedOperationException("Leaves don't have anything.");
  } // getLeft(BitTreeNode<T>)

  /**
   * Get the child to the right.
   *
   * @return
   *  The right tree.
   */
  public BitTreeNode<T> getRight() {
    throw new UnsupportedOperationException("Leaves don't have anything.");
  } // getRight(BitTreeNode<T>)

  /**
   * Set the child to the left.
   *
   * @param left
   *  The tree that goes to the left.
   */
  public void setLeft(BitTreeNode<T> left) {
    throw new UnsupportedOperationException("Leaves don't have childs");
  } // setLeft(BitTreeNode<T>)

  /**
   * Set the child to the right.
   *
   * @param right
   *  The tree that goes to the right.
   */
  public void setRight(BitTreeNode<T> right) {
    throw new UnsupportedOperationException("Leaves don't have childs.");
  } // setRight(BitTreeNode<T>)
} // BitTrreNodeLeaf<T>
