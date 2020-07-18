package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_ThermometerStateGetEnum extends EnumerationDescriptorBase {

  public EnumerationDescriptor_ThermometerStateGetEnum() {
    super(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53e04e3aef164a1eL, "ThermometerStateGetEnum", "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490718");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_NEED_CALIBRATION_0 = new EnumerationDescriptor.MemberDescriptor("NEED_CALIBRATION", "NEED CALIBRATION", 0x53e04e3aef164a20L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490720");
  private final EnumerationDescriptor.MemberDescriptor myMember_DEACTIVATED_0 = new EnumerationDescriptor.MemberDescriptor("DEACTIVATED", "DEACTIVATED", 0x53e04e3aef164a21L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490721");
  private final EnumerationDescriptor.MemberDescriptor myMember_ACTIVATED_0 = new EnumerationDescriptor.MemberDescriptor("ACTIVATED", "ACTIVATED", 0x53e04e3aef164a22L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490722");
  private final EnumerationDescriptor.MemberDescriptor myMember_ERROR_0 = new EnumerationDescriptor.MemberDescriptor("ERROR", "ERROR", 0x53e04e3aef164a23L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490723");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53e04e3aef164a1eL, 0x53e04e3aef164a20L, 0x53e04e3aef164a21L, 0x53e04e3aef164a22L, 0x53e04e3aef164a23L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_NEED_CALIBRATION_0, myMember_DEACTIVATED_0, myMember_ACTIVATED_0, myMember_ERROR_0);

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
      case "NEED_CALIBRATION":
        return myMember_NEED_CALIBRATION_0;
      case "DEACTIVATED":
        return myMember_DEACTIVATED_0;
      case "ACTIVATED":
        return myMember_ACTIVATED_0;
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
