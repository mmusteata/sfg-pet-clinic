package guru.springframework.sfgpetclinic.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class Pet implements Serializable {

  private PetType petType;
  private Owner owner;
  private LocalDate birthDay;

}
