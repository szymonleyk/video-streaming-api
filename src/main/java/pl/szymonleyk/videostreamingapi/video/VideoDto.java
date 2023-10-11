package pl.szymonleyk.videostreamingapi.video;

import pl.szymonleyk.videostreamingapi.metadata.MetadataDto;

public record VideoDto(Long id, String content, MetadataDto metadata) {
    public static VideoDto from(Video video) {
        return new VideoDto(video.getId(), video.getContent(), MetadataDto.from(video.getMetadata()));
    }

    public Video asVideo() {
        return new Video(id, content, true, null);
    }
}
