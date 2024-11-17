package tn.esprit.nehdi_eya_4twin5.services;

import tn.esprit.nehdi_eya_4twin5.entities.Course;
import tn.esprit.nehdi_eya_4twin5.entities.Instructor;

import java.util.List;

public interface IInstructorServices {
    Instructor addInstructor(Instructor instructor);
        Instructor updateInstructor(Instructor instructor);
    Instructor retrieveInstructor(Long numInstructor);
    List<Instructor> retrieveAll();
    void removeInstructor(Long numInstructor);
    Instructor addInstructorAndAssignToCourses(Instructor instructor, List<Long> numCourses);
    Instructor addAndAssignCourses(Instructor instructor);
}
