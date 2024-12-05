package edu.grinnell.csc207.main;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.BrailleAsciiTables;

/**
 *
 */
public class BrailleASCII {
  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Main file for translating braille.
   *
   * @param args
   *  The command line arguments
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    if (args.length != 2) {
      pen.println("Incorrect arguement size");
      pen.close();
      return;
    } // if

    if (args[0].equals("braille")) {
      String str = "";
      String translation = "";
      for (char ch : args[1].toCharArray()) {
        str = BrailleAsciiTables.toBraille(ch);
        if (str.equals("Error")) {
          pen.print(translation + " Trouble translating because No corresponding value");
          pen.close();
          return;
        } // if
        translation += str;
      } // if
      pen.println(translation);
    } else if (args[0].equals("ascii")) {
      pen.println(BrailleAsciiTables.toAscii(args[1]));
    } else if (args[0].equals("unicode")) {
      String brail = "";
      String uni = "";
      for (char ch : args[1].toCharArray()) {
        if (ch == ' ') {
          uni += " ";
          continue;
        } // if
        brail = BrailleAsciiTables.toBraille(ch);
        uni += BrailleAsciiTables.toUnicode(brail);
      } // for
      pen.println(uni);
    } // else/if
    pen.close();
  } // main(String[])
} // class BrailleASCII
