package WrapperDSL.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SConcept;

public class ReturnToHome_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    // conditional expression 
    if ((SNodeOperations.getNodeAncestor(ctx.getPrimaryInput(), CONCEPTS.Given$e3, false, false) != null)) {
      SNode performimRTHExpression = (SNode) SNodeOperations.getParent(ctx.getPrimaryInput());
      if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$e63s) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f441d5L, "STARTED") || SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$e63s) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f441d6L, "RESUMED")) {
        tgs.append("(");
        tgs.append("((Drone)thisJoinPoint.getArgs()[0]).isReturningToHome() ");
        transformationOperations.transformOperator(SPropertyOperations.getEnum(performimRTHExpression, PROPS.operation$y8VS).getName(), ctx);
        tgs.append(" true");
        tgs.append(")");

      } else if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$e63s) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f441d9L, "CANCELED") || SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$e63s) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f44223L, "PAUSED")) {
        tgs.append("(");
        tgs.append("((Drone)thisJoinPoint.getArgs()[0]).isReturningToHome() ");
        transformationOperations.transformOperator(SPropertyOperations.getEnum(performimRTHExpression, PROPS.operation$y8VS).getName(), ctx);
        tgs.append(" false");
        tgs.append(")");
      }
    }
    //  
    if ((SNodeOperations.getNodeAncestor(ctx.getPrimaryInput(), CONCEPTS.Then$f1, false, false) != null)) {
      if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$e63s) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f441d5L, "STARTED") || SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$e63s) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f441d6L, "RESUMED")) {
        tgs.append("drone.setReturningToHome( ");
        tgs.append("true");
        tgs.append(");");
        tgs.newLine();

      } else if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$e63s) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f441d9L, "CANCELED") || SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$e63s) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f44223L, "PAUSED")) {
        tgs.append("drone.setReturningToHome( ");
        tgs.append("false");
        tgs.append(");");
        tgs.newLine();
      }
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty operation$y8VS = MetaAdapterFactory.getProperty(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x78c933fd429ad1d9L, 0x78c933fd429ad203L, "operation");
    /*package*/ static final SProperty value$e63s = MetaAdapterFactory.getProperty(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x6e9fd935895a950aL, 0x12d7700560f44228L, "value");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Given$e3 = MetaAdapterFactory.getConcept(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53be3ecc045a8bcaL, "WrapperDSL.structure.Given");
    /*package*/ static final SConcept Then$f1 = MetaAdapterFactory.getConcept(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53be3ecc045a8bccL, "WrapperDSL.structure.Then");
  }
}
