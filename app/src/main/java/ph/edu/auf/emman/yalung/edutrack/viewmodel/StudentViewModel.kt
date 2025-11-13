package ph.edu.auf.emman.yalung.edutrack.viewmodel


import androidx.lifecycle.ViewModel
import ph.edu.auf.emman.yalung.edutrack.repository.StudentRepository


class StudentViewModel(
    private val studentRepository: StudentRepository
) : ViewModel() {

    // StateFlow to hold the list of students

    fun loadStudents(classId: String) {
        // viewModelScope.launch {
        //   _students.value = studentRepository.getStudentsForClass(classId)
        // }
    }
}

