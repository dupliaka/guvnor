[when]EnumFact with=var2 : EnumFact()
[when]- fieldString1 {$value:ENUM:EnumFact.fieldString1}=fieldString1 == "{$value}"
[when]- fieldString2 {$value:ENUM:EnumFact.fieldString2}=fieldString2 == "{$value}"
[when]- fieldInteger1 {$value:ENUM:EnumFact.fieldInteger1}=fieldInteger1 == {$value}
[when]- fieldInteger2 {$value:ENUM:EnumFact.fieldInteger2}=fieldInteger2 == {$value}
[then]Set EnumFact.fieldString1 to {$value:ENUM:EnumFact.fieldString1}=var2.setFieldString1( "{$value}" );
[then]Set EnumFact.fieldString2 to {$value:ENUM:EnumFact.fieldString2}=var2.setFieldString2( "{$value}" );
[then]Set EnumFact.fieldInteger1 to {$value:ENUM:EnumFact.fieldInteger1}=var2.setFieldInteger1( {$value} );
[then]Set EnumFact.fieldInteger2 to {$value:ENUM:EnumFact.fieldInteger2}=var2.setFieldInteger2( {$value} );
