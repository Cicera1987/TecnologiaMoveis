package TDE

sealed class Result {
    class Success(val data: String) : Result()
    class Error(val message: String) : Result()
    object Loading : Result()
}