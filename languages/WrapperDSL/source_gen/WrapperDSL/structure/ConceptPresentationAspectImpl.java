package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_AdviseScript;
  private ConceptPresentation props_AltitudeConditionalExpression;
  private ConceptPresentation props_AngularAccelerationConditionalExpression;
  private ConceptPresentation props_BatteryConditionalExpression;
  private ConceptPresentation props_CameraPowerConditionalExtension;
  private ConceptPresentation props_CategoricalDistanceConditionalExpression;
  private ConceptPresentation props_CategoricalWindConditionalExpression;
  private ConceptPresentation props_Command;
  private ConceptPresentation props_CompassConditionalExpression;
  private ConceptPresentation props_ConditionalExpression;
  private ConceptPresentation props_ConjunctionLogicalExpression;
  private ConceptPresentation props_CoordenateConditionalExpression;
  private ConceptPresentation props_DisjunctionLogicalExpression;
  private ConceptPresentation props_ExceptionalScenario;
  private ConceptPresentation props_Expression;
  private ConceptPresentation props_GimbalConditionalExtension;
  private ConceptPresentation props_Given;
  private ConceptPresentation props_If;
  private ConceptPresentation props_LandingGearConditionalExtension;
  private ConceptPresentation props_LinearAccelerationConditionalExtension;
  private ConceptPresentation props_LogicalExpression;
  private ConceptPresentation props_MathElement;
  private ConceptPresentation props_MotorsPowerConditionalExtension;
  private ConceptPresentation props_OriginAndDestinationDistanceConditionalExpression;
  private ConceptPresentation props_PayloadConditionalExtension;
  private ConceptPresentation props_PointCut;
  private ConceptPresentation props_RegionConditionalExpression;
  private ConceptPresentation props_ScalarDistanceConditionalExpression;
  private ConceptPresentation props_ScalarWindConditionalExpression;
  private ConceptPresentation props_SpeedConditionalExpression;
  private ConceptPresentation props_Statement;
  private ConceptPresentation props_Text;
  private ConceptPresentation props_Then;
  private ConceptPresentation props_Value;
  private ConceptPresentation props_When;
  private ConceptPresentation props_While;
  private ConceptPresentation props_WifiConditionalExtension;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.AdviseScript:
        if (props_AdviseScript == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_AdviseScript = cpb.create();
        }
        return props_AdviseScript;
      case LanguageConceptSwitch.AltitudeConditionalExpression:
        if (props_AltitudeConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( altitude [is|is not|>|<|>=|<=] n Km )");
          cpb.rawPresentation("AltitudeConditionalExpression");
          props_AltitudeConditionalExpression = cpb.create();
        }
        return props_AltitudeConditionalExpression;
      case LanguageConceptSwitch.AngularAccelerationConditionalExpression:
        if (props_AngularAccelerationConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( angular acceleration in [x|y|z] [is|is not|>|<|>=|<=] n °/s )");
          cpb.rawPresentation("AngularAccelerationConditionalExpression");
          props_AngularAccelerationConditionalExpression = cpb.create();
        }
        return props_AngularAccelerationConditionalExpression;
      case LanguageConceptSwitch.BatteryConditionalExpression:
        if (props_BatteryConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("(battery [is|is not|>|<|>=|<=] n%)");
          cpb.rawPresentation("BatteryConditionalExpression");
          props_BatteryConditionalExpression = cpb.create();
        }
        return props_BatteryConditionalExpression;
      case LanguageConceptSwitch.CameraPowerConditionalExtension:
        if (props_CameraPowerConditionalExtension == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( camera's power [is|is not] [on|off] )");
          cpb.rawPresentation("CameraPowerConditionalExtension");
          props_CameraPowerConditionalExtension = cpb.create();
        }
        return props_CameraPowerConditionalExtension;
      case LanguageConceptSwitch.CategoricalDistanceConditionalExpression:
        if (props_CategoricalDistanceConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("(distance from [origin|destination] [is|is not|>|<|>=|<=] distance to [origin|destination])");
          cpb.rawPresentation("CategoricalDistanceConditionalExpression");
          props_CategoricalDistanceConditionalExpression = cpb.create();
        }
        return props_CategoricalDistanceConditionalExpression;
      case LanguageConceptSwitch.CategoricalWindConditionalExpression:
        if (props_CategoricalWindConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("(wind [is|not is] [light|normal|strong])");
          cpb.rawPresentation("CategoricalWindConditionalExpression");
          props_CategoricalWindConditionalExpression = cpb.create();
        }
        return props_CategoricalWindConditionalExpression;
      case LanguageConceptSwitch.Command:
        if (props_Command == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Command");
          props_Command = cpb.create();
        }
        return props_Command;
      case LanguageConceptSwitch.CompassConditionalExpression:
        if (props_CompassConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( direction of drone [is|is not] direction )");
          cpb.rawPresentation("CompassConditionalExpression");
          props_CompassConditionalExpression = cpb.create();
        }
        return props_CompassConditionalExpression;
      case LanguageConceptSwitch.ConditionalExpression:
        if (props_ConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ConditionalExpression = cpb.create();
        }
        return props_ConditionalExpression;
      case LanguageConceptSwitch.ConjunctionLogicalExpression:
        if (props_ConjunctionLogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ConjunctionLogicalExpression");
          props_ConjunctionLogicalExpression = cpb.create();
        }
        return props_ConjunctionLogicalExpression;
      case LanguageConceptSwitch.CoordenateConditionalExpression:
        if (props_CoordenateConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("CoordenateConditionalExpression");
          props_CoordenateConditionalExpression = cpb.create();
        }
        return props_CoordenateConditionalExpression;
      case LanguageConceptSwitch.DisjunctionLogicalExpression:
        if (props_DisjunctionLogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DisjunctionLogicalExpression");
          props_DisjunctionLogicalExpression = cpb.create();
        }
        return props_DisjunctionLogicalExpression;
      case LanguageConceptSwitch.ExceptionalScenario:
        if (props_ExceptionalScenario == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ExceptionalScenario = cpb.create();
        }
        return props_ExceptionalScenario;
      case LanguageConceptSwitch.Expression:
        if (props_Expression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Expression = cpb.create();
        }
        return props_Expression;
      case LanguageConceptSwitch.GimbalConditionalExtension:
        if (props_GimbalConditionalExtension == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( gimbal [is|is not] [on|off] )");
          cpb.rawPresentation("GimbalConditionalExtension");
          props_GimbalConditionalExtension = cpb.create();
        }
        return props_GimbalConditionalExtension;
      case LanguageConceptSwitch.Given:
        if (props_Given == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Given");
          props_Given = cpb.create();
        }
        return props_Given;
      case LanguageConceptSwitch.If:
        if (props_If == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("If");
          props_If = cpb.create();
        }
        return props_If;
      case LanguageConceptSwitch.LandingGearConditionalExtension:
        if (props_LandingGearConditionalExtension == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( landing gear [is|is not] [on|off] )");
          cpb.rawPresentation("LandingGearConditionalExtension");
          props_LandingGearConditionalExtension = cpb.create();
        }
        return props_LandingGearConditionalExtension;
      case LanguageConceptSwitch.LinearAccelerationConditionalExtension:
        if (props_LinearAccelerationConditionalExtension == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( linear acceleration in [x|y|z] [is|is not|>|<|>=|<=] n m/s² )");
          cpb.rawPresentation("LinearAccelerationConditionalExtension");
          props_LinearAccelerationConditionalExtension = cpb.create();
        }
        return props_LinearAccelerationConditionalExtension;
      case LanguageConceptSwitch.LogicalExpression:
        if (props_LogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("(expresson A [and|or] expression B)");
          cpb.rawPresentation("LogicalExpression");
          props_LogicalExpression = cpb.create();
        }
        return props_LogicalExpression;
      case LanguageConceptSwitch.MathElement:
        if (props_MathElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_MathElement = cpb.create();
        }
        return props_MathElement;
      case LanguageConceptSwitch.MotorsPowerConditionalExtension:
        if (props_MotorsPowerConditionalExtension == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( motor's power [is|is not] [on|off] )");
          cpb.rawPresentation("MotorsPowerConditionalExtension");
          props_MotorsPowerConditionalExtension = cpb.create();
        }
        return props_MotorsPowerConditionalExtension;
      case LanguageConceptSwitch.OriginAndDestinationDistanceConditionalExpression:
        if (props_OriginAndDestinationDistanceConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("([origin|destination] distance [is|is not|>|<|>=|<=] n km)");
          cpb.rawPresentation("OriginAndDestinationDistanceConditionalExpression");
          props_OriginAndDestinationDistanceConditionalExpression = cpb.create();
        }
        return props_OriginAndDestinationDistanceConditionalExpression;
      case LanguageConceptSwitch.PayloadConditionalExtension:
        if (props_PayloadConditionalExtension == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( It [is|is not] carrying a payload )");
          cpb.rawPresentation("PayloadConditionalExtension");
          props_PayloadConditionalExtension = cpb.create();
        }
        return props_PayloadConditionalExtension;
      case LanguageConceptSwitch.PointCut:
        if (props_PointCut == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53be3ecc046e0b59L, 0x53be3ecc046e0b68L, "adviseScript", "", "");
          props_PointCut = cpb.create();
        }
        return props_PointCut;
      case LanguageConceptSwitch.RegionConditionalExpression:
        if (props_RegionConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Drone [is|not is] over [water|land|origin|destination] region");
          cpb.rawPresentation("RegionConditionalExpression");
          props_RegionConditionalExpression = cpb.create();
        }
        return props_RegionConditionalExpression;
      case LanguageConceptSwitch.ScalarDistanceConditionalExpression:
        if (props_ScalarDistanceConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("(distance from [origin|destination][is|not is|>|<|>=|<=] n km)");
          cpb.rawPresentation("ScalarDistanceConditionalExpression");
          props_ScalarDistanceConditionalExpression = cpb.create();
        }
        return props_ScalarDistanceConditionalExpression;
      case LanguageConceptSwitch.ScalarWindConditionalExpression:
        if (props_ScalarWindConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("(wind [is|not is|>|<|>=|<=] n km)");
          cpb.rawPresentation("ScalarWindConditionalExpression");
          props_ScalarWindConditionalExpression = cpb.create();
        }
        return props_ScalarWindConditionalExpression;
      case LanguageConceptSwitch.SpeedConditionalExpression:
        if (props_SpeedConditionalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("(speed [is|isn't|<|>|>=|<=] n m/s)");
          cpb.rawPresentation("SpeedConditionalExpression");
          props_SpeedConditionalExpression = cpb.create();
        }
        return props_SpeedConditionalExpression;
      case LanguageConceptSwitch.Statement:
        if (props_Statement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Statement = cpb.create();
        }
        return props_Statement;
      case LanguageConceptSwitch.Text:
        if (props_Text == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Text");
          props_Text = cpb.create();
        }
        return props_Text;
      case LanguageConceptSwitch.Then:
        if (props_Then == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Then");
          props_Then = cpb.create();
        }
        return props_Then;
      case LanguageConceptSwitch.Value:
        if (props_Value == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Value");
          props_Value = cpb.create();
        }
        return props_Value;
      case LanguageConceptSwitch.When:
        if (props_When == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("When");
          props_When = cpb.create();
        }
        return props_When;
      case LanguageConceptSwitch.While:
        if (props_While == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("While");
          props_While = cpb.create();
        }
        return props_While;
      case LanguageConceptSwitch.WifiConditionalExtension:
        if (props_WifiConditionalExtension == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("( wifi [is|is not] [on|off] )");
          cpb.rawPresentation("WifiConditionalExtension");
          props_WifiConditionalExtension = cpb.create();
        }
        return props_WifiConditionalExtension;
    }
    return null;
  }
}
