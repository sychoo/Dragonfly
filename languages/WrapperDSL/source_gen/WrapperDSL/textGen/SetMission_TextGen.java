package WrapperDSL.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class SetMission_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("if(alreadyExecuting){\n            return;\n        }\n        alreadyExecuting =true;");
    tgs.newLine();
    String count = String.valueOf(SLinkOperations.getChildren(ctx.getPrimaryInput(), LINKS.values$i4O0).size());
    tgs.append("int numberOfMoviments = ");
    tgs.append(count);
    tgs.append(";");
    tgs.newLine();
    tgs.append("final int[] movimentCount = {1};");
    tgs.newLine();
    tgs.append("new StopWatch(0,1000) {");
    tgs.newLine();
    tgs.append("@Override");
    tgs.newLine();
    tgs.append("public void task() {");
    tgs.newLine();
    tgs.append("Platform.runLater(() -> {");
    tgs.newLine();
    tgs.append("switch (movimentCount[0]){");
    tgs.newLine();

    int i = 1;
    for (SNode flyDirection : SLinkOperations.getChildren(ctx.getPrimaryInput(), LINKS.values$i4O0)) {
      tgs.append("case ");
      tgs.append(String.valueOf(i));
      tgs.append(": ");
      tgs.appendNode(flyDirection);
      tgs.append("break;");
      tgs.newLine();
      i++;

    }
    tgs.append("}");
    tgs.newLine();
    tgs.append("movimentCount[0]++;");
    tgs.newLine();
    tgs.append("});");
    tgs.newLine();
    tgs.append("}");
    tgs.newLine();

    tgs.append("            @Override\n            public boolean conditionStop() {\n                if(movimentCount[0] > numberOfMoviments){\n                    return true;\n                }\n                return false;\n            }");
    tgs.append("};");
    tgs.newLine();
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink values$i4O0 = MetaAdapterFactory.getContainmentLink(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x1d2871459dd7639bL, 0x1d2871459dd7639cL, "values");
  }
}