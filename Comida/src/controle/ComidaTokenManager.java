/* ComidaTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ComidaTokenManager.java */
package controle;

/** Token Manager. */
public class ComidaTokenManager implements ComidaConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x600033fc0L) != 0L)
         {
            jjmatchedKind = 43;
            return -1;
         }
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 44;
            return -1;
         }
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 43;
            return 13;
         }
         return -1;
      case 1:
         if ((active0 & 0x600037fc0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x10000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 44;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x600037fc0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0x200037ec0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x37ec0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x37e80L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x27c00L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x27800L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x27000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x27000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x23000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x23000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x22000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 15);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 39:
         return jjStopAtPos(0, 26);
      case 40:
         return jjStopAtPos(0, 20);
      case 41:
         return jjStopAtPos(0, 21);
      case 42:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 43:
         return jjStopAtPos(0, 28);
      case 44:
         return jjStopAtPos(0, 24);
      case 45:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 47:
         return jjStopAtPos(0, 31);
      case 58:
         return jjStopAtPos(0, 18);
      case 59:
         return jjStopAtPos(0, 25);
      case 60:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 61:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 62:
         jjmatchedKind = 35;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 95:
         return jjStopAtPos(0, 19);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x400003000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x500L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 123:
         return jjStopAtPos(0, 22);
      case 125:
         return jjStopAtPos(0, 23);
      default :
         return jjMoveNfa_0(14, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 61:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      case 62:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x7200L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x10040L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 227:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000080L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 109:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(2, 34);
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 111:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(2, 8);
         break;
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x3000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x3200L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 106:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 109:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(3, 33);
         break;
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x4080L);
      case 104:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x3000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 122:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(4, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 97:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(5, 16);
         return jjMoveStringLiteralDfa6_0(active0, 0x23000L);
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(5, 9);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 111:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(5, 7);
         break;
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa7_0(active0, 0x3000L);
      case 97:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(6, 10);
         break;
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(7, 11);
         break;
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
      case 112:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000L);
      case 113:
         return jjMoveStringLiteralDfa8_0(active0, 0x20000L);
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000L);
      case 115:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000L);
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x22000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(9, 14);
         break;
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x20000L);
      case 108:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000L);
      case 115:
         return jjMoveStringLiteralDfa10_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 104:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000L);
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x20000L);
      case 116:
         return jjMoveStringLiteralDfa11_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(11, 12);
         break;
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x2000L);
      case 114:
         return jjMoveStringLiteralDfa12_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(12, 17);
         break;
      case 99:
         return jjMoveStringLiteralDfa13_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(13, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec1 = {
   0x0L, 0x0L, 0x0L, 0x438268fL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0x0L, 0x438268f00000000L
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 42;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     { jjCheckNAddStates(0, 2); }
                  }
                  else if ((0x8000007a00000000L & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                  }
                  else if (curChar == 46)
                  {
                     if (kind > 45)
                        kind = 45;
                  }
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjAddStates(3, 5); }
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 3:
                  if (curChar == 10 && kind > 4)
                     kind = 4;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 16:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 17:
                  if (curChar == 42)
                     { jjAddStates(6, 7); }
                  break;
               case 18:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(19, 17); }
                  break;
               case 19:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(19, 17); }
                  break;
               case 20:
                  if (curChar == 47 && kind > 5)
                     kind = 5;
                  break;
               case 35:
                  if ((0x8000007a00000000L & l) != 0L && kind > 44)
                     kind = 44;
                  break;
               case 36:
                  if (curChar == 46 && kind > 45)
                     kind = 45;
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  { jjCheckNAdd(38); }
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(39, 40); }
                  break;
               case 40:
                  if (curChar == 46)
                     { jjCheckNAdd(41); }
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  { jjCheckNAdd(41); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                  }
                  else if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                  }
                  else if ((0x10000000d0000001L & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                  }
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 31;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 0:
                  if (curChar == 101)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 1:
                  { jjCheckNAddStates(3, 5); }
                  break;
               case 5:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 6:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 15:
                  if (curChar == 101)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 16:
                  { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 18:
               case 19:
                  { jjCheckNAddTwoStates(19, 17); }
                  break;
               case 21:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 22:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if ((0x7fffffeL & l) != 0L && kind > 42)
                     kind = 42;
                  break;
               case 34:
                  if ((0x7fffffe00000000L & l) != 0L && kind > 43)
                     kind = 43;
                  break;
               case 35:
                  if ((0x10000000d0000001L & l) != 0L && kind > 44)
                     kind = 44;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if ((jjbitVec1[i2] & l2) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                  }
                  if ((jjbitVec2[i2] & l2) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                  }
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(3, 5); }
                  break;
               case 16:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 18:
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(19, 17); }
                  break;
               case 33:
                  if ((jjbitVec1[i2] & l2) != 0L && kind > 42)
                     kind = 42;
                  break;
               case 34:
                  if ((jjbitVec2[i2] & l2) != 0L && kind > 43)
                     kind = 43;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 42 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\141\162\162\157\172", 
"\146\145\151\152\141\157", "\160\343\157", "\163\141\154\141\155\145", "\160\151\155\145\156\164\141", 
"\154\151\156\147\165\151\143\141", "\142\141\164\141\164\141\137\160\141\154\150\141", 
"\142\141\164\141\164\141\137\162\165\163\164\151\143\141", "\164\141\137\156\141\137\155\145\163\141", "\12", "\147\162\145\154\150\141", 
"\143\150\165\162\162\141\163\161\165\145\151\162\141", "\72", "\137", "\50", "\51", "\173", "\175", "\54", "\73", "\47", "\55\76", 
"\53", "\55", "\52", "\57", "\52\52", "\162\165\151\155", "\142\157\155", "\76", 
"\74", "\74\75", "\76\75", "\75", "\41\75", "\75\75", null, null, null, null, null, 
null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   38, 39, 40, 1, 2, 4, 18, 20, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public ComidaTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public ComidaTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 42; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7fffffffffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[42];
    static private final int[] jjstateSet = new int[2 * 42];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
