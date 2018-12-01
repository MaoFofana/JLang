/* The following code was generated by JFlex 1.7.0 */
//It was then modified by the JLang authors to comply with our language specification
package java_cup;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.Error;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Lexer.jflex</tt>
 */
public class Lexer extends sym implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CODESEG = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\7\1\3\1\2\1\52\1\53\1\1\16\7\4\0\1\3\3\0"+
    "\1\6\1\21\4\0\1\5\1\0\1\12\1\0\1\13\1\4\12\7"+
    "\1\17\1\11\1\27\1\20\1\26\1\10\1\0\32\6\1\15\1\0"+
    "\1\16\1\0\1\6\1\0\1\31\1\6\1\25\1\42\1\24\1\46"+
    "\1\33\1\45\1\34\1\6\1\32\1\40\1\35\1\43\1\36\1\22"+
    "\1\6\1\23\1\41\1\37\1\50\1\6\1\44\1\47\2\6\1\30"+
    "\1\14\1\51\1\0\6\7\1\54\32\7\2\0\4\6\4\0\1\6"+
    "\2\0\1\7\7\0\1\6\4\0\1\6\5\0\27\6\1\0\37\6"+
    "\1\0\u01ca\6\4\0\14\6\16\0\5\6\7\0\1\6\1\0\1\6"+
    "\21\0\160\7\5\6\1\0\2\6\2\0\4\6\10\0\1\6\1\0"+
    "\3\6\1\0\1\6\1\0\24\6\1\0\123\6\1\0\213\6\1\0"+
    "\5\7\2\0\236\6\11\0\46\6\2\0\1\6\7\0\47\6\7\0"+
    "\1\6\1\0\55\7\1\0\1\7\1\0\2\7\1\0\2\7\1\0"+
    "\1\7\10\0\33\6\5\0\3\6\15\0\5\7\6\0\1\6\4\0"+
    "\13\7\5\0\53\6\37\7\4\0\2\6\1\7\143\6\1\0\1\6"+
    "\10\7\1\0\6\7\2\6\2\7\1\0\4\7\2\6\12\7\3\6"+
    "\2\0\1\6\17\0\1\7\1\6\1\7\36\6\33\7\2\0\131\6"+
    "\13\7\1\6\16\0\12\7\41\6\11\7\2\6\4\0\1\6\5\0"+
    "\26\6\4\7\1\6\11\7\1\6\3\7\1\6\5\7\22\0\31\6"+
    "\3\7\104\0\1\6\1\0\13\6\67\0\33\7\1\0\4\7\66\6"+
    "\3\7\1\6\22\7\1\6\7\7\12\6\2\7\2\0\12\7\1\0"+
    "\7\6\1\0\7\6\1\0\3\7\1\0\10\6\2\0\2\6\2\0"+
    "\26\6\1\0\7\6\1\0\1\6\3\0\4\6\2\0\1\7\1\6"+
    "\7\7\2\0\2\7\2\0\3\7\1\6\10\0\1\7\4\0\2\6"+
    "\1\0\3\6\2\7\2\0\12\7\4\6\7\0\1\6\5\0\3\7"+
    "\1\0\6\6\4\0\2\6\2\0\26\6\1\0\7\6\1\0\2\6"+
    "\1\0\2\6\1\0\2\6\2\0\1\7\1\0\5\7\4\0\2\7"+
    "\2\0\3\7\3\0\1\7\7\0\4\6\1\0\1\6\7\0\14\7"+
    "\3\6\1\7\13\0\3\7\1\0\11\6\1\0\3\6\1\0\26\6"+
    "\1\0\7\6\1\0\2\6\1\0\5\6\2\0\1\7\1\6\10\7"+
    "\1\0\3\7\1\0\3\7\2\0\1\6\17\0\2\6\2\7\2\0"+
    "\12\7\1\0\1\6\17\0\3\7\1\0\10\6\2\0\2\6\2\0"+
    "\26\6\1\0\7\6\1\0\2\6\1\0\5\6\2\0\1\7\1\6"+
    "\7\7\2\0\2\7\2\0\3\7\10\0\2\7\4\0\2\6\1\0"+
    "\3\6\2\7\2\0\12\7\1\0\1\6\20\0\1\7\1\6\1\0"+
    "\6\6\3\0\3\6\1\0\4\6\3\0\2\6\1\0\1\6\1\0"+
    "\2\6\3\0\2\6\3\0\3\6\3\0\14\6\4\0\5\7\3\0"+
    "\3\7\1\0\4\7\2\0\1\6\6\0\1\7\16\0\12\7\11\0"+
    "\1\6\7\0\3\7\1\0\10\6\1\0\3\6\1\0\27\6\1\0"+
    "\12\6\1\0\5\6\3\0\1\6\7\7\1\0\3\7\1\0\4\7"+
    "\7\0\2\7\1\0\2\6\6\0\2\6\2\7\2\0\12\7\22\0"+
    "\2\7\1\0\10\6\1\0\3\6\1\0\27\6\1\0\12\6\1\0"+
    "\5\6\2\0\1\7\1\6\7\7\1\0\3\7\1\0\4\7\7\0"+
    "\2\7\7\0\1\6\1\0\2\6\2\7\2\0\12\7\1\0\2\6"+
    "\17\0\2\7\1\0\10\6\1\0\3\6\1\0\51\6\2\0\1\6"+
    "\7\7\1\0\3\7\1\0\4\7\1\6\10\0\1\7\10\0\2\6"+
    "\2\7\2\0\12\7\12\0\6\6\2\0\2\7\1\0\22\6\3\0"+
    "\30\6\1\0\11\6\1\0\1\6\2\0\7\6\3\0\1\7\4\0"+
    "\6\7\1\0\1\7\1\0\10\7\22\0\2\7\15\0\60\6\1\7"+
    "\2\6\7\7\4\0\10\6\10\7\1\0\12\7\47\0\2\6\1\0"+
    "\1\6\2\0\2\6\1\0\1\6\2\0\1\6\6\0\4\6\1\0"+
    "\7\6\1\0\3\6\1\0\1\6\1\0\1\6\2\0\2\6\1\0"+
    "\4\6\1\7\2\6\6\7\1\0\2\7\1\6\2\0\5\6\1\0"+
    "\1\6\1\0\6\7\2\0\12\7\2\0\4\6\40\0\1\6\27\0"+
    "\2\7\6\0\12\7\13\0\1\7\1\0\1\7\1\0\1\7\4\0"+
    "\2\7\10\6\1\0\44\6\4\0\24\7\1\0\2\7\5\6\13\7"+
    "\1\0\44\7\11\0\1\7\71\0\53\6\24\7\1\6\12\7\6\0"+
    "\6\6\4\7\4\6\3\7\1\6\3\7\2\6\7\7\3\6\4\7"+
    "\15\6\14\7\1\6\17\7\2\0\46\6\1\0\1\6\5\0\1\6"+
    "\2\0\53\6\1\0\u014d\6\1\0\4\6\2\0\7\6\1\0\1\6"+
    "\1\0\4\6\2\0\51\6\1\0\4\6\2\0\41\6\1\0\4\6"+
    "\2\0\7\6\1\0\1\6\1\0\4\6\2\0\17\6\1\0\71\6"+
    "\1\0\4\6\2\0\103\6\2\0\3\7\40\0\20\6\20\0\125\6"+
    "\14\0\u026c\6\2\0\21\6\1\0\32\6\5\0\113\6\3\0\3\6"+
    "\17\0\15\6\1\0\4\6\3\7\13\0\22\6\3\7\13\0\22\6"+
    "\2\7\14\0\15\6\1\0\3\6\1\0\2\7\14\0\64\6\40\7"+
    "\3\0\1\6\3\0\2\6\1\7\2\0\12\7\41\0\3\7\2\0"+
    "\12\7\6\0\130\6\10\0\51\6\1\7\1\6\5\0\106\6\12\0"+
    "\35\6\3\0\14\7\4\0\14\7\12\0\12\7\36\6\2\0\5\6"+
    "\13\0\54\6\4\0\21\7\7\6\2\7\6\0\12\7\46\0\27\6"+
    "\5\7\4\0\65\6\12\7\1\0\35\7\2\0\13\7\6\0\12\7"+
    "\15\0\1\6\130\0\5\7\57\6\21\7\7\6\4\0\12\7\21\0"+
    "\11\7\14\0\3\7\36\6\15\7\2\6\12\7\54\6\16\7\14\0"+
    "\44\6\24\7\10\0\12\7\3\0\3\6\12\7\44\6\122\0\3\7"+
    "\1\0\25\7\4\6\1\7\4\6\3\7\2\6\11\0\300\6\47\7"+
    "\25\0\4\7\u0116\6\2\0\6\6\2\0\46\6\2\0\6\6\2\0"+
    "\10\6\1\0\1\6\1\0\1\6\1\0\1\6\1\0\37\6\2\0"+
    "\65\6\1\0\7\6\1\0\1\6\3\0\3\6\1\0\7\6\3\0"+
    "\4\6\2\0\6\6\4\0\15\6\5\0\3\6\1\0\7\6\16\0"+
    "\5\7\30\0\1\52\1\52\5\7\20\0\2\6\23\0\1\6\13\0"+
    "\5\7\5\0\6\7\1\0\1\6\15\0\1\6\20\0\15\6\3\0"+
    "\33\6\25\0\15\7\4\0\1\7\3\0\14\7\21\0\1\6\4\0"+
    "\1\6\2\0\12\6\1\0\1\6\3\0\5\6\6\0\1\6\1\0"+
    "\1\6\1\0\1\6\1\0\4\6\1\0\13\6\2\0\4\6\5\0"+
    "\5\6\4\0\1\6\21\0\51\6\u0a77\0\57\6\1\0\57\6\1\0"+
    "\205\6\6\0\4\6\3\7\2\6\14\0\46\6\1\0\1\6\5\0"+
    "\1\6\2\0\70\6\7\0\1\6\17\0\1\7\27\6\11\0\7\6"+
    "\1\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6"+
    "\1\0\7\6\1\0\7\6\1\0\40\7\57\0\1\6\u01d5\0\3\6"+
    "\31\0\11\6\6\7\1\0\5\6\2\0\5\6\4\0\126\6\2\0"+
    "\2\7\2\0\3\6\1\0\132\6\1\0\4\6\5\0\51\6\3\0"+
    "\136\6\21\0\33\6\65\0\20\6\u0200\0\u19b6\6\112\0\u51cd\6\63\0"+
    "\u048d\6\103\0\56\6\2\0\u010d\6\3\0\20\6\12\7\2\6\24\0"+
    "\57\6\1\7\4\0\12\7\1\0\31\6\7\0\1\7\120\6\2\7"+
    "\45\0\11\6\2\0\147\6\2\0\4\6\1\0\4\6\14\0\13\6"+
    "\115\0\12\6\1\7\3\6\1\7\4\6\1\7\27\6\5\7\20\0"+
    "\1\6\7\0\64\6\14\0\2\7\62\6\21\7\13\0\12\7\6\0"+
    "\22\7\6\6\3\0\1\6\4\0\12\7\34\6\10\7\2\0\27\6"+
    "\15\7\14\0\35\6\3\0\4\7\57\6\16\7\16\0\1\6\12\7"+
    "\46\0\51\6\16\7\11\0\3\6\1\7\10\6\2\7\2\0\12\7"+
    "\6\0\27\6\3\0\1\6\1\7\4\0\60\6\1\7\1\6\3\7"+
    "\2\6\2\7\5\6\2\7\1\6\1\7\1\6\30\0\3\6\2\0"+
    "\13\6\5\7\2\0\3\6\2\7\12\0\6\6\2\0\6\6\2\0"+
    "\6\6\11\0\7\6\1\0\7\6\221\0\43\6\10\7\1\0\2\7"+
    "\2\0\12\7\6\0\u2ba4\6\14\0\27\6\4\0\61\6\u2104\0\u016e\6"+
    "\2\0\152\6\46\0\7\6\14\0\5\6\5\0\1\6\1\7\12\6"+
    "\1\0\15\6\1\0\5\6\1\0\1\6\1\0\2\6\1\0\2\6"+
    "\1\0\154\6\41\0\u016b\6\22\0\100\6\2\0\66\6\50\0\15\6"+
    "\3\0\20\7\20\0\7\7\14\0\2\6\30\0\3\6\31\0\1\6"+
    "\6\0\5\6\1\0\207\6\2\0\1\7\4\0\1\6\13\0\12\7"+
    "\7\0\32\6\4\0\1\6\1\0\32\6\13\0\131\6\3\0\6\6"+
    "\2\0\6\6\2\0\6\6\2\0\3\6\3\0\2\6\3\0\2\6"+
    "\22\0\3\7\4\0\14\6\1\0\32\6\1\0\23\6\1\0\2\6"+
    "\1\0\17\6\2\0\16\6\42\0\173\6\105\0\65\6\210\0\1\7"+
    "\202\0\35\6\3\0\61\6\57\0\37\6\21\0\33\6\65\0\36\6"+
    "\2\0\44\6\4\0\10\6\1\0\5\6\52\0\236\6\2\0\12\7"+
    "\u0356\0\6\6\2\0\1\6\1\0\54\6\1\0\2\6\3\0\1\6"+
    "\2\0\27\6\252\0\26\6\12\0\32\6\106\0\70\6\6\0\2\6"+
    "\100\0\1\6\3\7\1\0\2\7\5\0\4\7\4\6\1\0\3\6"+
    "\1\0\33\6\4\0\3\7\4\0\1\7\40\0\35\6\203\0\66\6"+
    "\12\0\26\6\12\0\23\6\215\0\111\6\u03b7\0\3\7\65\6\17\7"+
    "\37\0\12\7\20\0\3\7\55\6\13\7\2\0\1\7\22\0\31\6"+
    "\7\0\12\7\6\0\3\7\44\6\16\7\1\0\12\7\100\0\3\7"+
    "\60\6\16\7\4\6\13\0\12\7\u04a6\0\53\6\15\7\10\0\12\7"+
    "\u0936\0\u036f\6\221\0\143\6\u0b9d\0\u042f\6\u33d1\0\u0239\6\u04c7\0\105\6"+
    "\13\0\1\6\56\7\20\0\4\7\15\6\u4060\0\2\6\u2163\0\5\7"+
    "\3\0\26\7\2\0\7\7\36\0\4\7\224\0\3\7\u01bb\0\125\6"+
    "\1\0\107\6\1\0\2\6\2\0\1\6\2\0\2\6\2\0\4\6"+
    "\1\0\14\6\1\0\1\6\1\0\7\6\1\0\101\6\1\0\4\6"+
    "\2\0\10\6\1\0\7\6\1\0\34\6\1\0\4\6\1\0\5\6"+
    "\1\0\1\6\3\0\7\6\1\0\u0154\6\2\0\31\6\1\0\31\6"+
    "\1\0\37\6\1\0\31\6\1\0\37\6\1\0\31\6\1\0\37\6"+
    "\1\0\31\6\1\0\37\6\1\0\31\6\1\0\10\6\2\0\62\7"+
    "\u1600\0\4\6\1\0\33\6\1\0\2\6\1\0\1\6\2\0\1\6"+
    "\1\0\12\6\1\0\4\6\1\0\1\6\1\0\1\6\6\0\1\6"+
    "\4\0\1\6\1\0\1\6\1\0\1\6\1\0\3\6\1\0\2\6"+
    "\1\0\1\6\2\0\1\6\1\0\1\6\1\0\1\6\1\0\1\6"+
    "\1\0\1\6\1\0\2\6\1\0\1\6\2\0\4\6\1\0\7\6"+
    "\1\0\4\6\1\0\4\6\1\0\1\6\1\0\12\6\1\0\21\6"+
    "\5\0\3\6\1\0\5\6\1\0\21\6\u1144\0\ua6d7\6\51\0\u1035\6"+
    "\13\0\336\6\u3fe2\0\u021e\6\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\7\36\0\140\7\200\0\360\7\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\1\4\4"+
    "\1\15\1\16\1\1\7\4\2\17\4\0\6\4\1\20"+
    "\12\4\1\21\1\0\1\22\1\0\17\4\1\23\1\4"+
    "\1\0\5\4\1\24\3\4\1\25\1\4\1\26\1\27"+
    "\4\4\1\30\1\31\3\4\1\32\1\4\1\33\3\4"+
    "\1\34\1\35\3\4\1\36\2\4\1\37\1\40\4\4"+
    "\1\41\1\42\4\4\1\43\1\44\3\4\1\45\1\4"+
    "\1\46";
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static int [] zzUnpackAction() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\132\0\264\0\132\0\341"+
    "\0\132\0\132\0\132\0\132\0\132\0\132\0\132\0\u010e"+
    "\0\u013b\0\u0168\0\u0195\0\u01c2\0\u01ef\0\132\0\132\0\u021c"+
    "\0\u0249\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357\0\132"+
    "\0\u0384\0\u03b1\0\u03de\0\u040b\0\u0438\0\u0465\0\u0492\0\u04bf"+
    "\0\u04ec\0\u0519\0\u0546\0\132\0\u0573\0\u05a0\0\u05cd\0\u05fa"+
    "\0\u0627\0\u0654\0\u0681\0\u06ae\0\u06db\0\u0708\0\132\0\u0735"+
    "\0\132\0\u0762\0\u078f\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870"+
    "\0\u089d\0\u08ca\0\u08f7\0\u0924\0\u0951\0\u097e\0\u09ab\0\u09d8"+
    "\0\u0a05\0\u0a32\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40"+
    "\0\u0b6d\0\341\0\u0b9a\0\u0bc7\0\u0bf4\0\341\0\u0c21\0\341"+
    "\0\341\0\u0c4e\0\u0c7b\0\u0ca8\0\u0cd5\0\341\0\132\0\u0d02"+
    "\0\u0d2f\0\u0d5c\0\341\0\u0d89\0\341\0\u0db6\0\u0de3\0\u0e10"+
    "\0\341\0\341\0\u0e3d\0\u0e6a\0\u0e97\0\341\0\u0ec4\0\u0ef1"+
    "\0\341\0\341\0\u0f1e\0\u0f4b\0\u0f78\0\u0fa5\0\341\0\341"+
    "\0\u0fd2\0\u0fff\0\u102c\0\u1059\0\341\0\341\0\u1086\0\u10b3"+
    "\0\u10e0\0\341\0\u110d\0\341";

  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static int [] zzUnpackRowMap() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\3\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\3"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\2\10\1\32\2\10\1\33\1\34\1\35\1\10"+
    "\1\36\1\37\4\10\1\3\1\0\1\5\1\0\1\40"+
    "\1\0\15\40\1\41\32\40\62\0\1\5\56\0\1\42"+
    "\1\43\55\0\2\10\12\0\4\10\3\0\20\10\3\0"+
    "\1\10\17\0\1\44\57\0\1\45\40\0\2\10\12\0"+
    "\1\10\1\46\2\10\3\0\1\47\17\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\3\10\1\50\14\10"+
    "\3\0\1\10\6\0\2\10\12\0\4\10\3\0\16\10"+
    "\1\51\1\10\3\0\1\10\6\0\2\10\12\0\4\10"+
    "\3\0\5\10\1\52\1\10\1\53\10\10\3\0\1\10"+
    "\17\0\1\54\43\0\2\10\12\0\3\10\1\55\3\0"+
    "\20\10\3\0\1\10\6\0\2\10\12\0\4\10\3\0"+
    "\4\10\1\56\5\10\1\57\5\10\3\0\1\10\6\0"+
    "\2\10\12\0\2\10\1\60\1\10\3\0\20\10\3\0"+
    "\1\10\6\0\2\10\12\0\2\10\1\61\1\10\3\0"+
    "\20\10\3\0\1\10\6\0\2\10\12\0\3\10\1\62"+
    "\3\0\6\10\1\63\10\10\1\64\3\0\1\10\6\0"+
    "\2\10\12\0\4\10\3\0\5\10\1\65\12\10\3\0"+
    "\1\10\6\0\2\10\12\0\4\10\3\0\3\10\1\66"+
    "\14\10\3\0\1\10\51\0\1\67\3\0\1\42\1\4"+
    "\1\5\52\42\5\43\1\70\47\43\20\0\1\71\57\0"+
    "\1\72\37\0\2\10\12\0\2\10\1\73\1\10\3\0"+
    "\20\10\3\0\1\10\6\0\2\10\12\0\1\10\1\74"+
    "\1\10\1\75\3\0\20\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\2\10\1\76\15\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\6\10\1\77\11\10"+
    "\3\0\1\10\6\0\2\10\12\0\4\10\3\0\11\10"+
    "\1\100\6\10\3\0\1\10\6\0\2\10\12\0\4\10"+
    "\3\0\1\101\17\10\3\0\1\10\6\0\2\10\12\0"+
    "\4\10\3\0\6\10\1\102\11\10\3\0\1\10\6\0"+
    "\2\10\12\0\1\103\3\10\3\0\20\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\3\10\1\104\14\10"+
    "\3\0\1\10\6\0\2\10\12\0\1\10\1\105\2\10"+
    "\3\0\20\10\3\0\1\10\6\0\2\10\12\0\4\10"+
    "\3\0\15\10\1\106\2\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\1\107\17\10\3\0\1\10\6\0"+
    "\2\10\12\0\4\10\3\0\1\110\17\10\3\0\1\10"+
    "\6\0\2\10\12\0\1\111\3\10\3\0\20\10\3\0"+
    "\1\10\6\0\2\10\12\0\4\10\3\0\12\10\1\112"+
    "\5\10\3\0\1\10\6\0\2\10\12\0\4\10\3\0"+
    "\6\10\1\113\11\10\3\0\1\10\4\43\1\5\1\70"+
    "\47\43\24\0\1\114\36\0\2\10\12\0\3\10\1\115"+
    "\3\0\20\10\3\0\1\10\6\0\2\10\12\0\4\10"+
    "\3\0\10\10\1\116\7\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\1\10\1\117\16\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\14\10\1\120\3\10"+
    "\3\0\1\10\6\0\2\10\12\0\2\10\1\121\1\10"+
    "\3\0\20\10\3\0\1\10\6\0\2\10\12\0\2\10"+
    "\1\122\1\10\3\0\20\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\10\10\1\123\7\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\3\10\1\124\14\10"+
    "\3\0\1\10\6\0\2\10\12\0\4\10\3\0\5\10"+
    "\1\125\12\10\3\0\1\10\6\0\2\10\12\0\4\10"+
    "\3\0\6\10\1\126\11\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\4\10\1\127\13\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\6\10\1\130\11\10"+
    "\3\0\1\10\6\0\2\10\12\0\4\10\3\0\12\10"+
    "\1\131\5\10\3\0\1\10\6\0\2\10\12\0\1\10"+
    "\1\132\2\10\3\0\20\10\3\0\1\10\6\0\2\10"+
    "\12\0\2\10\1\133\1\10\3\0\20\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\1\134\5\10\1\135"+
    "\11\10\3\0\1\10\6\0\2\10\12\0\4\10\3\0"+
    "\14\10\1\136\3\10\3\0\1\10\25\0\1\137\35\0"+
    "\2\10\12\0\2\10\1\140\1\10\3\0\20\10\3\0"+
    "\1\10\6\0\2\10\12\0\2\10\1\141\1\10\3\0"+
    "\20\10\3\0\1\10\6\0\2\10\12\0\4\10\3\0"+
    "\1\142\17\10\3\0\1\10\6\0\2\10\12\0\4\10"+
    "\3\0\6\10\1\143\11\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\12\10\1\144\5\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\10\10\1\145\7\10"+
    "\3\0\1\10\6\0\2\10\12\0\4\10\3\0\5\10"+
    "\1\146\12\10\3\0\1\10\6\0\2\10\12\0\1\10"+
    "\1\147\2\10\3\0\20\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\3\10\1\150\14\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\6\10\1\151\11\10"+
    "\3\0\1\10\6\0\2\10\12\0\1\10\1\152\2\10"+
    "\3\0\20\10\3\0\1\10\6\0\2\10\12\0\4\10"+
    "\3\0\10\10\1\153\7\10\3\0\1\10\6\0\2\10"+
    "\12\0\2\10\1\154\1\10\3\0\20\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\11\10\1\155\6\10"+
    "\3\0\1\10\6\0\2\10\12\0\1\10\1\156\2\10"+
    "\3\0\20\10\3\0\1\10\6\0\2\10\12\0\4\10"+
    "\3\0\2\10\1\157\15\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\11\10\1\160\6\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\12\10\1\161\5\10"+
    "\3\0\1\10\6\0\2\10\12\0\4\10\3\0\6\10"+
    "\1\162\11\10\3\0\1\10\6\0\2\10\12\0\4\10"+
    "\3\0\12\10\1\163\5\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\10\10\1\164\7\10\3\0\1\10"+
    "\6\0\2\10\12\0\1\10\1\165\2\10\3\0\20\10"+
    "\3\0\1\10\6\0\2\10\12\0\2\10\1\166\1\10"+
    "\3\0\20\10\3\0\1\10\6\0\2\10\12\0\2\10"+
    "\1\167\1\10\3\0\20\10\3\0\1\10\6\0\2\10"+
    "\12\0\4\10\3\0\10\10\1\170\7\10\3\0\1\10"+
    "\6\0\2\10\12\0\4\10\3\0\1\171\17\10\3\0"+
    "\1\10\6\0\2\10\12\0\4\10\3\0\5\10\1\172"+
    "\12\10\3\0\1\10\6\0\2\10\12\0\4\10\3\0"+
    "\4\10\1\173\13\10\3\0\1\10\6\0\2\10\12\0"+
    "\4\10\3\0\12\10\1\174\5\10\3\0\1\10\6\0"+
    "\2\10\12\0\4\10\3\0\7\10\1\175\10\10\3\0"+
    "\1\10\6\0\2\10\12\0\3\10\1\176\3\0\20\10"+
    "\3\0\1\10\6\0\2\10\12\0\4\10\3\0\3\10"+
    "\1\177\14\10\3\0\1\10\6\0\2\10\12\0\3\10"+
    "\1\200\3\0\20\10\3\0\1\10\6\0\2\10\12\0"+
    "\4\10\3\0\12\10\1\201\5\10\3\0\1\10\6\0"+
    "\2\10\12\0\2\10\1\202\1\10\3\0\20\10\3\0"+
    "\1\10\6\0\2\10\12\0\4\10\3\0\1\203\17\10"+
    "\3\0\1\10\6\0\2\10\12\0\4\10\3\0\7\10"+
    "\1\204\10\10\3\0\1\10";

  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static int [] zzUnpackTrans() {
    int [] result = new int[4410];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\1\1\1\11\1\1\7\11"+
    "\6\1\2\11\10\1\1\11\1\1\4\0\6\1\1\11"+
    "\12\1\1\11\1\0\1\11\1\0\21\1\1\0\22\1"+
    "\1\11\45\1";
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static int [] zzUnpackAttribute() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public Lexer(ComplexSymbolFactory sf){
	this(new InputStreamReader(System.in));
        symbolFactory = sf;
    }
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;
    public Symbol symbol(String name, int code){
	return symbolFactory.newSymbol(name, code,new Location(yyline+1,yycolumn+1-yylength()),new Location(yyline+1,yycolumn+1));
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, new Location(yyline+1, yycolumn +1), new Location(yyline+1,yycolumn+yylength()), lexem);
    }
    protected void emit_warning(String message){
	ErrorManager.getManager().emit_warning("Scanner at " + (yyline+1) + "(" + (yycolumn+1) + "): " + message);
    }
    protected void emit_error(String message){
	ErrorManager.getManager().emit_error("Scanner at " + (yyline+1) + "(" + (yycolumn+1) +  "): " + message);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2848) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { emit_warning("Unrecognized character '" +yytext()+"' -- ignored");
            } 
            // fall through
          case 39: break;
          case 2: 
            { 
            } 
            // fall through
          case 40: break;
          case 3: 
            { return symbol("STAR",STAR);
            } 
            // fall through
          case 41: break;
          case 4: 
            { return symbol("ID",ID,yytext());
            } 
            // fall through
          case 42: break;
          case 5: 
            { return symbol("QESTION",QUESTION);
            } 
            // fall through
          case 43: break;
          case 6: 
            { return symbol("SEMI",SEMI);
            } 
            // fall through
          case 44: break;
          case 7: 
            { return symbol("COMMA",COMMA);
            } 
            // fall through
          case 45: break;
          case 8: 
            { return symbol("DOT",DOT);
            } 
            // fall through
          case 46: break;
          case 9: 
            { return symbol("BAR",BAR);
            } 
            // fall through
          case 47: break;
          case 10: 
            { return symbol("LBRACK",LBRACK);
            } 
            // fall through
          case 48: break;
          case 11: 
            { return symbol("RBRACK",RBRACK);
            } 
            // fall through
          case 49: break;
          case 12: 
            { return symbol("COLON",COLON);
            } 
            // fall through
          case 50: break;
          case 13: 
            { return symbol("GT",GT);
            } 
            // fall through
          case 51: break;
          case 14: 
            { return symbol("LT",LT);
            } 
            // fall through
          case 52: break;
          case 15: 
            { sb.append(yytext());
            } 
            // fall through
          case 53: break;
          case 16: 
            { sb = new StringBuffer(); csline=yyline+1; cscolumn=yycolumn+1; yybegin(CODESEG);
            } 
            // fall through
          case 54: break;
          case 17: 
            { yybegin(YYINITIAL); return symbolFactory.newSymbol("CODE_STRING",CODE_STRING, new Location(csline, cscolumn),new Location(yyline+1,yycolumn+1+yylength()), sb.toString());
            } 
            // fall through
          case 55: break;
          case 18: 
            { return symbol("COLON_COLON_EQUALS",COLON_COLON_EQUALS);
            } 
            // fall through
          case 56: break;
          case 19: 
            { return symbol("NON",NON);
            } 
            // fall through
          case 57: break;
          case 20: 
            { return symbol("CODE",CODE);
            } 
            // fall through
          case 58: break;
          case 21: 
            { return symbol("INIT",INIT);
            } 
            // fall through
          case 59: break;
          case 22: 
            { return symbol("LEFT",LEFT);
            } 
            // fall through
          case 60: break;
          case 23: 
            { return symbol("SCAN",SCAN);
            } 
            // fall through
          case 61: break;
          case 24: 
            { return symbol("WITH",WITH);
            } 
            // fall through
          case 62: break;
          case 25: 
            { return symbol("PERCENT_PREC",PERCENT_PREC);
            } 
            // fall through
          case 63: break;
          case 26: 
            { return symbol("RIGHT",RIGHT);
            } 
            // fall through
          case 64: break;
          case 27: 
            { return symbol("CLASS",CLASS);
            } 
            // fall through
          case 65: break;
          case 28: 
            { return symbol("START",START);
            } 
            // fall through
          case 66: break;
          case 29: 
            { return symbol("SUPER",SUPER);
            } 
            // fall through
          case 67: break;
          case 30: 
            { return symbol("PARSER",PARSER);
            } 
            // fall through
          case 68: break;
          case 31: 
            { return symbol("ACTION",ACTION);
            } 
            // fall through
          case 69: break;
          case 32: 
            { return symbol("IMPORT",IMPORT);
            } 
            // fall through
          case 70: break;
          case 33: 
            { return symbol("PACKAGE",PACKAGE);
            } 
            // fall through
          case 71: break;
          case 34: 
            { return symbol("EXTENDS",EXTENDS);
            } 
            // fall through
          case 72: break;
          case 35: 
            { return symbol("PARSER",TERMINAL);
            } 
            // fall through
          case 73: break;
          case 36: 
            { return symbol("NONASSOC",NONASSOC);
            } 
            // fall through
          case 74: break;
          case 37: 
            { return symbol("PRECEDENCE",PRECEDENCE);
            } 
            // fall through
          case 75: break;
          case 38: 
            { return symbol("NONTERMINAL",NONTERMINAL);
            } 
            // fall through
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
