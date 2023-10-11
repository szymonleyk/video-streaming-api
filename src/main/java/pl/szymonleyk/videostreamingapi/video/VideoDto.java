package pl.szymonleyk.videostreamingapi.video;

import pl.szymonleyk.videostreamingapi.metadata.Metadata;

import java.util.UUID;

public record VideoDto(String content) {
    public static VideoDto from(Video video) {
        return new VideoDto(video.getContent());
    }

    public Video asVideo() {
        return new Video(UUID.randomUUID(), content, null);
    }
}
