package WrapperDSL.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;

public class SafeLand_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$8reH) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f441d5L, "STARTED") || SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.value$8reH) == SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "WrapperDSL.structure.CommandStateEnum"), 0x12d7700560f441d6L, "RESUMED")) {
      tgs.append("DroneBusinessObject.getInstance().safeLanding(drone);");
      tgs.newLine();
      tgs.append("DroneBusinessObject.getInstance().landing(drone);");
      tgs.newLine();
      tgs.append("DroneBusinessObject.getInstance().landed(drone);");
      tgs.newLine();
      tgs.append("DroneBusinessObject.getInstance().shutDown(drone);");
      tgs.newLine();
      tgs.append("((DroneViewImpl)DroneController.getInstance().getDroneViewFrom(drone.getUniqueID())).applyStyleNormalConnection();");
      tgs.newLine();




    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty value$8reH = MetaAdapterFactory.getProperty(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x4f78da14d91a0524L, 0x12d7700560f441ecL, "value");
  }
}