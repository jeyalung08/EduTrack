package ph.edu.auf.emman.yalung.edutrack.model

import com.google.firebase.firestore.DocumentId

data class Student(
    @DocumentId val id: String = "",
    val firstName: String = "",
    val lastName: String = "",
    val classId: String = "",
    val parentId: String = ""
)