package ph.edu.auf.emman.yalung.edutrack.model

import com.google.firebase.firestore.DocumentId

data class Parent(
    @DocumentId val id: String = "",
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val role: String = "parent",
    val phoneNumber: String = "",
    val address: String = "",
    val linkedStudentIds: List<String> = emptyList()
) {

    fun isValidPhoneNumber(): Boolean {
        return (phoneNumber.startsWith("+639") && phoneNumber.length == 13) ||
                (phoneNumber.startsWith("09") && phoneNumber.length == 11)
    }
}