/* Comida.java */
/* Generated By:JavaCC: Do not edit this line. Comida.java */
package controle;

public class Comida implements ComidaConstants {
  public static void main(String args []) throws ParseException
  {
    Comida parser = new Comida(System.in);
    while (true)
    {
      System.out.println("Sirva Seu Prato");
      try
      {
        Comida.programa();
        System.out.println("A MESA TA PRONTA.");
      }
      catch (Exception e)
      {
        System.out.println("Foi encontrado uva passa no arroz.");
        System.out.println(e.getMessage());
        Comida.ReInit(System.in);
      }
      catch (Error e)
      {
        System.out.println("FOI ENCONTRADO PURE NO CACHORRO QUENTE.");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  static final public void arroz() throws ParseException {
    jj_consume_token(ARROZ);
}

  static final public void feijao() throws ParseException {
    jj_consume_token(FEIJAO);
}

  static final public void pao() throws ParseException {
    jj_consume_token(PAO);
}

  static final public void salame() throws ParseException {
    jj_consume_token(SALAME);
}

  static final public void pimenta() throws ParseException {
    jj_consume_token(PIMENTA);
}

  static final public void linguica() throws ParseException {
    jj_consume_token(LINGUICA);
}

  static final public void se() throws ParseException {
    jj_consume_token(BATATA_PALHA);
}

  static final public void seNao() throws ParseException {
    jj_consume_token(BATATA_RUSTICA);
}

  static final public void enter() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ENTER:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(ENTER);
    }
}

  static final public void abreParenteses() throws ParseException {
    jj_consume_token(ABRE_PARENTESES);
}

  static final public void grelha() throws ParseException {
    jj_consume_token(GRELHA);
}

  static final public void churrasqueira() throws ParseException {
    jj_consume_token(CHURRASQUEIRA);
}

  static final public void fechaParenteses() throws ParseException {
    jj_consume_token(FECHA_PARENTESES);
}

  static final public void abreChave() throws ParseException {
    jj_consume_token(ABRE_CHAVE);
}

  static final public void fechaChave() throws ParseException {
    jj_consume_token(FECHA_CHAVE);
}

  static final public void virgula() throws ParseException {
    jj_consume_token(VIRGULA);
}

  static final public void pontoVirgula() throws ParseException {
    jj_consume_token(PONTO_VIRGULA);
}

  static final public void igual() throws ParseException {
    jj_consume_token(IGUAL);
}

  static final public void diferente() throws ParseException {
    jj_consume_token(DIFERENTE);
}

  static final public void igualLogico() throws ParseException {
    jj_consume_token(IGUAL_LOGICO);
}

  static final public void menor() throws ParseException {
    jj_consume_token(MENOR);
}

  static final public void maior() throws ParseException {
    jj_consume_token(MAIOR);
}

  static final public void menorIgual() throws ParseException {
    jj_consume_token(MENOR_IGUAL);
}

  static final public void maiorIgual() throws ParseException {
    jj_consume_token(MAIOR_IGUAL);
}

  static final public void igual_logico() throws ParseException {
    jj_consume_token(IGUAL_LOGICO);
}

  static final public void delimitaTexto() throws ParseException {
    jj_consume_token(DELIMITAR_TEXTO);
}

  static final public void seta() throws ParseException {
    jj_consume_token(SETA);
}

  static final public void mais() throws ParseException {
    jj_consume_token(PLUS);
}

  static final public void menos() throws ParseException {
    jj_consume_token(MINUS);
}

  static final public void multiplica() throws ParseException {
    jj_consume_token(MULTIPLY);
}

  static final public void divide() throws ParseException {
    jj_consume_token(DIVIDE);
}

  static final public void exponencial() throws ParseException {
    jj_consume_token(EXP);
}

//void concatena() :
//{}
//{
//  <CONCAT>
//}
  static final public 
void falso() throws ParseException {
    jj_consume_token(FALSO);
}

  static final public void verdadeiro() throws ParseException {
    jj_consume_token(VERDADEIRO);
}

  static final public void ta_na_mesa() throws ParseException {
    jj_consume_token(TA_NA_MESA);
}

  static final public void programa() throws ParseException {
    enter();
    arroz();
    enter();
    abreChave();
    enter();
    comandos();
    enter();
    fechaChave();
    enter();
    feijao();
}

  static final public void numero() throws ParseException {
    jj_consume_token(NUMERO);
}

  static final public void letra() throws ParseException {
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LETRA_MINUSCULA:{
        letraMinuscula();
        break;
        }
      case LETRA_MAIUSCULA:{
        letraMaiuscula();
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LETRA_MAIUSCULA:
      case LETRA_MINUSCULA:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
    }
}

  static final public void letraMinuscula() throws ParseException {
    jj_consume_token(LETRA_MINUSCULA);
}

  static final public void letraMaiuscula() throws ParseException {
    jj_consume_token(LETRA_MAIUSCULA);
}

  static final public void ponto() throws ParseException {
    jj_consume_token(PONTO);
}

  static final public void doisPontos() throws ParseException {
    jj_consume_token(DOIS_PONTOS);
}

  static final public void underline() throws ParseException {
    jj_consume_token(UNDERLINE);
}

  static final public void caractereEspecial() throws ParseException {
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CARACTERE_ESPECIAL:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      jj_consume_token(CARACTERE_ESPECIAL);
    }
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DOIS_PONTOS:
      case UNDERLINE:{
        ;
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DOIS_PONTOS:{
        doisPontos();
        break;
        }
      case UNDERLINE:{
        underline();
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

  static final public void operadorLogico() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MENOR:{
        menor();
        break;
        }
      case MAIOR:{
        maior();
        break;
        }
      case MENOR_IGUAL:{
        menorIgual();
        break;
        }
      case MAIOR_IGUAL:{
        maiorIgual();
        break;
        }
      case DIFERENTE:{
        diferente();
        break;
        }
      case IGUAL_LOGICO:{
        igual_logico();
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
System.err.println("Operador L\u00f3gico-> " + e.getMessage());
    }
}

  static final public void id() throws ParseException {
    try {
      letra();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case UNDERLINE:
        case LETRA_MAIUSCULA:
        case LETRA_MINUSCULA:
        case NUMERO:{
          ;
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          break label_5;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LETRA_MAIUSCULA:
        case LETRA_MINUSCULA:{
          letra();
          break;
          }
        case NUMERO:{
          numero();
          break;
          }
        case UNDERLINE:{
          underline();
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (ParseException e) {
System.err.println("ID -> " + e.getMessage());
    }
}

  static final public void termoTexto() throws ParseException {
    delimitaTexto();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LETRA_MAIUSCULA:
      case LETRA_MINUSCULA:
      case NUMERO:{
        ;
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LETRA_MAIUSCULA:
      case LETRA_MINUSCULA:{
        letra();
        break;
        }
      case NUMERO:{
        numero();
        caractereEspecial();
        enter();
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    delimitaTexto();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LETRA_MAIUSCULA:
      case LETRA_MINUSCULA:{
        ;
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        break label_7;
      }
      id();
    }
}

  static final public void texto() throws ParseException {
    try {
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case DELIMITAR_TEXTO:{
          ;
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          break label_8;
        }
        termoTexto();
      }
    } catch (ParseException e) {
System.err.println("TEXTO -> " + e.getMessage());
    }
}

  static final public void comandos() throws ParseException {
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PAO:
      case SALAME:
      case PIMENTA:
      case LINGUICA:
      case BATATA_PALHA:
      case TA_NA_MESA:
      case GRELHA:
      case CHURRASQUEIRA:
      case ABRE_PARENTESES:
      case MINUS:
      case FALSO:
      case VERDADEIRO:
      case LETRA_MAIUSCULA:
      case LETRA_MINUSCULA:
      case NUMERO:{
        ;
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        break label_9;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TA_NA_MESA:{
        imprimir();
        enter();
        break;
        }
      case PAO:
      case SALAME:
      case PIMENTA:
      case LINGUICA:{
        declaracao();
        enter();
        break;
        }
      case LETRA_MAIUSCULA:
      case LETRA_MINUSCULA:{
        atribuicao();
        enter();
        break;
        }
      case ABRE_PARENTESES:
      case MINUS:
      case FALSO:
      case VERDADEIRO:
      case NUMERO:{
        expressao();
        enter();
        break;
        }
      case BATATA_PALHA:{
        condicional();
        enter();
        break;
        }
      case GRELHA:
      case CHURRASQUEIRA:{
        loop();
        enter();
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

  static final public void imprimir() throws ParseException {
    try {
      ta_na_mesa();
      enter();
      abreParenteses();
      enter();
      texto();
      enter();
      fechaParenteses();
      enter();
      pontoVirgula();
      enter();
    } catch (ParseException e) {
System.err.println("imprimir-> " + e.getMessage());
    }
}

  static final public void declaracao() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PAO:{
      pao();
      break;
      }
    case SALAME:{
      salame();
      break;
      }
    case PIMENTA:{
      pimenta();
      break;
      }
    case LINGUICA:{
      linguica();
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    id();
    enter();
    pontoVirgula();
    enter();
}

  static final public void expressao() throws ParseException {
    sum();
}

  static final public void atribuicao() throws ParseException {
    id();
    igual();
    expressao();
    pontoVirgula();
    enter();
}

  static final public void sum() throws ParseException {
    term();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:{
        ;
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        break label_10;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:{
        mais();
        break;
        }
      case MINUS:{
        menos();
        break;
        }
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      term();
    }
}

  static final public void term() throws ParseException {
    unary();
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MULTIPLY:
      case DIVIDE:
      case EXP:{
        ;
        break;
        }
      default:
        jj_la1[18] = jj_gen;
        break label_11;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MULTIPLY:{
        multiplica();
        break;
        }
      case DIVIDE:{
        divide();
        break;
        }
      case EXP:{
        exponencial();
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      unary();
    }
}

  static final public void unary() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MINUS:{
      menos();
      element();
      break;
      }
    case ABRE_PARENTESES:
    case FALSO:
    case VERDADEIRO:
    case LETRA_MAIUSCULA:
    case LETRA_MINUSCULA:
    case NUMERO:{
      element();
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void element() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMERO:{
      numero();
      break;
      }
    case LETRA_MAIUSCULA:
    case LETRA_MINUSCULA:{
      id();
      break;
      }
    case FALSO:{
      falso();
      break;
      }
    case VERDADEIRO:{
      verdadeiro();
      break;
      }
    case ABRE_PARENTESES:{
      abreParenteses();
      sum();
      fechaParenteses();
      break;
      }
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void condicional() throws ParseException {
    se();
    doisPontos();
    condicao();
    abreChave();
    enter();
    comandos();
    enter();
    fechaChave();
    enter();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case BATATA_RUSTICA:{
      seNao();
      abreChave();
      enter();
      comandos();
      enter();
      fechaChave();
      break;
      }
    default:
      jj_la1[22] = jj_gen;
      ;
    }
    enter();
}

  static final public void condicao() throws ParseException {
    expressao();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IGUAL_LOGICO:{
      igualLogico();
      break;
      }
    case DIFERENTE:{
      diferente();
      break;
      }
    case MAIOR:{
      maior();
      break;
      }
    case MENOR:{
      menor();
      break;
      }
    case MAIOR_IGUAL:{
      maiorIgual();
      break;
      }
    case MENOR_IGUAL:{
      menorIgual();
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    expressao();
}

  static final public void loop() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case GRELHA:{
      grelha();
      doisPontos();
      expressao();
      seta();
      condicao();
      seta();
      atribuicao();
      abreChave();
      comandos();
      fechaChave();
      break;
      }
    case CHURRASQUEIRA:{
      churrasqueira();
      abreParenteses();
      condicao();
      fechaParenteses();
      abreChave();
      enter();
      comandos();
      enter();
      fechaChave();
      enter();
      break;
      }
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ComidaTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[25];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x8000,0x0,0x0,0x0,0xc0000,0xc0000,0x0,0x80000,0x80000,0x0,0x0,0x0,0x4000000,0x20135f00,0x20135f00,0xf00,0x30000000,0x30000000,0xc0000000,0xc0000000,0x20100000,0x100000,0x2000,0x0,0x30000,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x0,0x1800,0x1800,0x2000,0x0,0x0,0x6f0,0x9800,0x9800,0x9800,0x9800,0x1800,0x0,0x980c,0x980c,0x0,0x0,0x0,0x1,0x1,0x980c,0x980c,0x0,0x6f0,0x0,};
	}

  /** Constructor with InputStream. */
  public Comida(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Comida(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new ComidaTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Comida(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new ComidaTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new ComidaTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Comida(ComidaTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ComidaTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[49];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 25; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 49; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
