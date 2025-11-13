package ph.edu.auf.emman.yalung.edutrack.model

import com.google.firebase.firestore.DocumentId

data class Teacher(

    @DocumentId val id: String = "",
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val role: String = "teacher",
    val classList: List<String> = emptyList()
)