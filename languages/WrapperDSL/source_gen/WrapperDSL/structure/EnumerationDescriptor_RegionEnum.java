package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_RegionEnum extends EnumerationDescriptorBase {

  public EnumerationDescriptor_RegionEnum() {
    super(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x72508e21f03ae4a3L, "RegionEnum", "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/8237239994876093603");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_land_0 = new EnumerationDescriptor.MemberDescriptor("land", "land", 0x72508e21f03ae4a4L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/8237239994876093604");
  private final EnumerationDescriptor.MemberDescriptor myMember_water_0 = new EnumerationDescriptor.MemberDescriptor("water", "water", 0x72508e21f03ae4a5L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/8237239994876093605");
  private final EnumerationDescriptor.MemberDescriptor myMember_destination_0 = new EnumerationDescriptor.MemberDescriptor("destination", "destination", 0x72508e21f03bed38L, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/8237239994876161336");
  private final EnumerationDescriptor.MemberDescriptor myMember_origin_0 = new EnumerationDescriptor.MemberDescriptor("origin", "origin", 0x72508e21f03bed3cL, "r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)/8237239994876161340");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x3e1c68c4ebe640bdL, 0xa27fe74585aa2487L, 0x72508e21f03ae4a3L, 0x72508e21f03ae4a4L, 0x72508e21f03ae4a5L, 0x72508e21f03bed38L, 0x72508e21f03bed3cL);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_land_0, myMember_water_0, myMember_destination_0, myMember_origin_0);

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
      case "land":
        return myMember_land_0;
      case "water":
        return myMember_water_0;
      case "destination":
        return myMember_destination_0;
      case "origin":
        return myMember_origin_0;
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