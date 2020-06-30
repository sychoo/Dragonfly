package WrapperDSL.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class CollisionSensorConditionalExpression_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("((Drone)thisJoinPoint.getArgs()[0]).getCollisionState() ");
    transformationOperations.transformOperator(SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.operators$ZMbu).toString(), ctx);
    tgs.append(" CollisionStateEnum.");
    tgs.append(SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.right$ZMbX).getName().toUpperCase());
    tgs.append(")");
    tgs.newLine();
  }

  private static final class PROPS {
    /*package*/ static final SProperty operators$ZMbu = MetaAdapterFactory.getProperty(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x3069a986202aaa71L, 0x3069a986202aaa74L, "operators");
    /*package*/ static final SProperty right$ZMbX = MetaAdapterFactory.getProperty(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x3069a986202aaa71L, 0x3069a986202aaa75L, "right");
  }
}