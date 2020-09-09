[when]There is an Person with name of "{name}" and older than {age}=p: Person(name=="{name}",age > {age})
[then]Log : "{message}"=System.out.println("{message}");
[then]Set age of Person to {value}=p.setAge({value});
[when]There is a Person with age equals to {age}=p:Person(age == {age})
[when]oorr=or
[when]There is a Cheese with=c:Cheese()
[when]- price is less than {pri}=price < {pri}
[when]- name is "{name}"=type == "{name}"