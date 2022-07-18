package guru.springframework.sfgpetclinic.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class PetType implements Serializable {

  private String name;

}
