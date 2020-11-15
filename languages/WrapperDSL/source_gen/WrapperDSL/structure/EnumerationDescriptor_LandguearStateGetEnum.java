package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_LandguearStateGetEnum extends EnumerationDescriptorBase {

  public EnumerationDescriptor_LandguearStateGetEnum() {
    super(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53e04e3aef164a4cL, "LandguearStateGetEnum", "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490764");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_ACTIVATED_0 = new EnumerationDescriptor.MemberDescriptor("ACTIVATED", "ACTIVATED", 0x53e04e3aef164a4dL, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490765");
  private final EnumerationDescriptor.MemberDescriptor myMember_DEACTIVATED_0 = new EnumerationDescriptor.MemberDescriptor("DEACTIVATED", "DEACTIVATED", 0x53e04e3aef164a4eL, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490766");
  private final EnumerationDescriptor.MemberDescriptor myMember_ERROR_0 = new EnumerationDescriptor.MemberDescriptor("ERROR", "ERROR", 0x53e04e3aef164a51L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490769");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53e04e3aef164a4cL, 0x53e04e3aef164a4dL, 0x53e04e3aef164a4eL, 0x53e04e3aef164a51L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_ACTIVATED_0, myMember_DEACTIVATED_0, myMember_ERROR_0);

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
      case "ACTIVATED":
        return myMember_ACTIVATED_0;
      case "DEACTIVATED":
        return myMember_DEACTIVATED_0;
      case "ERROR":
        return myMember_ERROR_0;
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