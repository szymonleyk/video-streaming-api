package pl.szymonleyk.videostreamingapi.metadata;

import java.util.UUID;

public record MetadataDto(String title, String synopsis, String director, int yearOfRelease,
                          String genre, int runningTime) {
    public static MetadataDto from(Metadata metadata) {
        return new MetadataDto(metadata.getTitle(), metadata.getSynopsis(), metadata.getDirector(),
                metadata.getYearOfRelease(), metadata.getGenre(), metadata.getRunningTime());
    }

    public Metadata asMetadata() {
        return new Metadata(UUID.randomUUID(), title, synopsis, director, yearOfRelease, genre, runningTime, null);
    }
}
