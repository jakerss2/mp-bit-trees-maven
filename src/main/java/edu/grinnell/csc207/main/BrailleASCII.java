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
   *
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
      if (args.length != 2) {
        pen.println("Incorrect arguement size");
        pen.close();
        return;
      }

      if (args[0].equals("braille")) {
        String str = "";
        for (char ch : args[1].toCharArray()) {
          str += BrailleAsciiTables.toBraille(ch);
        }
        pen.println(str);
      } else if (args[0].equals("ascii")) {
        pen.println(BrailleAsciiTables.toAscii(args[1]));
      } else if (args[0].equals("unicode")) {
        String brail = "";
        for (char ch : args[1].toCharArray()) {
          brail += BrailleAsciiTables.toBraille(ch);
        }
        pen.println(BrailleAsciiTables.toUnicode(brail));
      }
    pen.close();
  } // main(String[])
} // class BrailleASCII
