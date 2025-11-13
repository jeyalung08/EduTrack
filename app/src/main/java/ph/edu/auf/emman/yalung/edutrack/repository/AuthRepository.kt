package ph.edu.auf.emman.yalung.edutrack.repository

import ph.edu.auf.emman.yalung.edutrack.firebase.AuthService
import ph.edu.auf.emman.yalung.edutrack.firebase.FirestoreService

// AuthRepository uses the AuthService and FirestoreService
class AuthRepository(
    private val authService: AuthService,
    private val firestoreService: FirestoreService
) {

    suspend fun loginUser(email: String, password: String) {
        // const uid = await authService.signIn(email, password)
        // const role = await firestoreService.getUserRole(uid)
        // return role
    }


    suspend fun signUpUser(email: String, password: String, name: String, role: String) {
        // const uid = await authService.signUp(email, password)
        // await firestoreService.createUser(uid, name, email, role)
    }


    fun logoutUser() {
        // authService.signOut()
    }
}

