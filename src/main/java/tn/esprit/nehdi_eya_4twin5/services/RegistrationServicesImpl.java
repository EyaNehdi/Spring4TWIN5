package tn.esprit.nehdi_eya_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nehdi_eya_4twin5.entities.Course;
import tn.esprit.nehdi_eya_4twin5.entities.Registration;
import tn.esprit.nehdi_eya_4twin5.entities.Skier;
import tn.esprit.nehdi_eya_4twin5.repositories.ICourseRepository;
import tn.esprit.nehdi_eya_4twin5.repositories.IRegistrationRepository;
import tn.esprit.nehdi_eya_4twin5.repositories.ISkierRepository;

import java.util.List;
@RequiredArgsConstructor
@Service
public class RegistrationServicesImpl implements IRegistrationServices {
    private final IRegistrationRepository registrationRepository;
    private final ISkierRepository skierRepository;
    private final ICourseRepository courseRepository;
    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return registrationRepository.findById(numRegistration).orElse(null);
    }

    @Override
    public List<Registration> retrieveAll() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public void removeRegistration(Long numRegistration) {
registrationRepository.deleteById(numRegistration);
    }

    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier) {
         Skier skier = skierRepository.findById(numSkier)
                .orElse(null);
         registration.setSkier(skier);
        return registrationRepository.save(registration);
    }

    @Override
    public Registration assignRegistrationToCourse(Registration registration, Long numCourse) {
        Course course = courseRepository.findById(numCourse).orElse(null);
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }
}
