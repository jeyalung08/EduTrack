package ph.edu.auf.emman.yalung.edutrack.viewmodel


import androidx.lifecycle.ViewModel
import ph.edu.auf.emman.yalung.edutrack.repository.AuthRepository


class AuthViewModel(
    private val authRepository: AuthRepository
) : ViewModel() {

    fun onLoginClicked() {
        // viewModelScope.launch {
        //   authRepository.loginUser(email.value, password.value)
        // }
    }

    fun onSignUpClicked() {
        // viewModelScope.launch {
        //   authRepository.signUpUser(email.value, password.value, name.value, role.value)
        // }
    }
}

