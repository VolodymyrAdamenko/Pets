package solid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ******* Dependency Inversion *******
/**
 * Concept told us that High level modules or classes should not directly depend on Low level modules or classes.
 * They should use interim abstract modules for those dependencies.
 */
public class DependencyInversion {
  public static void main(String[] args) {
    new PowerStation().outPowerProducer(new ElectricalWindMill());

  }
}


/**
 * in this case one class know about another class, which provoke strong coupling. For instance, if
 * we wont to change power producer, we should change a lot in the class. On other hand, we may
 * create interim interface, and inherited in separate classes. Yes of course. And that is a one way.
 * 
 */
//Power station keep tracking
class PowerStation {
  public void outPowerProducer(PowerPlant variablePowerPlant) {
    variablePowerPlant.energyGeneration();
  }
}


interface PowerPlant {
  void energyGeneration();
}


class DieselGenerator implements PowerPlant {
  @Override
  public void energyGeneration() {
    System.out.println("I am generating CO2 emission energy. And adding some NOx");
  }
}


class ElectricalWindMill implements PowerPlant {
  @Override
  public void energyGeneration() {
    System.out.println("I am generating Green energy, with zerro emission");
  }
}
