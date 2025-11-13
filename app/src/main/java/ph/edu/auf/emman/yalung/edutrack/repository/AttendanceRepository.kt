package ph.edu.auf.emman.yalung.edutrack.repository


import ph.edu.auf.emman.yalung.edutrack.firebase.FirestoreService
import ph.edu.auf.emman.yalung.edutrack.model.Attendance


class AttendanceRepository(
    private val firestoreService: FirestoreService
) {
    suspend fun submitAttendanceBatch(records: List<Attendance>) {

    }

}

