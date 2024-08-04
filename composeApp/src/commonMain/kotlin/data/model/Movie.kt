package data.model

data class Movie(
    val country: String?,
    val genres: List<String>?,
    val id: Int,
    val images: List<String>?,
    val imdbRating: String?,
    val imdbVotes: String?,
    val poster: String?,
    val title: String,
    val year: String?,
    var actors: List<Actor>?,
    val description: String?,
    var runtime: String?,
    var released: String?,
    val director: String?,

    )
