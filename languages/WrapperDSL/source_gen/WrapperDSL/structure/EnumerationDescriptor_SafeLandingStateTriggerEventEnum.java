package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_SafeLandingStateTriggerEventEnum extends EnumerationDescriptorBase {

  public EnumerationDescriptor_SafeLandingStateTriggerEventEnum() {
    super(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x341ddc0f5796cc0dL, "SafeLandingStateTriggerEventEnum", "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/3755399622748982285");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_STARTS_0 = new EnumerationDescriptor.MemberDescriptor("STARTS", "STARTS", 0x341ddc0f5796cc0fL, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/3755399622748982287");
  private final EnumerationDescriptor.MemberDescriptor myMember_PAUSES_0 = new EnumerationDescriptor.MemberDescriptor("PAUSES", "PAUSES", 0x341ddc0f5796cc10L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/3755399622748982288");
  private final EnumerationDescriptor.MemberDescriptor myMember_CANCELS_0 = new EnumerationDescriptor.MemberDescriptor("CANCELS", "CANCELS", 0x341ddc0f5796cc11L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/3755399622748982289");
  private final EnumerationDescriptor.MemberDescriptor myMember_RESUMES_0 = new EnumerationDescriptor.MemberDescriptor("RESUMES", "RESUMES", 0x341ddc0f5796cc12L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/3755399622748982290");
  private final EnumerationDescriptor.MemberDescriptor myMember_any_0 = new EnumerationDescriptor.MemberDescriptor("any", "*", 0x11de48ed5d7ee1e0L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/1287546727787586016");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x341ddc0f5796cc0dL, 0x341ddc0f5796cc0fL, 0x341ddc0f5796cc10L, 0x341ddc0f5796cc11L, 0x341ddc0f5796cc12L, 0x11de48ed5d7ee1e0L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_STARTS_0, myMember_PAUSES_0, myMember_CANCELS_0, myMember_RESUMES_0, myMember_any_0);

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
      case "STARTS":
        return myMember_STARTS_0;
      case "PAUSES":
        return myMember_PAUSES_0;
      case "CANCELS":
        return myMember_CANCELS_0;
      case "RESUMES":
        return myMember_RESUMES_0;
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
