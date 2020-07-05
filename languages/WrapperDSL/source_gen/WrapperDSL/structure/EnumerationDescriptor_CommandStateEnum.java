package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_CommandStateEnum extends EnumerationDescriptorBase {

  public EnumerationDescriptor_CommandStateEnum() {
    super(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, "CommandStateEnum", "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/1357676981079261652");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_STARTED_0 = new EnumerationDescriptor.MemberDescriptor("STARTED", "started", 0x12d7700560f441d5L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/1357676981079261653");
  private final EnumerationDescriptor.MemberDescriptor myMember_RESUMED_0 = new EnumerationDescriptor.MemberDescriptor("RESUMED", "resumed", 0x12d7700560f441d6L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/1357676981079261654");
  private final EnumerationDescriptor.MemberDescriptor myMember_CANCELED_0 = new EnumerationDescriptor.MemberDescriptor("CANCELED", "canceled", 0x12d7700560f441d9L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/1357676981079261657");
  private final EnumerationDescriptor.MemberDescriptor myMember_PAUSED_0 = new EnumerationDescriptor.MemberDescriptor("PAUSED", "paused", 0x12d7700560f44223L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/1357676981079261731");
  private final EnumerationDescriptor.MemberDescriptor myMember_ANY_0 = new EnumerationDescriptor.MemberDescriptor("ANY", "any", 0x3069a9862038fd9aL, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/3488505779906477466");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x12d7700560f441d4L, 0x12d7700560f441d5L, 0x12d7700560f441d6L, 0x12d7700560f441d9L, 0x12d7700560f44223L, 0x3069a9862038fd9aL);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_STARTED_0, myMember_RESUMED_0, myMember_CANCELED_0, myMember_PAUSED_0, myMember_ANY_0);

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
      case "STARTED":
        return myMember_STARTED_0;
      case "RESUMED":
        return myMember_RESUMED_0;
      case "CANCELED":
        return myMember_CANCELED_0;
      case "PAUSED":
        return myMember_PAUSED_0;
      case "ANY":
        return myMember_ANY_0;
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