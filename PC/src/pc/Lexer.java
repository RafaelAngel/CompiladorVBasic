/* The following code was generated by JFlex 1.6.1 */

package pc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java_cup.runtime.*;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>./src/PC/Vbasic.flex</tt>
 */
class Lexer extends sym implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\47\1\46\1\53\1\53\1\53\22\0\1\45\1\0\1\50"+
    "\3\0\1\51\1\52\1\4\1\5\1\36\1\37\1\26\1\37\1\21"+
    "\1\36\12\40\2\0\1\34\1\35\1\33\2\0\1\15\1\3\1\17"+
    "\1\16\1\11\1\24\1\32\1\27\1\43\2\41\1\6\1\31\1\10"+
    "\1\20\1\23\1\41\1\13\1\42\1\14\1\2\1\25\1\12\1\30"+
    "\1\22\1\41\4\0\1\44\1\0\1\15\1\3\1\17\1\16\1\11"+
    "\1\24\1\32\1\27\1\43\2\41\1\6\1\31\1\10\1\20\1\23"+
    "\1\41\1\13\1\42\1\14\1\2\1\25\1\12\1\30\1\22\1\41"+
    "\12\0\1\53\252\0\2\7\115\0\1\1\u1ea8\0\1\53\1\53\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\2\2\1\3\1\4\1\2\1\1\11\2"+
    "\1\5\1\2\1\6\1\2\2\7\1\10\1\11\1\12"+
    "\1\13\2\2\1\14\1\15\1\16\1\1\1\17\2\0"+
    "\3\2\1\0\1\20\10\2\1\21\2\2\1\22\1\2"+
    "\1\22\1\0\1\23\2\2\1\24\3\2\1\7\3\2"+
    "\1\20\1\0\1\25\1\26\1\0\4\2\1\0\1\2"+
    "\1\27\1\0\1\2\1\30\1\0\1\2\1\0\6\2"+
    "\2\31\3\2\1\32\1\26\2\2\2\0\3\2\1\33"+
    "\1\0\1\34\2\35\1\0\1\2\1\0\2\2\1\36"+
    "\1\37\1\40\1\41\1\0\2\2\1\0\2\2\2\0"+
    "\1\2\1\42\1\0\2\43\2\44\1\2\1\0\2\2"+
    "\1\37\2\2\1\0\1\45\1\2\1\0\1\46\1\0"+
    "\1\2\1\0\1\2\1\45\1\2\1\0\2\47\1\0"+
    "\1\2\1\0\2\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[161];
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
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\54\0\54\0\334"+
    "\0\u0108\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c"+
    "\0\u0268\0\u0294\0\54\0\u02c0\0\54\0\u02ec\0\u0318\0\u0344"+
    "\0\54\0\54\0\54\0\u0370\0\u039c\0\u03c8\0\54\0\u03f4"+
    "\0\54\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528"+
    "\0\u0554\0\54\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c"+
    "\0\u0688\0\u06b4\0\204\0\u06e0\0\u070c\0\54\0\u0738\0\204"+
    "\0\u0764\0\204\0\u0790\0\u07bc\0\204\0\u07e8\0\u0814\0\u0840"+
    "\0\54\0\u086c\0\u0898\0\u08c4\0\204\0\u0420\0\u08f0\0\54"+
    "\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24\0\204"+
    "\0\u0a50\0\u0a7c\0\204\0\u0aa8\0\u0ad4\0\u0b00\0\u0b2c\0\u0b58"+
    "\0\u0b84\0\u0bb0\0\u0bdc\0\u0c08\0\54\0\204\0\u0c34\0\u0c60"+
    "\0\u0c8c\0\204\0\204\0\u0cb8\0\u0ce4\0\u0d10\0\u0d3c\0\u0d68"+
    "\0\u0d94\0\u0dc0\0\204\0\u0dec\0\204\0\54\0\204\0\u0e18"+
    "\0\u0e44\0\u0e70\0\u0e9c\0\u0ec8\0\204\0\204\0\204\0\204"+
    "\0\u0ef4\0\u0f20\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0\0\u0ffc\0\u1028"+
    "\0\u1054\0\204\0\u1080\0\54\0\204\0\54\0\204\0\u10ac"+
    "\0\u10d8\0\u1104\0\u1130\0\54\0\u115c\0\u1188\0\u11b4\0\54"+
    "\0\u11e0\0\u120c\0\204\0\u1238\0\u1264\0\u1290\0\u12bc\0\204"+
    "\0\u12e8\0\u1314\0\54\0\204\0\u1340\0\u136c\0\u1398\0\54"+
    "\0\204";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[161];
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
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\2\4\1\24\1\4\1\25\1\4\1\26"+
    "\2\4\1\27\1\30\1\31\1\32\1\33\1\34\1\4"+
    "\1\35\1\36\1\2\1\37\1\40\1\41\1\42\1\2"+
    "\1\43\57\0\1\44\11\0\1\45\41\0\2\4\2\0"+
    "\1\4\1\0\11\4\1\0\4\4\1\0\4\4\5\0"+
    "\5\4\11\0\2\4\2\0\1\4\1\0\10\4\1\46"+
    "\1\0\1\47\3\4\1\0\4\4\5\0\5\4\11\0"+
    "\2\4\2\0\1\4\1\0\10\4\1\50\1\0\4\4"+
    "\1\0\4\4\5\0\5\4\17\0\1\51\13\0\1\52"+
    "\31\0\2\4\2\0\1\4\1\0\1\4\1\53\6\4"+
    "\1\54\1\0\4\4\1\0\4\4\5\0\5\4\11\0"+
    "\2\4\2\0\1\55\1\0\1\56\10\4\1\0\4\4"+
    "\1\0\4\4\5\0\5\4\11\0\2\4\2\0\1\4"+
    "\1\0\3\4\1\57\5\4\1\0\4\4\1\0\1\60"+
    "\3\4\5\0\5\4\11\0\2\4\2\0\1\4\1\0"+
    "\1\4\1\61\7\4\1\0\4\4\1\0\4\4\5\0"+
    "\5\4\11\0\2\4\2\0\1\4\1\0\3\4\1\62"+
    "\4\4\1\63\1\0\1\64\3\4\1\0\1\65\3\4"+
    "\5\0\5\4\10\0\1\66\2\4\2\0\1\4\1\0"+
    "\1\67\10\4\1\0\4\4\1\0\4\4\5\0\2\4"+
    "\1\70\2\4\11\0\2\4\2\0\1\4\1\71\10\4"+
    "\1\72\1\0\4\4\1\0\4\4\5\0\3\4\1\73"+
    "\1\4\11\0\2\4\2\0\1\4\1\0\10\4\1\74"+
    "\1\0\4\4\1\0\4\4\5\0\5\4\11\0\2\4"+
    "\2\0\1\4\1\0\3\4\1\75\5\4\1\0\4\4"+
    "\1\0\4\4\5\0\5\4\11\0\1\76\1\4\2\0"+
    "\1\4\1\0\5\4\1\77\2\4\1\100\1\0\4\4"+
    "\1\0\4\4\5\0\5\4\11\0\2\4\2\0\1\4"+
    "\1\0\10\4\1\22\1\0\4\4\1\0\4\4\5\0"+
    "\5\4\44\0\1\101\51\0\1\101\1\0\1\101\56\0"+
    "\1\34\15\0\1\102\1\4\2\0\1\4\1\0\4\4"+
    "\1\103\4\4\1\0\4\4\1\0\4\4\5\0\5\4"+
    "\11\0\2\4\2\0\1\4\1\0\1\104\10\4\1\0"+
    "\2\4\1\105\1\4\1\0\4\4\5\0\5\4\55\0"+
    "\1\40\5\0\46\106\1\0\1\106\1\107\3\106\46\43"+
    "\1\0\5\43\3\0\1\110\63\0\1\111\42\0\2\4"+
    "\2\0\1\4\1\0\10\4\1\112\1\0\4\4\1\0"+
    "\4\4\5\0\5\4\11\0\2\4\2\0\1\4\1\0"+
    "\3\4\1\113\5\4\1\0\3\4\1\114\1\0\4\4"+
    "\5\0\5\4\11\0\2\4\2\0\1\4\1\0\10\4"+
    "\1\115\1\0\4\4\1\0\4\4\5\0\5\4\23\0"+
    "\1\116\41\0\2\4\2\0\1\4\1\0\11\4\1\0"+
    "\4\4\1\0\1\4\1\117\2\4\5\0\5\4\11\0"+
    "\2\4\2\0\1\4\1\0\4\4\1\120\4\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\10\0\1\121\2\4"+
    "\2\0\1\4\1\0\11\4\1\0\4\4\1\0\4\4"+
    "\5\0\2\4\1\122\2\4\11\0\2\4\2\0\1\4"+
    "\1\0\6\4\1\123\2\4\1\0\4\4\1\0\4\4"+
    "\5\0\5\4\11\0\2\4\2\0\1\4\1\124\11\4"+
    "\1\0\4\4\1\0\4\4\5\0\3\4\1\125\1\4"+
    "\11\0\2\4\2\0\1\4\1\126\11\4\1\0\4\4"+
    "\1\0\4\4\5\0\3\4\1\127\1\4\11\0\2\4"+
    "\2\0\1\4\1\0\4\4\1\130\1\131\3\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\11\0\1\132\1\4"+
    "\2\0\1\4\1\0\11\4\1\0\4\4\1\0\4\4"+
    "\5\0\5\4\11\0\2\4\2\0\1\4\1\0\11\4"+
    "\1\0\1\4\1\133\2\4\1\0\4\4\5\0\5\4"+
    "\11\0\2\4\2\0\1\4\1\0\1\4\1\134\7\4"+
    "\1\0\4\4\1\0\4\4\5\0\5\4\11\0\2\4"+
    "\2\0\1\4\1\0\6\4\1\75\2\4\1\0\4\4"+
    "\1\0\4\4\5\0\5\4\40\0\1\135\24\0\2\4"+
    "\2\0\1\4\1\0\11\4\1\0\4\4\1\0\2\4"+
    "\1\136\1\4\5\0\5\4\11\0\2\4\2\0\1\4"+
    "\1\0\1\137\10\4\1\0\4\4\1\0\4\4\5\0"+
    "\5\4\11\0\2\4\2\0\1\4\1\0\1\140\10\4"+
    "\1\0\4\4\1\0\4\4\5\0\5\4\11\0\2\4"+
    "\2\0\1\141\1\0\11\4\1\0\4\4\1\0\4\4"+
    "\5\0\5\4\11\0\2\4\2\0\1\4\1\0\3\4"+
    "\1\142\5\4\1\0\4\4\1\0\4\4\5\0\5\4"+
    "\11\0\1\4\1\143\2\0\1\4\1\0\11\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\11\0\2\4\2\0"+
    "\1\4\1\0\3\4\1\144\5\4\1\0\4\4\1\0"+
    "\4\4\5\0\5\4\11\0\2\4\2\0\1\4\1\0"+
    "\4\4\1\145\4\4\1\0\4\4\1\0\4\4\5\0"+
    "\5\4\54\0\1\146\15\0\1\147\33\0\1\147\12\0"+
    "\2\4\2\0\1\150\1\0\11\4\1\0\4\4\1\0"+
    "\4\4\5\0\5\4\11\0\2\4\2\0\1\4\1\0"+
    "\1\4\1\151\7\4\1\0\4\4\1\0\4\4\5\0"+
    "\5\4\11\0\2\4\2\0\1\4\1\0\5\4\1\152"+
    "\3\4\1\0\4\4\1\0\4\4\5\0\5\4\11\0"+
    "\2\4\2\0\1\4\1\0\11\4\1\0\1\4\1\153"+
    "\2\4\1\0\4\4\5\0\5\4\20\0\1\154\44\0"+
    "\2\4\2\0\1\4\1\0\4\4\1\155\4\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\20\0\1\156\44\0"+
    "\2\4\2\0\1\4\1\0\1\4\1\157\7\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\23\0\1\160\41\0"+
    "\2\4\2\0\1\4\1\0\4\4\1\161\4\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\15\0\1\162\47\0"+
    "\2\4\2\0\1\163\1\0\11\4\1\0\4\4\1\0"+
    "\4\4\5\0\5\4\11\0\1\164\1\4\2\0\1\4"+
    "\1\0\11\4\1\0\4\4\1\0\4\4\5\0\5\4"+
    "\11\0\2\4\2\0\1\4\1\0\6\4\1\165\2\4"+
    "\1\0\4\4\1\0\4\4\5\0\5\4\11\0\2\4"+
    "\2\0\1\4\1\0\1\4\1\166\7\4\1\0\4\4"+
    "\1\0\4\4\5\0\5\4\11\0\2\4\2\0\1\4"+
    "\1\0\1\4\1\167\7\4\1\0\4\4\1\0\4\4"+
    "\5\0\5\4\11\0\2\4\2\0\1\4\1\0\1\170"+
    "\10\4\1\0\4\4\1\0\4\4\5\0\5\4\10\0"+
    "\1\171\2\4\2\0\1\4\1\0\11\4\1\0\4\4"+
    "\1\0\4\4\5\0\2\4\1\172\2\4\11\0\2\4"+
    "\2\0\1\4\1\0\7\4\1\173\1\4\1\0\4\4"+
    "\1\0\4\4\5\0\5\4\10\0\1\174\2\4\2\0"+
    "\1\4\1\0\11\4\1\0\4\4\1\0\4\4\5\0"+
    "\2\4\1\132\2\4\11\0\2\4\2\0\1\4\1\147"+
    "\11\4\1\0\4\4\1\0\4\4\5\0\3\4\1\175"+
    "\1\4\11\0\2\4\2\0\1\4\1\0\1\4\1\176"+
    "\7\4\1\0\4\4\1\0\4\4\5\0\5\4\60\0"+
    "\1\177\12\0\1\200\45\0\2\4\2\0\1\4\1\0"+
    "\1\4\1\201\7\4\1\0\4\4\1\0\4\4\5\0"+
    "\5\4\11\0\2\4\2\0\1\4\1\0\11\4\1\0"+
    "\2\4\1\202\1\4\1\0\4\4\5\0\5\4\11\0"+
    "\2\4\2\0\1\202\1\0\11\4\1\0\4\4\1\0"+
    "\4\4\5\0\5\4\41\0\1\203\32\0\1\204\44\0"+
    "\2\4\2\0\1\4\1\0\1\4\1\205\7\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\20\0\1\206\44\0"+
    "\2\4\2\0\1\4\1\0\1\4\1\207\7\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\11\0\2\4\2\0"+
    "\1\4\1\0\3\4\1\210\5\4\1\0\4\4\1\0"+
    "\4\4\5\0\5\4\27\0\1\211\35\0\2\4\2\0"+
    "\1\4\1\0\10\4\1\212\1\0\4\4\1\0\4\4"+
    "\5\0\5\4\11\0\2\4\2\0\1\4\1\0\4\4"+
    "\1\213\4\4\1\0\4\4\1\0\4\4\5\0\5\4"+
    "\20\0\1\214\44\0\2\4\2\0\1\4\1\0\1\215"+
    "\10\4\1\0\4\4\1\0\4\4\5\0\5\4\11\0"+
    "\2\4\2\0\1\4\1\0\11\4\1\0\4\4\1\0"+
    "\3\4\1\216\5\0\5\4\53\0\1\217\41\0\1\220"+
    "\23\0\2\4\2\0\1\4\1\0\5\4\1\221\3\4"+
    "\1\0\4\4\1\0\4\4\5\0\5\4\20\0\1\222"+
    "\44\0\2\4\2\0\1\4\1\0\1\223\10\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\15\0\1\224\47\0"+
    "\2\4\2\0\1\225\1\0\11\4\1\0\4\4\1\0"+
    "\4\4\5\0\5\4\11\0\2\4\2\0\1\4\1\226"+
    "\11\4\1\0\4\4\1\0\4\4\5\0\3\4\1\227"+
    "\1\4\11\0\2\4\2\0\1\4\1\0\11\4\1\0"+
    "\4\4\1\0\3\4\1\230\5\0\5\4\11\0\2\4"+
    "\2\0\1\4\1\0\1\4\1\231\7\4\1\0\4\4"+
    "\1\0\4\4\5\0\5\4\55\0\1\232\7\0\2\4"+
    "\2\0\1\4\1\0\1\230\10\4\1\0\4\4\1\0"+
    "\4\4\5\0\5\4\22\0\1\220\51\0\1\233\44\0"+
    "\2\4\2\0\1\4\1\0\1\4\1\234\7\4\1\0"+
    "\4\4\1\0\4\4\5\0\5\4\27\0\1\235\35\0"+
    "\2\4\2\0\1\4\1\0\10\4\1\236\1\0\4\4"+
    "\1\0\4\4\5\0\5\4\11\0\2\4\2\0\1\4"+
    "\1\0\3\4\1\230\5\4\1\0\4\4\1\0\4\4"+
    "\5\0\5\4\54\0\1\237\1\232\1\237\1\106\13\0"+
    "\1\240\45\0\2\4\2\0\1\4\1\0\1\241\10\4"+
    "\1\0\4\4\1\0\4\4\5\0\5\4\54\0\1\237"+
    "\1\0\1\237\1\106\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5060];
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
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\2\11\13\1\1\11\1\1\1\11"+
    "\3\1\3\11\3\1\1\11\1\1\1\11\2\1\2\0"+
    "\3\1\1\0\1\11\13\1\1\11\2\1\1\0\7\1"+
    "\1\11\4\1\1\0\1\1\1\11\1\0\4\1\1\0"+
    "\2\1\1\0\2\1\1\0\1\1\1\0\6\1\1\11"+
    "\10\1\2\0\4\1\1\0\1\1\1\11\1\1\1\0"+
    "\1\1\1\0\6\1\1\0\2\1\1\0\2\1\2\0"+
    "\2\1\1\0\1\11\1\1\1\11\2\1\1\0\2\1"+
    "\1\11\2\1\1\0\1\11\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\3\1\1\0\1\11\1\1\1\0\1\1"+
    "\1\0\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[161];
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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
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
     
  StringBuffer string = new StringBuffer();
  
  private Symbol symbol(int type) {
    return new JavaSymbol(type, yyline+1, yycolumn+1, yytext());
  }

  private Symbol symbol(int type, Object value) {
    return new JavaSymbol(type, yyline+1, yycolumn+1, yytext(), value);
  }

  public String current_lexeme(){
    int l = yyline+1;
    int c = yycolumn+1;
    return " line: "+l+" , column: "+c+" , lexema: '"+yytext()+"'";
  }

    private String extraerCadenaReal() {
        String[] lista = yytext().split(" &_\n");
        String cadena = "";
            for(int i=0; i<lista.length;i++){
                boolean comilla =false;
                int iniciocomilla = 0;
                int finalcomilla = 0;
                for(int j=0; j<lista[i].length();j++){
                    if(comilla){
                        iniciocomilla = j;
                        break;
                    }
                    if(lista[i].charAt(j)=='"'){
                        comilla=true;
                    }
                }
                comilla = false;
                for(int j=lista[i].length()-1; j>=0;j--){
                    if(lista[i].charAt(j)=='"'){
                        comilla=true;
                    }
                    if(comilla){
                        finalcomilla = j;
                        break;
                    }
                }
                cadena+= lista[i].substring(iniciocomilla, finalcomilla);

            }
        return cadena;
    }

    private boolean revisionPalabraClave(){
        boolean respuesta = false;
        Pattern pat = Pattern.compile("[A-Z][a-z]+");
        Matcher mat = pat.matcher(yytext());
        if (mat.matches()) {
            respuesta = true;
        } else {
            System.out.println("Palabra clave->"+yytext().substring(0,1).toUpperCase()
                         +yytext().substring(1,yytext().length()).toLowerCase()+". Error->Linea: "+yyline+", columna: "+yycolumn);
        }
        return respuesta;
    }

    private boolean revisionPalabraClave2(){
        boolean respuesta = false;
        switch (yytext()) {
 
        case "ByVal":
        respuesta = true;
        break;
        case "ByRef":
        respuesta = true;
        break;
        default:
        System.out.println("Palabra clave->By"+yytext().substring(2,3).toUpperCase()
                         +yytext().substring(3,yytext().length()).toLowerCase()+". Error->Linea: "+yyline+", columna: "+yycolumn);
        break;
 
        }

        return respuesta;
    }

   


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
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
    while (i < 212) {
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
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.err.println("\nNo se reconoce el token: "+" Error-> "+current_lexeme());
            }
          case 41: break;
          case 2: 
            { return symbol(identificador,yytext());
            }
          case 42: break;
          case 3: 
            { return symbol(abrirparentesis);
            }
          case 43: break;
          case 4: 
            { return symbol(cerrarparentesis);
            }
          case 44: break;
          case 5: 
            { return symbol(punto);
            }
          case 45: break;
          case 6: 
            { return symbol(coma);
            }
          case 46: break;
          case 7: 
            { return symbol(oprel, yytext());
            }
          case 47: break;
          case 8: 
            { return symbol(asignacion);
            }
          case 48: break;
          case 9: 
            { return symbol(opmult, yytext());
            }
          case 49: break;
          case 10: 
            { return symbol(opsum, yytext());
            }
          case 50: break;
          case 11: 
            { return symbol(numero, Integer.parseInt(yytext()));
            }
          case 51: break;
          case 12: 
            { return symbol(espacio, yytext());
            }
          case 52: break;
          case 13: 
            { return symbol(newline, yytext());
            }
          case 53: break;
          case 14: 
            { return symbol(tab, yytext());
            }
          case 54: break;
          case 15: 
            { return symbol(comentario,yytext().substring(1));
            }
          case 55: break;
          case 16: 
            { return symbol(If);
            }
          case 56: break;
          case 17: 
            { return symbol(to);
            }
          case 57: break;
          case 18: 
            { return symbol(as);
            }
          case 58: break;
          case 19: 
            { return symbol(Do);
            }
          case 59: break;
          case 20: 
            { return symbol(oplog, yytext());
            }
          case 60: break;
          case 21: 
            { return symbol(cadena,extraerCadenaReal());
            }
          case 61: break;
          case 22: 
            { return symbol(sub);
            }
          case 62: break;
          case 23: 
            { return symbol(not);
            }
          case 63: break;
          case 24: 
            { return symbol(end);
            }
          case 64: break;
          case 25: 
            { return symbol(dim);
            }
          case 65: break;
          case 26: 
            { return symbol(For);
            }
          case 66: break;
          case 27: 
            { return symbol(loop);
            }
          case 67: break;
          case 28: 
            { return symbol(next);
            }
          case 68: break;
          case 29: 
            { return symbol(Else);
            }
          case 69: break;
          case 30: 
            { return symbol(read);
            }
          case 70: break;
          case 31: 
            { return symbol(truefalse, yytext());
            }
          case 71: break;
          case 32: 
            { return symbol(type);
            }
          case 72: break;
          case 33: 
            { return symbol(then);
            }
          case 73: break;
          case 34: 
            { return symbol(tipoparametro, yytext());
            }
          case 74: break;
          case 35: 
            { return symbol(write);
            }
          case 75: break;
          case 36: 
            { return symbol(While);
            }
          case 76: break;
          case 37: 
            { return symbol(tipovar, yytext());
            }
          case 77: break;
          case 38: 
            { return symbol(Return);
            }
          case 78: break;
          case 39: 
            { return symbol(console);
            }
          case 79: break;
          case 40: 
            { return symbol(function);
            }
          case 80: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
