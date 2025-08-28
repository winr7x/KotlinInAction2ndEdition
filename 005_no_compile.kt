suspend fun loadAndOverlay(first: String, second: String): Image =
    coroutineScope {
        val firstDeferred = async { loadImage(first) }
        val secondDeferred = async { loadImage(second) }
        val combinedImage = combineImages(firstDeferred.await(), secondDeferred.await())
    }
