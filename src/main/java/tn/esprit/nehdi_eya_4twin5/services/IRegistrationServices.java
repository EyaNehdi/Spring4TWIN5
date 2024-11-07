package tn.esprit.nehdi_eya_4twin5.services;


import tn.esprit.nehdi_eya_4twin5.entities.Registration;

import java.util.List;

public interface IRegistrationServices {
    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    Registration retrieveRegistration(Long numRegistration);
    List<Registration> retrieveAll();
    void removeRegistration(Long numRegistration);
    Registration addRegistrationAndAssignToSkier(Registration registration,Long numSkier);
    Registration assignRegistrationToCourse(Registration registration,Long numCourse);


}
