[when] Person's name {op:ENUM:Name.equality} like {name} = person : Person( $n : name{op}"{name}" )
[then] Reduce the name = person.setName($name.substring(0,1)