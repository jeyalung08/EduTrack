package ph.edu.auf.emman.yalung.edutrack.repository


import ph.edu.auf.emman.yalung.edutrack.firebase.FirestoreService


class StudentRepository(
    private val firestoreService: FirestoreService
) {
    suspend fun getStudentsForClass(classId: String) {

    }
}

