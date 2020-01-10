<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:791815a7-51ee-4ec9-bcc3-2de9ba0316d3(WrapperDSL.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="9" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
        <property id="672037151186491528" name="presentation" index="1L1pqM" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169125989551" name="jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration" flags="ig" index="PlHQZ">
        <child id="1169127546356" name="extends" index="PrDN$" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="5eYfGK4mCJ3">
    <property role="EcuMT" value="6034329596690336707" />
    <property role="TrG5h" value="ExceptionalScenario" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5eYfGK4mCJd" role="1TKVEi">
      <property role="IQ2ns" value="6034329596690336717" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="given" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4mCJa" resolve="Given" />
    </node>
    <node concept="1TJgyj" id="5eYfGK4mCJf" role="1TKVEi">
      <property role="IQ2ns" value="6034329596690336719" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="when" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4mCJb" resolve="When" />
    </node>
    <node concept="1TJgyj" id="5eYfGK4mCJi" role="1TKVEi">
      <property role="IQ2ns" value="6034329596690336722" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="then" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4mCJc" resolve="Then" />
    </node>
    <node concept="PrWs8" id="5eYfGK4n5qM" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mCJa">
    <property role="EcuMT" value="6034329596690336714" />
    <property role="TrG5h" value="Given" />
    <property role="3GE5qa" value="BDD" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5eYfGK4mOkU" role="1TKVEi">
      <property role="IQ2ns" value="6034329596690384186" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="expression" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7_KOYEjbHsX" resolve="ExpressionA" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mCJb">
    <property role="EcuMT" value="6034329596690336715" />
    <property role="TrG5h" value="When" />
    <property role="3GE5qa" value="BDD" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5eYfGK4rwJP" role="1TKVEi">
      <property role="IQ2ns" value="6034329596691614709" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="pointCuts" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="5eYfGK4rwHp" resolve="PointCut" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mCJc">
    <property role="EcuMT" value="6034329596690336716" />
    <property role="TrG5h" value="Then" />
    <property role="3GE5qa" value="BDD" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5eYfGK4mOmD" role="1TKVEi">
      <property role="IQ2ns" value="6034329596690384297" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="adviseScript" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="5eYfGK4rwHk" resolve="AdviseScript" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mCJm">
    <property role="EcuMT" value="6034329596690336726" />
    <property role="TrG5h" value="MathElement" />
    <property role="R5$K7" value="true" />
    <property role="3GE5qa" value="math" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
  </node>
  <node concept="25R3W" id="5eYfGK4mCJv">
    <property role="3F6X1D" value="6034329596690336735" />
    <property role="3GE5qa" value="math" />
    <property role="TrG5h" value="LogicalOperatorEnum" />
    <node concept="25R33" id="5eYfGK4nkaD" role="25R1y">
      <property role="3tVfz5" value="6034329596690514601" />
      <property role="TrG5h" value="and" />
      <property role="1L1pqM" value="and" />
    </node>
    <node concept="25R33" id="5eYfGK4nkaL" role="25R1y">
      <property role="3tVfz5" value="6034329596690514609" />
      <property role="TrG5h" value="or" />
      <property role="1L1pqM" value="or" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mCMr">
    <property role="EcuMT" value="6034329596690336923" />
    <property role="3GE5qa" value="math.expression" />
    <property role="TrG5h" value="ConjunctionLogicalExpression" />
    <node concept="1TJgyj" id="7_KOYEjc9nu" role="1TKVEi">
      <property role="IQ2ns" value="8750727080426116574" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="left" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7_KOYEjbHsX" resolve="ExpressionA" />
    </node>
    <node concept="1TJgyj" id="7_KOYEjc9nw" role="1TKVEi">
      <property role="IQ2ns" value="8750727080426116576" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="right" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7_KOYEjbHsX" resolve="ExpressionA" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mCMs">
    <property role="EcuMT" value="6034329596690336924" />
    <property role="3GE5qa" value="math.expression" />
    <property role="TrG5h" value="DisjunctionLogicalExpression" />
    <node concept="1TJgyj" id="7_KOYEjc9nz" role="1TKVEi">
      <property role="IQ2ns" value="8750727080426116579" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="left" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7_KOYEjbHsX" resolve="ExpressionA" />
    </node>
    <node concept="1TJgyj" id="7_KOYEjc9n_" role="1TKVEi">
      <property role="IQ2ns" value="8750727080426116581" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="right" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7_KOYEjbHsX" resolve="ExpressionA" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mCNt">
    <property role="EcuMT" value="6034329596690336989" />
    <property role="3GE5qa" value="math.expression.conditional_expression" />
    <property role="TrG5h" value="WindConditionalExpression" />
    <node concept="PrWs8" id="7_KOYEjbOoa" role="PzmwI">
      <ref role="PrY4T" node="7_KOYEjbOnV" resolve="ConditionalExpression" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mCNw">
    <property role="EcuMT" value="6034329596690336992" />
    <property role="3GE5qa" value="math.expression.conditional_expression" />
    <property role="TrG5h" value="RegionConditionalExpression" />
    <node concept="PrWs8" id="7_KOYEjbOoc" role="PzmwI">
      <ref role="PrY4T" node="7_KOYEjbOnV" resolve="ConditionalExpression" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mCNz">
    <property role="EcuMT" value="6034329596690336995" />
    <property role="3GE5qa" value="math.expression.conditional_expression" />
    <property role="TrG5h" value="CoordenateConditionalExpression" />
  </node>
  <node concept="25R3W" id="5eYfGK4mOiz">
    <property role="3F6X1D" value="6034329596690384035" />
    <property role="3GE5qa" value="pointcut" />
    <property role="TrG5h" value="TypePointCutEnum" />
    <node concept="25R33" id="5eYfGK4mOi_" role="25R1y">
      <property role="3tVfz5" value="6034329596690384037" />
      <property role="TrG5h" value="around" />
      <property role="1L1pqM" value="Around" />
    </node>
    <node concept="25R33" id="5eYfGK4mOi$" role="25R1y">
      <property role="3tVfz5" value="6034329596690384036" />
      <property role="TrG5h" value="before" />
      <property role="1L1pqM" value="Before" />
    </node>
    <node concept="25R33" id="5eYfGK4mOiC" role="25R1y">
      <property role="3tVfz5" value="6034329596690384040" />
      <property role="TrG5h" value="after" />
      <property role="1L1pqM" value="After" />
    </node>
  </node>
  <node concept="25R3W" id="5eYfGK4mOiI">
    <property role="3F6X1D" value="6034329596690384046" />
    <property role="TrG5h" value="CommandEnum" />
    <node concept="25R33" id="5eYfGK4mOiJ" role="25R1y">
      <property role="3tVfz5" value="6034329596690384047" />
      <property role="TrG5h" value="land" />
      <property role="1L1pqM" value="Land" />
    </node>
    <node concept="25R33" id="5eYfGK4mOiK" role="25R1y">
      <property role="3tVfz5" value="6034329596690384048" />
      <property role="TrG5h" value="safeLand" />
      <property role="1L1pqM" value="Safe Land" />
    </node>
    <node concept="25R33" id="5eYfGK4mOiN" role="25R1y">
      <property role="3tVfz5" value="6034329596690384051" />
      <property role="TrG5h" value="shutDown" />
      <property role="1L1pqM" value="ShutDown" />
    </node>
    <node concept="25R33" id="5eYfGK4mOiR" role="25R1y">
      <property role="3tVfz5" value="6034329596690384055" />
      <property role="TrG5h" value="start" />
      <property role="1L1pqM" value="Start" />
    </node>
    <node concept="25R33" id="5eYfGK4mOiW" role="25R1y">
      <property role="3tVfz5" value="6034329596690384060" />
      <property role="TrG5h" value="stepEast" />
      <property role="1L1pqM" value="Step to East" />
    </node>
    <node concept="25R33" id="5eYfGK4mOj2" role="25R1y">
      <property role="3tVfz5" value="6034329596690384066" />
      <property role="TrG5h" value="stepNearestToDestiny" />
      <property role="1L1pqM" value="Step Nearest To Destination" />
    </node>
    <node concept="25R33" id="5eYfGK4mOj9" role="25R1y">
      <property role="3tVfz5" value="6034329596690384073" />
      <property role="TrG5h" value="stepNearestToOrigem" />
      <property role="1L1pqM" value="Step Nearest To Origem" />
    </node>
    <node concept="25R33" id="5eYfGK4mOjh" role="25R1y">
      <property role="3tVfz5" value="6034329596690384081" />
      <property role="TrG5h" value="stepNearestToWater" />
      <property role="1L1pqM" value="Step Nearest To Water" />
    </node>
    <node concept="25R33" id="5eYfGK4mOjq" role="25R1y">
      <property role="3tVfz5" value="6034329596690384090" />
      <property role="TrG5h" value="stepNearestToLand" />
      <property role="1L1pqM" value="Step Nearest To Land" />
    </node>
    <node concept="25R33" id="5eYfGK4mOj$" role="25R1y">
      <property role="3tVfz5" value="6034329596690384100" />
      <property role="TrG5h" value="stepNearestToPosition" />
      <property role="1L1pqM" value="Step Nearest To Coordenates" />
    </node>
    <node concept="25R33" id="5eYfGK4mOjJ" role="25R1y">
      <property role="3tVfz5" value="6034329596690384111" />
      <property role="1L1pqM" value="Take Off" />
      <property role="TrG5h" value="takeOff" />
    </node>
    <node concept="25R33" id="3fG_nwkIf6A" role="25R1y">
      <property role="3tVfz5" value="3741529733414318502" />
      <property role="TrG5h" value="landed" />
      <property role="1L1pqM" value="Landed" />
    </node>
    <node concept="25R33" id="5eYfGK4mOjV" role="25R1y">
      <property role="3tVfz5" value="6034329596690384123" />
      <property role="TrG5h" value="turnEast" />
      <property role="1L1pqM" value="Turn East" />
    </node>
    <node concept="25R33" id="5eYfGK4mOk8" role="25R1y">
      <property role="3tVfz5" value="6034329596690384136" />
      <property role="TrG5h" value="turnWest" />
      <property role="1L1pqM" value="Turn West" />
    </node>
    <node concept="25R33" id="5eYfGK4mOkm" role="25R1y">
      <property role="3tVfz5" value="6034329596690384150" />
      <property role="TrG5h" value="turnSouth" />
      <property role="1L1pqM" value="Turn South" />
    </node>
    <node concept="25R33" id="5eYfGK4mOk_" role="25R1y">
      <property role="3tVfz5" value="6034329596690384165" />
      <property role="TrG5h" value="turnNorth" />
      <property role="1L1pqM" value="Turn North" />
    </node>
    <node concept="25R33" id="5eYfGK4zLmI" role="25R1y">
      <property role="3tVfz5" value="6034329596693779886" />
      <property role="TrG5h" value="applyEconomyMode" />
      <property role="1L1pqM" value="Economy Mode" />
    </node>
    <node concept="25R33" id="5eYfGK4$UtP" role="25R1y">
      <property role="3tVfz5" value="6034329596694079349" />
      <property role="TrG5h" value="doNothing" />
      <property role="1L1pqM" value="Do Nothing" />
    </node>
    <node concept="25R33" id="1RtkfEL7kmp" role="25R1y">
      <property role="3tVfz5" value="2151965234596496793" />
      <property role="TrG5h" value="returnToHome" />
      <property role="1L1pqM" value="Return to Home" />
    </node>
    <node concept="25R33" id="1RtkfEL7kmH" role="25R1y">
      <property role="3tVfz5" value="2151965234596496813" />
      <property role="TrG5h" value="goDestinyAutomatic" />
      <property role="1L1pqM" value="Automatically go to destination" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mOkW">
    <property role="EcuMT" value="6034329596690384188" />
    <property role="TrG5h" value="Statement" />
    <property role="R5$K7" value="true" />
    <property role="3GE5qa" value="statiment" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
  </node>
  <node concept="1TIwiD" id="5eYfGK4mOmF">
    <property role="EcuMT" value="6034329596690384299" />
    <property role="TrG5h" value="If" />
    <property role="3GE5qa" value="statiment" />
    <ref role="1TJDcQ" node="5eYfGK4mOkW" resolve="Statement" />
    <node concept="1TJgyj" id="5eYfGK4mOpK" role="1TKVEi">
      <property role="IQ2ns" value="6034329596690384496" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="condition" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4qXkq" resolve="Expression" />
    </node>
    <node concept="1TJgyj" id="5eYfGK4mOpM" role="1TKVEi">
      <property role="IQ2ns" value="6034329596690384498" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="body" />
      <ref role="20lvS9" node="5eYfGK4mOkW" resolve="Statement" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4mOmG">
    <property role="EcuMT" value="6034329596690384300" />
    <property role="3GE5qa" value="statiment" />
    <property role="TrG5h" value="While" />
    <ref role="1TJDcQ" node="5eYfGK4mOkW" resolve="Statement" />
    <node concept="1TJgyj" id="5eYfGK4mOni" role="1TKVEi">
      <property role="IQ2ns" value="6034329596690384338" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="condition" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4qXkq" resolve="Expression" />
    </node>
    <node concept="1TJgyj" id="5eYfGK4mOnk" role="1TKVEi">
      <property role="IQ2ns" value="6034329596690384340" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="body" />
      <ref role="20lvS9" node="5eYfGK4mOkW" resolve="Statement" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4oHfV">
    <property role="EcuMT" value="6034329596690879483" />
    <property role="3GE5qa" value="math" />
    <property role="TrG5h" value="Value" />
    <ref role="1TJDcQ" node="5eYfGK4mCJm" resolve="MathElement" />
    <node concept="1TJgyi" id="5eYfGK4oHfW" role="1TKVEl">
      <property role="IQ2nx" value="6034329596690879484" />
      <property role="TrG5h" value="value" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4oHfY">
    <property role="EcuMT" value="6034329596690879486" />
    <property role="3GE5qa" value="math" />
    <property role="TrG5h" value="Text" />
    <ref role="1TJDcQ" node="5eYfGK4mCJm" resolve="MathElement" />
    <node concept="1TJgyi" id="5eYfGK4oHfZ" role="1TKVEl">
      <property role="IQ2nx" value="6034329596690879487" />
      <property role="TrG5h" value="value" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4qp90">
    <property role="EcuMT" value="6034329596691321408" />
    <property role="3GE5qa" value="math.expression.conditional_expression" />
    <property role="TrG5h" value="BatteryConditionalExpression" />
    <node concept="PrWs8" id="7_KOYEjbOo8" role="PzmwI">
      <ref role="PrY4T" node="7_KOYEjbOnV" resolve="ConditionalExpression" />
    </node>
    <node concept="1TJgyj" id="7_KOYEjcw$K" role="1TKVEi">
      <property role="IQ2ns" value="8750727080426211632" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <property role="20kJfa" value="left" />
      <ref role="20lvS9" node="5eYfGK4oHfY" resolve="Text" />
    </node>
    <node concept="1TJgyj" id="7_KOYEjcw$M" role="1TKVEi">
      <property role="IQ2ns" value="8750727080426211634" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="right" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4oHfV" resolve="Value" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4qXkq">
    <property role="EcuMT" value="6034329596691469594" />
    <property role="3GE5qa" value="math.expression" />
    <property role="TrG5h" value="Expression" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" node="5eYfGK4mCJm" resolve="MathElement" />
    <node concept="1TJgyi" id="7_KOYEjaAiW" role="1TKVEl">
      <property role="IQ2nx" value="8750727080425710780" />
      <property role="TrG5h" value="operator" />
      <ref role="AX2Wp" node="5eYfGK4mCJv" resolve="LogicalOperatorEnum" />
    </node>
    <node concept="1TJgyj" id="7_KOYEjaAiY" role="1TKVEi">
      <property role="IQ2ns" value="8750727080425710782" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="left" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4qXkq" resolve="Expression" />
    </node>
    <node concept="1TJgyj" id="7_KOYEjaAj0" role="1TKVEi">
      <property role="IQ2ns" value="8750727080425710784" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="right" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4qXkq" resolve="Expression" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4rwHk">
    <property role="EcuMT" value="6034329596691614548" />
    <property role="3GE5qa" value="advise_script" />
    <property role="TrG5h" value="AdviseScript" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="5eYfGK4rwHy" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="5eYfGK4wapa" role="1TKVEi">
      <property role="IQ2ns" value="6034329596692833866" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="body" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4mOkW" resolve="Statement" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4rwHp">
    <property role="EcuMT" value="6034329596691614553" />
    <property role="TrG5h" value="PointCut" />
    <property role="3GE5qa" value="pointcut" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="5eYfGK4rwH$" role="1TKVEl">
      <property role="IQ2nx" value="6034329596691614564" />
      <property role="TrG5h" value="typePointCut" />
      <ref role="AX2Wp" node="5eYfGK4mOiz" resolve="TypePointCutEnum" />
    </node>
    <node concept="1TJgyi" id="5eYfGK4vf8z" role="1TKVEl">
      <property role="IQ2nx" value="6034329596692591139" />
      <property role="TrG5h" value="call" />
      <ref role="AX2Wp" node="5eYfGK4mOiI" resolve="CommandEnum" />
    </node>
    <node concept="1TJgyj" id="5eYfGK4rwHC" role="1TKVEi">
      <property role="IQ2ns" value="6034329596691614568" />
      <property role="20kJfa" value="adviseScript" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5eYfGK4rwHk" resolve="AdviseScript" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4vsHa">
    <property role="EcuMT" value="6034329596692646730" />
    <property role="3GE5qa" value="statiment" />
    <property role="TrG5h" value="Command" />
    <ref role="1TJDcQ" node="5eYfGK4mOkW" resolve="Statement" />
    <node concept="1TJgyi" id="5eYfGK4x7Cp" role="1TKVEl">
      <property role="IQ2nx" value="6034329596693084697" />
      <property role="TrG5h" value="commandValue" />
      <ref role="AX2Wp" node="5eYfGK4mOiI" resolve="CommandEnum" />
    </node>
  </node>
  <node concept="1TIwiD" id="5eYfGK4z5_4">
    <property role="EcuMT" value="6034329596693600580" />
    <property role="3GE5qa" value="math.expression.conditional_expression" />
    <property role="TrG5h" value="DistanceConditionalExpression" />
  </node>
  <node concept="PlHQZ" id="7_KOYEjbHsX">
    <property role="EcuMT" value="8750727080426002237" />
    <property role="3GE5qa" value="math.expression" />
    <property role="TrG5h" value="ExpressionA" />
  </node>
  <node concept="25R3W" id="7_KOYEjbOnF">
    <property role="3F6X1D" value="8750727080426030571" />
    <property role="3GE5qa" value="math" />
    <property role="TrG5h" value="ConditionalOperatorEnum" />
    <node concept="25R33" id="5eYfGK4mCKX" role="25R1y">
      <property role="3tVfz5" value="6034329596690336829" />
      <property role="TrG5h" value="is" />
      <property role="1L1pqM" value="is" />
    </node>
    <node concept="25R33" id="5eYfGK4mCL3" role="25R1y">
      <property role="3tVfz5" value="6034329596690336835" />
      <property role="TrG5h" value="not_equal_to" />
      <property role="1L1pqM" value="is not" />
    </node>
    <node concept="25R33" id="5eYfGK4mCL6" role="25R1y">
      <property role="3tVfz5" value="6034329596690336838" />
      <property role="TrG5h" value="less_than" />
      <property role="1L1pqM" value="&lt;" />
    </node>
    <node concept="25R33" id="5eYfGK4mCLa" role="25R1y">
      <property role="3tVfz5" value="6034329596690336842" />
      <property role="TrG5h" value="greater_than" />
      <property role="1L1pqM" value="&gt;" />
    </node>
    <node concept="25R33" id="5eYfGK4mCLl" role="25R1y">
      <property role="3tVfz5" value="6034329596690336853" />
      <property role="TrG5h" value="less_than_or_equal_to" />
      <property role="1L1pqM" value="&lt;=" />
    </node>
    <node concept="25R33" id="5eYfGK4mCLf" role="25R1y">
      <property role="3tVfz5" value="6034329596690336847" />
      <property role="TrG5h" value="greater_than_or_equal_to" />
      <property role="1L1pqM" value="&gt;=" />
    </node>
  </node>
  <node concept="PlHQZ" id="7_KOYEjbOnV">
    <property role="TrG5h" value="ConditionalExpression" />
    <property role="3GE5qa" value="math.expression" />
    <property role="EcuMT" value="8750727080425723903" />
    <node concept="1TJgyi" id="7_KOYEjbOn_" role="1TKVEl">
      <property role="IQ2nx" value="8750727080426030565" />
      <property role="TrG5h" value="operator" />
      <ref role="AX2Wp" node="7_KOYEjbOnF" resolve="ConditionalOperatorEnum" />
    </node>
    <node concept="PrWs8" id="7_KOYEjbOnZ" role="PrDN$">
      <ref role="PrY4T" node="7_KOYEjbHsX" resolve="ExpressionA" />
    </node>
  </node>
  <node concept="1TIwiD" id="7_KOYEjcoPy">
    <property role="TrG5h" value="LogicalExpression" />
    <property role="3GE5qa" value="math.expression" />
    <property role="EcuMT" value="8750727080425723899" />
    <node concept="1TJgyj" id="7_KOYEjcoP_" role="1TKVEi">
      <property role="IQ2ns" value="8750727080426179941" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="left" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7_KOYEjbHsX" resolve="ExpressionA" />
    </node>
    <node concept="1TJgyj" id="7_KOYEjcoPA" role="1TKVEi">
      <property role="IQ2ns" value="8750727080426179942" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="right" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7_KOYEjbHsX" resolve="ExpressionA" />
    </node>
    <node concept="1TJgyi" id="7_KOYEjbOnT" role="1TKVEl">
      <property role="IQ2nx" value="8750727080426030585" />
      <property role="TrG5h" value="operator" />
      <ref role="AX2Wp" node="5eYfGK4mCJv" resolve="LogicalOperatorEnum" />
    </node>
    <node concept="PrWs8" id="7_KOYEjbOnx" role="PzmwI">
      <ref role="PrY4T" node="7_KOYEjbHsX" resolve="ExpressionA" />
    </node>
  </node>
</model>
