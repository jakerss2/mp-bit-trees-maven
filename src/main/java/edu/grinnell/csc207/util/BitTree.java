package edu.grinnell.csc207.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Trees intended to be used in storing mappings between fixed-length
 * sequences of bits and corresponding values.
 *
 * @author Jacob Bell
 */
public class BitTree {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /** The root of our bit tree. */
  BitTreeNode<String> root = null;

  /** The height of the tree (never read). */
  int size;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new BitTree with size n.
   *
   * @param n
   *  The supposed size, but can be different.
   */
  public BitTree(int n) {
    this.root = new BitTreeNodeInterior<>();
    this.size = n;
  } // BitTree(int)

  // +---------------+-----------------------------------------------
  // | Local helpers |
  // +---------------+

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   *
   * @param bits
   *  Determines the path of where the value goes
   * @param value
   *  Sets the node at the end of the bits path to the given value
   */
  public void set(String bits, String value) {
    BitTreeNode current = root;

    for (int i = 0; i < bits.length() - 1; i++) {
      char curBit = bits.charAt(i);
      if (curBit == '0') {
        if (current.getLeft() == null) {
          current.setLeft(new BitTreeNodeInterior());
        } // if
        current = current.getLeft();
      } else if (curBit == '1') {
        if (current.getRight() == null) {
          current.setRight(new BitTreeNodeInterior());
        } // if
        current = current.getRight();
      } else {
        throw new IndexOutOfBoundsException("Error: Invalid character " + curBit);
      } // if/else
    } // for


    char lastBit = bits.charAt(bits.length() - 1);
    if (lastBit == '0') {
      current.setLeft(new BitTreeNodeLeaf<String>(value));
    } else if (lastBit == '1') {
      current.setRight(new BitTreeNodeLeaf<String>(value));
    } else {
      throw new IndexOutOfBoundsException("Error: Invalid character " + lastBit);
    } // if/else
  } // set(String, String)

  /**
   * Find the value associated with
   * the given bits.
   *
   * @param bits
   *  The bits we are trying to find the value for
   * @return The string associated with the given bits
   */
  public String get(String bits) {
    BitTreeNode current = root;

    for (int i = 0; i < bits.length(); i++) {
      char curBit = bits.charAt(i);
      if (curBit == '0') {
        if (current.getLeft() == null) {
          throw new IndexOutOfBoundsException("Trouble translating because"
              + "No corresponding value");
        } // if
        current = current.getLeft();
      } else if (curBit == '1') {
        if (current.getRight() == null) {
          throw new IndexOutOfBoundsException("Trouble translating because"
              + "No corresponding value");
        } // if
        current = current.getRight();
      } else {
        throw new IndexOutOfBoundsException("Error: Invalid character " + curBit);
      } // if/else
    } // for
    try {
      return (String) current.getValue();
    } catch (Exception e) {
      return "Error";
    } // try/catch
  } // get(String, String)

  /**
   * Call our recursive function to
   * print our tree with the given pen.
   *
   * @param pen
   *  The place where we will print our tree
   */
  public void dump(PrintWriter pen) {
    dump(pen, this.root, "");
  } // dump(PrintWriter)

  /**
   * Store a series of lines in the
   * form of 'bits,values' into our tree.
   *
   * @param source
   *   The source of lines we will store
   */
  public void load(InputStream source) {
    try {
      BufferedReader read = new BufferedReader(new InputStreamReader(source));
      String line = read.readLine();
      while (line != null) {
        line = line.trim();
        String[] bitVal = line.split(",", 2);
        set(bitVal[0], bitVal[1]); // An eboard said we can assume all input is valid
        // I was going to check if the line splits properly or other issues
        line = read.readLine();
      } // while
      read.close();
    } catch (IOException e) {
      // We shouldn't get an exception
    } // try/catch
  } // load(InputStream)

  /**
   * Recursively add bits together
   * until we reach the end of the tree
   * and print the tree in bits,value form.
   *
   * @param pen
   *  The place where we will print our tree
   * @param bt
   *  The binary tree we are printing
   * @param bitsString
   *  The previous bits we have accumulated from recursing.
   */
  private void dump(PrintWriter pen, BitTreeNode bt, String bitsString) {
    if (bt instanceof BitTreeNodeLeaf) {
      pen.println(bitsString + "," + bt.getValue());
      return;
    } // if

    if ((bt.getLeft() != null && bt.getRight() != null)) {
      dump(pen, bt.getLeft(), bitsString + '0');
      dump(pen, bt.getRight(), bitsString + '1');
    } else if (bt.getLeft() != null) {
      dump(pen, bt.getLeft(), bitsString + '0');
    } else if (bt.getRight() != null) {
      dump(pen, bt.getRight(), bitsString + '1');
    } else {
      throw new IndexOutOfBoundsException("Ummm... how did I get here");
    } // else
  } // dump(PrinteWriter, BitTreeNode, String)
} // class BitTree
