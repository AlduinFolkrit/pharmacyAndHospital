package MyTestProject.FarmacyAndHospital.domain;

import java.util.Date;
import java.util.Map;

public class HospitalUser extends Person {
    String disease;
    Date birthday;
    Address address;
    Map<Drug, String> listOfDrugs;
}