package tn.esprit.nehdi_eya_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nehdi_eya_4twin5.entities.Instructor;
import tn.esprit.nehdi_eya_4twin5.repositories.IInstructorRepository;

import java.util.List;
@RequiredArgsConstructor
@Service
public class InstructorServicesImpl implements IInstructorServices {
    private final IInstructorRepository instructorRepository;
    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }

    @Override
    public List<Instructor> retrieveAll() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public void removeInstructor(Long numInstructor) {
instructorRepository.deleteById(numInstructor);
    }
}
