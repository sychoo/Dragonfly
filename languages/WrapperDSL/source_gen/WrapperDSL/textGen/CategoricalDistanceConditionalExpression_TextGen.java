package WrapperDSL.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;

public class CategoricalDistanceConditionalExpression_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    String left = "";
    String right = "";
    if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.left$H7qt) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x7970d3ea933fec04L, "WrapperDSL.structure.CategoricalDistanceEnum"), 0x7970d3ea933fec05L, "destination")) {
      left = "drone.getDistanceDestiny()";
    } else {
      left = "drone.getDistanceSource()";
    }
    if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.right$H7p0) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x7970d3ea933fec04L, "WrapperDSL.structure.CategoricalDistanceEnum"), 0x7970d3ea933fec05L, "destination")) {
      right = "drone.getDistanceDestiny()";
    } else {
      right = "drone.getDistanceSource()";
    }

    tgs.append(left);
    tgs.append(SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.operator$H7au).toString());
    tgs.append(right);
  }

  private static final class PROPS {
    /*package*/ static final SProperty left$H7qt = MetaAdapterFactory.getProperty(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x7970d3ea933febfdL, 0x7970d3ea933fec0cL, "left");
    /*package*/ static final SProperty right$H7p0 = MetaAdapterFactory.getProperty(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x7970d3ea933febfdL, 0x7970d3ea933fec09L, "right");
    /*package*/ static final SProperty operator$H7au = MetaAdapterFactory.getProperty(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x7970d3ea933febfdL, 0x7970d3ea933fec00L, "operator");
  }
}