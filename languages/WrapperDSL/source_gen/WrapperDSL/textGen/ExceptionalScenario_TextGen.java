package WrapperDSL.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SReferenceLink;

public class ExceptionalScenario_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("package wrappers;\n\n");

    tgs.append("//IMPORTS//\n");
    tgs.append("//JAVA IMPORTS\n");
    tgs.append("import javafx.application.Platform;\nimport javafx.concurrent.Task;\nimport org.aspectj.lang.JoinPoint;\nimport java.util.ArrayList;\nimport java.util.List;\n");
    tgs.append("//JAVA IMPORTS\n\n");

    tgs.append("//Dragonfly API IMPORTS\n");
    tgs.append("import controller.*;");
    tgs.newLine();
    tgs.append("import model.entity.drone.*;");
    tgs.newLine();
    tgs.append("import model.entity.drone.sensors.*;");
    tgs.newLine();
    tgs.append("import util.*;");
    tgs.newLine();
    tgs.append("import view.*;");
    tgs.newLine();
    tgs.append("import view.drone.*;");
    tgs.newLine();

    tgs.append("//Dragonfly API IMPORTS\n\n");
    tgs.append("//IMPORTS//\n\n");

    tgs.pushTextArea("HEADER");
    tgs.append("public aspect ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.name$tAp1));
    tgs.append("{\n");
    tgs.popTextArea();
    tgs.pushTextArea("HEADER");
    tgs.append("private boolean alreadyExecuting = false;");
    tgs.newLine();
    tgs.popTextArea();
    tgs.pushTextArea("pointcut");
    transformationOperations.whenToPointcut(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.when$Bwg0), ctx);
    tgs.append("\n");
    tgs.popTextArea();
    tgs.pushTextArea("conditionalAdvice");
    transformationOperations.whenAndThenToContitionalPointCutCall(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.when$Bwg0), SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.then$BwrC), ctx);
    tgs.popTextArea();
    tgs.pushTextArea("conditionalAdvice");
    tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.given$Bwf2));
    tgs.append("\n");
    tgs.popTextArea();
    tgs.pushTextArea("advice");
    tgs.append("{\n");
    tgs.popTextArea();
    tgs.pushTextArea("advice");
    tgs.appendNode(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.then$BwrC), LINKS.adaptiveBehavior$1YwA), LINKS.adaptationScriptName$XPix));
    tgs.append("(thisJoinPoint);\n");
    tgs.popTextArea();
    if (SPropertyOperations.getEnum(SLinkOperations.getTarget(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.then$BwrC), LINKS.adaptiveBehavior$1YwA), PROPS.typeOfAdaptation$XP5s) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53be3ecc045b44a3L, "WrapperDSL.structure.TypeOfAdaptationEnum"), 0x53be3ecc045b44a5L, "around")) {
      tgs.pushTextArea("advice");
      tgs.append("return false;");
      tgs.newLine();
      tgs.popTextArea();
    }
    tgs.pushTextArea("advice");
    tgs.append("}\n");
    tgs.popTextArea();

    tgs.pushTextArea("methodAdvice");
    tgs.append("public void ");
    tgs.appendNode(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.then$BwrC), LINKS.adaptiveBehavior$1YwA), LINKS.adaptationScriptName$XPix));
    tgs.append("(JoinPoint thisJoinPoint)");
    tgs.newLine();
    tgs.popTextArea();
    tgs.pushTextArea("methodAdvice");
    tgs.append("{\n");
    tgs.popTextArea();
    tgs.pushTextArea("methodAdvice");
    tgs.append("Drone drone = (Drone) thisJoinPoint.getArgs()[0];\n");
    tgs.popTextArea();
    tgs.pushTextArea("methodAdvice");
    tgs.newLine();
    tgs.popTextArea();
    tgs.pushTextArea("methodAdvice");
    transformationOperations.printExceptionalScenarioInLog(ctx.getPrimaryInput(), ctx);
    tgs.newLine();
    tgs.popTextArea();
    tgs.pushTextArea("methodAdvice");
    for (SNode item : SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.then$BwrC), LINKS.adaptiveBehavior$1YwA), LINKS.adaptationScript$Y1Gq), LINKS.body$BmMw)) {
      tgs.appendNode(item);
    }
    tgs.popTextArea();
    tgs.pushTextArea("methodAdvice");
    tgs.append("}\n");
    tgs.popTextArea();

    tgs.pushTextArea("end");
    tgs.append("}");
    tgs.popTextArea();
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$tAp1 = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty typeOfAdaptation$XP5s = MetaAdapterFactory.getProperty(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x4cdb8f81da5c7de7L, 0x4cdb8f81da5c7decL, "typeOfAdaptation");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink when$Bwg0 = MetaAdapterFactory.getContainmentLink(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53be3ecc045a8bc3L, 0x53be3ecc045a8bcfL, "when");
    /*package*/ static final SContainmentLink then$BwrC = MetaAdapterFactory.getContainmentLink(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53be3ecc045a8bc3L, 0x53be3ecc045a8bd2L, "then");
    /*package*/ static final SContainmentLink given$Bwf2 = MetaAdapterFactory.getContainmentLink(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53be3ecc045a8bc3L, 0x53be3ecc045a8bcdL, "given");
    /*package*/ static final SContainmentLink adaptiveBehavior$1YwA = MetaAdapterFactory.getContainmentLink(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53be3ecc045a8bccL, 0x53be3ecc045b45a9L, "adaptiveBehavior");
    /*package*/ static final SReferenceLink adaptationScriptName$XPix = MetaAdapterFactory.getReferenceLink(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x4cdb8f81da5c7de7L, 0x4cdb8f81da5c7df2L, "adaptationScriptName");
    /*package*/ static final SContainmentLink adaptationScript$Y1Gq = MetaAdapterFactory.getContainmentLink(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x4cdb8f81da5c7de7L, 0x4cdb8f81da5c7e5cL, "adaptationScript");
    /*package*/ static final SContainmentLink body$BmMw = MetaAdapterFactory.getContainmentLink(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53be3ecc046e0b54L, 0x53be3ecc0480a64aL, "body");
  }
}