[when]When the sex is {chooseSex:ENUM:Person.sex} = person1:Person(sex == "{chooseSex}")
              [when]When the birth date is after {chooseBirthDate:DATE:default} = person2:Person(birthDay>"{chooseBirthDate}")
              [when]When the person is VIP {chooseVIP:BOOLEAN:false} = person3:Person(vip == "{chooseVIP}")
              [when]When a person exists with social security number {chooseSSN:[0-9]{3}-[0-9][0-9]-\d{4}} = person4:Person(ssn == "{chooseSSN}")

              [when]x There is a {type} named {name} = {name} : {type}()

              [when]x There is a Person with=p:Person()
              [when]- riskLevel less than {riskLevel}=riskLevel < {riskLevel}
              [when]- location is {chooseCity}=city=="{chooseCity}"



              [condition][]user has contact where {constraints}= u : User() and exists (f: Person(where {constraints}) from u.contacts)
              [condition][]first name=firstName
              [condition][]last name=lastName
              [condition][]where {attr:[A-Za-z0-9]+} is "{value}"={attr} == "{value}"
              [condition][]and {attr:[A-Za-z0-9]+} is "{value}"=, {attr} == "{value}"
            
