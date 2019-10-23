package WrapperDSL.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNode;

public class SafeLanding_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    if (SNodeOperations.getParent(ctx.getPrimaryInput()) instanceof SNode) {
      tgs.append("safeLanding()");

    } else {
      tgs.append("drone.safeLanding()");
    }

  }
}
