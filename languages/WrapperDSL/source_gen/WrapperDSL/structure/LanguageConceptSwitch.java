package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AdviseScript = 0;
  public static final int AltitudeConditionalExpression = 1;
  public static final int BatteryConditionalExpression = 2;
  public static final int CameraPowerConditionalExtension = 3;
  public static final int CategoricalDistanceConditionalExpression = 4;
  public static final int CategoricalWindConditionalExpression = 5;
  public static final int Command = 6;
  public static final int CompassConditionalExpression = 7;
  public static final int ConditionalExpression = 8;
  public static final int ConjunctionLogicalExpression = 9;
  public static final int CoordenateConditionalExpression = 10;
  public static final int DisjunctionLogicalExpression = 11;
  public static final int ExceptionalScenario = 12;
  public static final int Expression = 13;
  public static final int GimbalConditionalExtension = 14;
  public static final int Given = 15;
  public static final int If = 16;
  public static final int LandingGearConditionalExtension = 17;
  public static final int LogicalExpression = 18;
  public static final int MathElement = 19;
  public static final int MotorsPowerConditionalExtension = 20;
  public static final int OriginAndDestinationDistanceConditionalExpression = 21;
  public static final int PayloadConditionalExtension = 22;
  public static final int PointCut = 23;
  public static final int RegionConditionalExpression = 24;
  public static final int ScalarDistanceConditionalExpression = 25;
  public static final int ScalarWindConditionalExpression = 26;
  public static final int SpeedConditionalExpression = 27;
  public static final int Statement = 28;
  public static final int Text = 29;
  public static final int Then = 30;
  public static final int Value = 31;
  public static final int When = 32;
  public static final int While = 33;
  public static final int WifiConditionalExtension = 34;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L);
    builder.put(0x53be3ecc046e0b54L, AdviseScript);
    builder.put(0x1053550ed8ac3a37L, AltitudeConditionalExpression);
    builder.put(0x53be3ecc04699240L, BatteryConditionalExpression);
    builder.put(0x1053550ed8b71613L, CameraPowerConditionalExtension);
    builder.put(0x7970d3ea933febfdL, CategoricalDistanceConditionalExpression);
    builder.put(0x53be3ecc045a8cddL, CategoricalWindConditionalExpression);
    builder.put(0x53be3ecc047dcb4aL, Command);
    builder.put(0x3f0a90391eda7f7L, CompassConditionalExpression);
    builder.put(0x7970d3ea932a97ffL, ConditionalExpression);
    builder.put(0x53be3ecc045a8c9bL, ConjunctionLogicalExpression);
    builder.put(0x53be3ecc045a8ce3L, CoordenateConditionalExpression);
    builder.put(0x53be3ecc045a8c9cL, DisjunctionLogicalExpression);
    builder.put(0x53be3ecc045a8bc3L, ExceptionalScenario);
    builder.put(0x7970d3ea932ed73dL, Expression);
    builder.put(0x1053550ed8b71646L, GimbalConditionalExtension);
    builder.put(0x53be3ecc045a8bcaL, Given);
    builder.put(0x53be3ecc045b45abL, If);
    builder.put(0x1053550ed8b3fbfaL, LandingGearConditionalExtension);
    builder.put(0x7970d3ea932a97fbL, LogicalExpression);
    builder.put(0x53be3ecc045a8bd6L, MathElement);
    builder.put(0x1053550ed8b2a0a3L, MotorsPowerConditionalExtension);
    builder.put(0x72508e21f03ced43L, OriginAndDestinationDistanceConditionalExpression);
    builder.put(0x1053550ed8b3fc74L, PayloadConditionalExtension);
    builder.put(0x53be3ecc046e0b59L, PointCut);
    builder.put(0x53be3ecc045a8ce0L, RegionConditionalExpression);
    builder.put(0x53be3ecc048c5944L, ScalarDistanceConditionalExpression);
    builder.put(0x7970d3ea93368919L, ScalarWindConditionalExpression);
    builder.put(0x3f0a90391ea8938L, SpeedConditionalExpression);
    builder.put(0x53be3ecc045b453cL, Statement);
    builder.put(0x53be3ecc0462d3feL, Text);
    builder.put(0x53be3ecc045a8bccL, Then);
    builder.put(0x53be3ecc0462d3fbL, Value);
    builder.put(0x53be3ecc045a8bcbL, When);
    builder.put(0x53be3ecc045b45acL, While);
    builder.put(0x1053550ed8b3fc39L, WifiConditionalExtension);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
