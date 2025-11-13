package ph.edu.auf.emman.yalung.edutrack.viewmodel


import androidx.lifecycle.ViewModel
import ph.edu.auf.emman.yalung.edutrack.repository.AttendanceRepository


class AttendanceViewModel(
    private val attendanceRepository: AttendanceRepository
) : ViewModel() {

    fun markAsPresent(studentId: String) {
        // ...
    }

    fun markAsLate(studentId: String) {
        // ...
    }

    fun submitAttendance() {
        // viewModelScope.launch {
        //   val records = ... create List<Attendance> from state
        //   attendanceRepository.submitAttendanceBatch(records)
        // }
    }
}

