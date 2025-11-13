package ph.edu.auf.emman.yalung.edutrack.model

import com.google.firebase.Timestamp
import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.ServerTimestamp

data class Attendance(
    @DocumentId val id: String = "",
    val studentId: String = "",
    @ServerTimestamp val date: Timestamp? = null,
    val status: String = "absent", 
    val teacherId: String = ""
)