
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintax2 extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintax2() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintax2(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax2(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\047\000\002\002\004\000\002\002\011\000\002\002" +
    "\010\000\002\003\004\000\002\003\003\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\003\004\000\002\003\003\000\002\003\005\000\002" +
    "\003\004\000\002\003\003\000\002\004\005\000\002\004" +
    "\007\000\002\004\007\000\002\004\006\000\002\004\006" +
    "\000\002\004\010\000\002\004\010\000\002\004\011\000" +
    "\002\004\011\000\002\006\011\000\002\013\003\000\002" +
    "\013\005\000\002\013\005\000\002\013\005\000\002\013" +
    "\006\000\002\013\007\000\002\007\015\000\002\010\011" +
    "\000\002\011\013\000\002\012\011\000\002\014\012\000" +
    "\002\014\011\000\002\005\005\000\002\005\004\000\002" +
    "\005\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\173\000\006\007\006\036\004\001\002\000\004\030" +
    "\171\001\002\000\004\002\170\001\002\000\004\036\007" +
    "\001\002\000\004\030\010\001\002\000\004\031\011\001" +
    "\002\000\004\032\012\001\002\000\014\006\021\010\016" +
    "\011\024\014\020\015\017\001\002\000\020\006\ufff7\010" +
    "\ufff7\011\ufff7\013\ufff7\014\ufff7\015\ufff7\033\ufff7\001\002" +
    "\000\020\006\ufff4\010\ufff4\011\ufff4\013\ufff4\014\ufff4\015" +
    "\ufff4\033\ufff4\001\002\000\020\006\ufffd\010\ufffd\011\ufffd" +
    "\013\ufffd\014\ufffd\015\ufffd\033\ufffd\001\002\000\004\040" +
    "\151\001\002\000\004\030\116\001\002\000\004\030\110" +
    "\001\002\000\006\026\073\040\074\001\002\000\020\006" +
    "\ufff9\010\ufff9\011\ufff9\013\ufff9\014\ufff9\015\ufff9\033\ufff9" +
    "\001\002\000\020\006\ufffb\010\ufffb\011\ufffb\013\ufffb\014" +
    "\ufffb\015\ufffb\033\ufffb\001\002\000\004\030\061\001\002" +
    "\000\020\006\021\010\016\011\024\013\034\014\020\015" +
    "\017\033\033\001\002\000\020\006\ufff8\010\ufff8\011\ufff8" +
    "\013\ufff8\014\ufff8\015\ufff8\033\ufff8\001\002\000\020\006" +
    "\ufff5\010\ufff5\011\ufff5\013\ufff5\014\ufff5\015\ufff5\033\ufff5" +
    "\001\002\000\020\006\ufffe\010\ufffe\011\ufffe\013\ufffe\014" +
    "\ufffe\015\ufffe\033\ufffe\001\002\000\020\006\ufffa\010\ufffa" +
    "\011\ufffa\013\ufffa\014\ufffa\015\ufffa\033\ufffa\001\002\000" +
    "\020\006\ufffc\010\ufffc\011\ufffc\013\ufffc\014\ufffc\015\ufffc" +
    "\033\ufffc\001\002\000\004\002\000\001\002\000\004\032" +
    "\037\001\002\000\004\013\034\001\002\000\020\006\ufff6" +
    "\010\ufff6\011\ufff6\013\ufff6\014\ufff6\015\ufff6\033\ufff6\001" +
    "\002\000\014\006\021\010\016\011\024\014\020\015\017" +
    "\001\002\000\020\006\021\010\016\011\024\013\034\014" +
    "\020\015\017\033\041\001\002\000\004\014\042\001\002" +
    "\000\004\030\043\001\002\000\006\027\045\040\046\001" +
    "\002\000\004\031\057\001\002\000\006\031\uffe9\037\uffe9" +
    "\001\002\000\004\024\047\001\002\000\012\005\051\027" +
    "\052\040\053\041\050\001\002\000\006\031\uffe7\037\uffe7" +
    "\001\002\000\006\005\054\040\055\001\002\000\006\031" +
    "\uffe8\037\uffe8\001\002\000\006\031\uffe6\037\uffe6\001\002" +
    "\000\006\031\uffe5\037\uffe5\001\002\000\004\005\056\001" +
    "\002\000\006\031\uffe4\037\uffe4\001\002\000\004\037\060" +
    "\001\002\000\020\006\uffe1\010\uffe1\011\uffe1\013\uffe1\014" +
    "\uffe1\015\uffe1\033\uffe1\001\002\000\006\027\045\040\046" +
    "\001\002\000\004\031\063\001\002\000\004\032\064\001" +
    "\002\000\014\006\021\010\016\011\024\014\020\015\017" +
    "\001\002\000\020\006\021\010\016\011\024\013\034\014" +
    "\020\015\017\033\066\001\002\000\022\006\uffea\010\uffea" +
    "\011\uffea\012\067\013\uffea\014\uffea\015\uffea\033\uffea\001" +
    "\002\000\004\032\070\001\002\000\014\006\021\010\016" +
    "\011\024\014\020\015\017\001\002\000\020\006\021\010" +
    "\016\011\024\013\034\014\020\015\017\033\072\001\002" +
    "\000\020\006\uffe3\010\uffe3\011\uffe3\013\uffe3\014\uffe3\015" +
    "\uffe3\033\uffe3\001\002\000\004\040\106\001\002\000\012" +
    "\016\100\025\075\026\077\037\076\001\002\000\004\041" +
    "\104\001\002\000\020\006\ufff3\010\ufff3\011\ufff3\013\ufff3" +
    "\014\ufff3\015\ufff3\033\ufff3\001\002\000\004\037\103\001" +
    "\002\000\004\041\101\001\002\000\004\037\102\001\002" +
    "\000\020\006\ufff1\010\ufff1\011\ufff1\013\ufff1\014\ufff1\015" +
    "\ufff1\033\ufff1\001\002\000\020\006\ufff0\010\ufff0\011\ufff0" +
    "\013\ufff0\014\ufff0\015\ufff0\033\ufff0\001\002\000\004\037" +
    "\105\001\002\000\020\006\ufff2\010\ufff2\011\ufff2\013\ufff2" +
    "\014\ufff2\015\ufff2\033\ufff2\001\002\000\004\037\107\001" +
    "\002\000\020\006\uffef\010\uffef\011\uffef\013\uffef\014\uffef" +
    "\015\uffef\033\uffef\001\002\000\006\027\045\040\046\001" +
    "\002\000\004\031\112\001\002\000\004\032\113\001\002" +
    "\000\014\006\021\010\016\011\024\014\020\015\017\001" +
    "\002\000\020\006\021\010\016\011\024\013\034\014\020" +
    "\015\017\033\115\001\002\000\020\006\uffe2\010\uffe2\011" +
    "\uffe2\013\uffe2\014\uffe2\015\uffe2\033\uffe2\001\002\000\006" +
    "\006\120\040\121\001\002\000\004\031\145\001\002\000" +
    "\004\040\136\001\002\000\004\016\122\001\002\000\004" +
    "\041\123\001\002\000\004\037\124\001\002\000\006\027" +
    "\045\040\046\001\002\000\004\037\126\001\002\000\006" +
    "\026\131\040\130\001\002\000\004\031\uffde\001\002\000" +
    "\006\025\133\026\134\001\002\000\004\040\132\001\002" +
    "\000\004\031\uffdb\001\002\000\004\041\135\001\002\000" +
    "\004\031\uffdc\001\002\000\004\031\uffdd\001\002\000\004" +
    "\016\137\001\002\000\004\041\140\001\002\000\004\037" +
    "\141\001\002\000\006\027\045\040\046\001\002\000\004" +
    "\037\143\001\002\000\006\026\131\040\130\001\002\000" +
    "\004\031\uffdf\001\002\000\004\032\146\001\002\000\014" +
    "\006\021\010\016\011\024\014\020\015\017\001\002\000" +
    "\020\006\021\010\016\011\024\013\034\014\020\015\017" +
    "\033\150\001\002\000\020\006\uffe0\010\uffe0\011\uffe0\013" +
    "\uffe0\014\uffe0\015\uffe0\033\uffe0\001\002\000\006\016\153" +
    "\025\152\001\002\000\004\005\162\001\002\000\004\005" +
    "\154\001\002\000\006\005\155\040\156\001\002\000\004" +
    "\037\161\001\002\000\004\005\157\001\002\000\004\037" +
    "\160\001\002\000\020\006\uffeb\010\uffeb\011\uffeb\013\uffeb" +
    "\014\uffeb\015\uffeb\033\uffeb\001\002\000\020\006\uffed\010" +
    "\uffed\011\uffed\013\uffed\014\uffed\015\uffed\033\uffed\001\002" +
    "\000\006\005\163\040\164\001\002\000\004\037\167\001" +
    "\002\000\004\005\165\001\002\000\004\037\166\001\002" +
    "\000\020\006\uffec\010\uffec\011\uffec\013\uffec\014\uffec\015" +
    "\uffec\033\uffec\001\002\000\020\006\uffee\010\uffee\011\uffee" +
    "\013\uffee\014\uffee\015\uffee\033\uffee\001\002\000\004\002" +
    "\001\001\002\000\004\031\172\001\002\000\004\032\173" +
    "\001\002\000\014\006\021\010\016\011\024\014\020\015" +
    "\017\001\002\000\020\006\021\010\016\011\024\013\034" +
    "\014\020\015\017\033\175\001\002\000\004\002\uffff\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\173\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\024\004\014\006" +
    "\022\007\021\010\012\012\013\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\016\004" +
    "\027\006\031\007\030\010\025\011\034\012\026\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\035\001\001\000\002\001\001\000" +
    "\016\003\037\004\014\006\022\007\021\010\012\012\013" +
    "\001\001\000\016\004\027\006\031\007\030\010\025\011" +
    "\034\012\026\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\061\001\001\000" +
    "\002\001\001\000\002\001\001\000\016\003\064\004\014" +
    "\006\022\007\021\010\012\012\013\001\001\000\016\004" +
    "\027\006\031\007\030\010\025\011\034\012\026\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\003\070\004" +
    "\014\006\022\007\021\010\012\012\013\001\001\000\016" +
    "\004\027\006\031\007\030\010\025\011\034\012\026\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\110\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\113\004\014\006" +
    "\022\007\021\010\012\012\013\001\001\000\016\004\027" +
    "\006\031\007\030\010\025\011\034\012\026\001\001\000" +
    "\002\001\001\000\004\014\116\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\013\124\001\001\000\002\001\001" +
    "\000\004\005\126\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\013\141\001\001" +
    "\000\002\001\001\000\004\005\143\001\001\000\002\001" +
    "\001\000\002\001\001\000\016\003\146\004\014\006\022" +
    "\007\021\010\012\012\013\001\001\000\016\004\027\006" +
    "\031\007\030\010\025\011\034\012\026\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\003\173" +
    "\004\014\006\022\007\021\010\012\012\013\001\001\000" +
    "\016\004\027\006\031\007\030\010\025\011\034\012\026" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax2$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax2$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax2$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintax2$actions {
  private final Sintax2 parser;

  /** Constructor */
  CUP$Sintax2$actions(Sintax2 parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintax2$do_action_part00000000(
    int                        CUP$Sintax2$act_num,
    java_cup.runtime.lr_parser CUP$Sintax2$parser,
    java.util.Stack            CUP$Sintax2$stack,
    int                        CUP$Sintax2$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax2$result;

      /* select the action based on the action number */
      switch (CUP$Sintax2$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)).value;
		RESULT = start_val;
              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax2$parser.done_parsing();
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Entero Principal Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Principal Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA DO_WHILE DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECLARACION ::= T_dato Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACION ::= T_dato Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= T_dato Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= T_dato Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= T_dato Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= Cadena Identificador Igual Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // IF ::= Si Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("IF",4, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // IF_ELSE ::= Si Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c Sino Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // WHILE ::= Mientras Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("WHILE",6, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // DO_WHILE ::= Hacer Llave_a SENTENCIA Llave_c Mientras Parentesis_a SENTENCIA_BOOLEANA Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DO_WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // FOR ::= Para Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("FOR",8, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SENTENCIA_FOR ::= T_dato Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // SENTENCIA_FOR ::= Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // DECLARACION_FOR ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // DECLARACION_FOR ::= Identificador Op_incremento 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // DECLARACION_FOR ::= Op_incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintax2$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax2$stack.elementAt(CUP$Sintax2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax2$stack.peek()), RESULT);
            }
          return CUP$Sintax2$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintax2$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintax2$do_action(
    int                        CUP$Sintax2$act_num,
    java_cup.runtime.lr_parser CUP$Sintax2$parser,
    java.util.Stack            CUP$Sintax2$stack,
    int                        CUP$Sintax2$top)
    throws java.lang.Exception
    {
              return CUP$Sintax2$do_action_part00000000(
                               CUP$Sintax2$act_num,
                               CUP$Sintax2$parser,
                               CUP$Sintax2$stack,
                               CUP$Sintax2$top);
    }
}

}
