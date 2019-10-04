package WrapperDSL.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class Operator_Constraints extends BaseConstraintsDescriptor {
  public Operator_Constraints() {
    super(CONCEPTS.Operator$OS);
  }

  public static class Operator_Property extends BasePropertyConstraintsDescriptor {
    public Operator_Property(ConstraintsDescriptor container) {
      super(PROPS.operator$tn$0, container);
    }
    @Override
    public boolean hasOwnValidator() {
      return true;
    }
    private static final SNodePointer validatePropertyBreakingPoint = new SNodePointer("r:e2ef3765-bd54-4522-bdfb-e74b25d9cd7d(WrapperDSL.constraints)", "3170443572001173733");
    @Override
    public boolean validateValue(SNode node, Object propertyValue, CheckingNodeContext checkingNodeContext) {
      boolean result = staticValidateProperty(node, SPropertyOperations.castString(propertyValue));
      if (!(result) && checkingNodeContext != null) {
        checkingNodeContext.setBreakingNode(validatePropertyBreakingPoint);
      }
      return result;
    }
    private static boolean staticValidateProperty(SNode node, String propertyValue) {
      return ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<String>(), ">", "<", ">=", "<=", "==", "!=")).contains(propertyValue);
    }
  }
  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(PROPS.operator$tn$0, new Operator_Property(this));
    return properties;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Operator$OS = MetaAdapterFactory.getConcept(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898cefa8L, "WrapperDSL.structure.Operator");
  }

  private static final class PROPS {
    /*package*/ static final SProperty operator$tn$0 = MetaAdapterFactory.getProperty(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898cefa8L, 0x2bffada1898cefa9L, "operator");
  }
}