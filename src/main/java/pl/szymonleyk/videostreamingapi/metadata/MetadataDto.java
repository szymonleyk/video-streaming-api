package pl.szymonleyk.videostreamingapi.metadata;

public record MetadataDto(Long id, String title, String synopsis, String director, int yearOfRelease,
                          String genre, int runningTime) {
    public static MetadataDto from(Metadata metadata) {
        return metadata != null ? new MetadataDto(metadata.getId(), metadata.getTitle(), metadata.getSynopsis(), metadata.getDirector(),
                metadata.getYearOfRelease(), metadata.getGenre(), metadata.getRunningTime()) : null;
    }

    public Metadata asMetadata() {
        return new Metadata(id, title, synopsis, director, yearOfRelease, genre, runningTime, null);
    }
}
