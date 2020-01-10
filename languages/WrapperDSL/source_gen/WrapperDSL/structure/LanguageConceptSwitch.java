package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AdviseScript = 0;
  public static final int BatteryConditionalExpression = 1;
  public static final int Command = 2;
  public static final int ConditionalExpression = 3;
  public static final int ConjunctionLogicalExpression = 4;
  public static final int CoordenateConditionalExpression = 5;
  public static final int DisjunctionLogicalExpression = 6;
  public static final int DistanceConditionalExpression = 7;
  public static final int ExceptionalScenario = 8;
  public static final int Expression = 9;
  public static final int ExpressionA = 10;
  public static final int Given = 11;
  public static final int If = 12;
  public static final int LogicalExpression = 13;
  public static final int MathElement = 14;
  public static final int PointCut = 15;
  public static final int RegionConditionalExpression = 16;
  public static final int Statement = 17;
  public static final int Text = 18;
  public static final int Then = 19;
  public static final int Value = 20;
  public static final int When = 21;
  public static final int While = 22;
  public static final int WindConditionalExpression = 23;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L);
    builder.put(0x53be3ecc046e0b54L, AdviseScript);
    builder.put(0x53be3ecc04699240L, BatteryConditionalExpression);
    builder.put(0x53be3ecc047dcb4aL, Command);
    builder.put(0x7970d3ea932a97ffL, ConditionalExpression);
    builder.put(0x53be3ecc045a8c9bL, ConjunctionLogicalExpression);
    builder.put(0x53be3ecc045a8ce3L, CoordenateConditionalExpression);
    builder.put(0x53be3ecc045a8c9cL, DisjunctionLogicalExpression);
    builder.put(0x53be3ecc048c5944L, DistanceConditionalExpression);
    builder.put(0x53be3ecc045a8bc3L, ExceptionalScenario);
    builder.put(0x53be3ecc046bd51aL, Expression);
    builder.put(0x7970d3ea932ed73dL, ExpressionA);
    builder.put(0x53be3ecc045a8bcaL, Given);
    builder.put(0x53be3ecc045b45abL, If);
    builder.put(0x7970d3ea932a97fbL, LogicalExpression);
    builder.put(0x53be3ecc045a8bd6L, MathElement);
    builder.put(0x53be3ecc046e0b59L, PointCut);
    builder.put(0x53be3ecc045a8ce0L, RegionConditionalExpression);
    builder.put(0x53be3ecc045b453cL, Statement);
    builder.put(0x53be3ecc0462d3feL, Text);
    builder.put(0x53be3ecc045a8bccL, Then);
    builder.put(0x53be3ecc0462d3fbL, Value);
    builder.put(0x53be3ecc045a8bcbL, When);
    builder.put(0x53be3ecc045b45acL, While);
    builder.put(0x53be3ecc045a8cddL, WindConditionalExpression);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}