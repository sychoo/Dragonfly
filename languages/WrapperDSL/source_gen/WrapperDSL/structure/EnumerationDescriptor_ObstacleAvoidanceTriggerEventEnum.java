package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_ObstacleAvoidanceTriggerEventEnum extends EnumerationDescriptorBase {

  public EnumerationDescriptor_ObstacleAvoidanceTriggerEventEnum() {
    super(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x341ddc0f5796cc7cL, "ObstacleAvoidanceTriggerEventEnum", "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/3755399622748982396");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_ACTIVATES_0 = new EnumerationDescriptor.MemberDescriptor("ACTIVATES", "ACTIVATES", 0x341ddc0f5796cc7dL, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/3755399622748982397");
  private final EnumerationDescriptor.MemberDescriptor myMember_DEACTIVATES_0 = new EnumerationDescriptor.MemberDescriptor("DEACTIVATES", "DEACTIVATES", 0x341ddc0f5796cc7eL, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/3755399622748982398");
  private final EnumerationDescriptor.MemberDescriptor myMember_any_0 = new EnumerationDescriptor.MemberDescriptor("any", "*", 0x11de48ed5d7ee1d0L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/1287546727787586000");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x341ddc0f5796cc7cL, 0x341ddc0f5796cc7dL, 0x341ddc0f5796cc7eL, 0x11de48ed5d7ee1d0L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_ACTIVATES_0, myMember_DEACTIVATES_0, myMember_any_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return null;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "ACTIVATES":
        return myMember_ACTIVATES_0;
      case "DEACTIVATES":
        return myMember_DEACTIVATES_0;
      case "any":
        return myMember_any_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
