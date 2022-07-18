package guru.springframework.sfgpetclinic.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class Person implements Serializable {

  private String firstName;
  private String lastName;

}
