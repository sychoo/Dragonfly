package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_MagnetometerStateSetEnum extends EnumerationDescriptorBase {

  public EnumerationDescriptor_MagnetometerStateSetEnum() {
    super(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53e04e3aef1649e3L, "MagnetometerStateSetEnum", "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490659");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_ACTIVATE_0 = new EnumerationDescriptor.MemberDescriptor("ACTIVATE", "ACTIVATE", 0x53e04e3aef1649e5L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490661");
  private final EnumerationDescriptor.MemberDescriptor myMember_DEACTIVATE_0 = new EnumerationDescriptor.MemberDescriptor("DEACTIVATE", "DEACTIVATE", 0x53e04e3aef1649e6L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490662");
  private final EnumerationDescriptor.MemberDescriptor myMember_CALIBRATE_0 = new EnumerationDescriptor.MemberDescriptor("CALIBRATE", "CALIBRATE", 0x53e04e3aef1649e7L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/6043916714957490663");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x53e04e3aef1649e3L, 0x53e04e3aef1649e5L, 0x53e04e3aef1649e6L, 0x53e04e3aef1649e7L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_ACTIVATE_0, myMember_DEACTIVATE_0, myMember_CALIBRATE_0);

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
      case "ACTIVATE":
        return myMember_ACTIVATE_0;
      case "DEACTIVATE":
        return myMember_DEACTIVATE_0;
      case "CALIBRATE":
        return myMember_CALIBRATE_0;
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
